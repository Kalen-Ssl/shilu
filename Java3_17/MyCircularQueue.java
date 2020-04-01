package test;
//循环队列
class MyCircularQueue {

    private  int front;;
    private  int rear;
    private  int[] elem;

    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.elem=new int[k+1];
        this.front=0;
        this.rear=0;
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()){
            return false;
        }
        this.elem[this.rear]=value;
        this.rear=(this.rear+1)%this.elem.length;
        return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        this.front=(this.front+1)%this.elem.length;
        return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
       if(isEmpty()){
           return -1;
       }else{
           return this.elem[this.front];
       }
    }

    /** Get the last item from the queue. */
    public int Rear() {
       if(isEmpty()){
           return -1;
       }else{
           int index=(this.rear==0)?this.elem.length-1:this.rear-1;
           return this.elem[index];
       }
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
       if(this.front==this.rear){
           return true;
       }
       return false;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
       if((this.rear+1)%this.elem.length==this.front){
           return true;
       }
       return false;
    }
}
