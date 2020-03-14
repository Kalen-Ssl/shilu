package test;

class Node{
    public int data;
    public Node next;
    public  Node(){

    }
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class MyQueue {
    public Node front;//队头
    public Node rear;//队尾


    public void offer(int data) {
        Node node = new Node(data);
        if (this.front == null) {
            this.front = node;
            this.rear = node;
            return;
        }
        this.rear.next = node;
        this.rear = node;
    }

    public int poll(){
        if(empty()){
            throw new RuntimeException("队列为空");
        }
        int data=this.front.data;
        this.front=this.front.next;
        return data;
    }

    public Node peek(){
        return this.front;
    }


    public boolean empty(){
        if(front==null){
            return true;
        }
        return false;
    }



}






