package fuxi;



//队列
class Node{
    public int data;
    public Node next;
    public Node(){
    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}


public class MyQueue {
    public Node front;
    public Node rear;
    public void offer(int data){
        Node node=new Node(data);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
            return;
        }
        this.rear.next=node;
        this.rear=node;
    }

    public int poll(){
        if(empty()){
            throw new RuntimeException("队列为空");
        }
        int data=this.front.data;
        this.front=this.front.next;
        return data;
    }


    public int peek(){
        return this.front.data;
    }


    public boolean empty(){
        if(front==null){
            return true;
        }
        return false;
    }

}
