package list;

/**
 * @proargm: Java_12_6_seqlist
 * @description:
 * @author:shilu
 * @create: 2019--06 15:15
 **/

//Nodle类可以看作车厢
class Node{
     private int data;
     Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}


//火车
public class SingleLinkedList {
    private int size;
    private Node last;
    private Node first;

    //默认给用户调用尾插法
    public void add(int data){
        addLast(data);
    }


    //头插法
    public void addFirst(int data){
        Node node=new Node(data,null);
        if(first==null){
            first=last=node;
            size++;
            return;
        }
        node.next=first;
        first=node;
        size++;
    }

    //尾插法
    public void addLast(int data){
        Node node=new Node(data,null);
        if(last==null){
            first=last=node;
            size++;
            return;
        }
        last.next=node;
        last=node;
        size++;
    }

    //遍历(此处为何要用临时变量）
    public void print(){
        Node temp=first;
        while(temp!=null){
            System.out.println(temp.getData());
             temp=temp.next;
        }
        /*
        for(Node x=first;x!=null;x=x.next){
            System.out.println(x.getData()+"、");
        }
        */
    }


}
