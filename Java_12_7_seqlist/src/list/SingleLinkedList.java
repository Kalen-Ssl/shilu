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
    public Node getFirst(){
        return first;
    }

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

    //遍历
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

    //在任意位置插入结点
    public void insert(int index,int data){
        if(index<0||index>size){
            System.out.println("索引非法");
            return;
        }
        if(index==size){
            addLast(data);
        }else if(index==0){
            addFirst(data);
        }else {
            //在中间位置插入新节点
            Node newNode = new Node(data, null);
            //找到需要待插入的位置的前驱结点
            Node prev = getIndexNode(index - 1);
            newNode.next = prev.next;
            prev.next = newNode;
            size++;
        }

    }




    //回文链表
    public Node reverse(Node head){
        if(head==null||head.next==null){
            return head;
        }
        Node newHead=new Node(head.getData(),null);
        while(head.next!=null){
            //产生新节点
            Node node=new Node(head.next.getData(),null);
            node.next=newHead;
            newHead=node;
            head=head.next;
        }
        return newHead;
    }


    //根据用户传入的索引值获取结点值
    public int get(int index){
        if(rangeCheck(index)){
            Node node=getIndexNode(index);
            return node.getData();
      }
      return -1;
    }


    //修改指定位置的节点为index
    public void set(int index,int data){
        if(rangeCheck(index)){
            Node node=getIndexNode(index);
            node.setData(data);
            //getIndexNode(index).setData(data);
        }
    }


    //查询链表中是否有指定内容结点
    public boolean contains(int data){
        //遍历链表
        Node temp=first;
        while(temp!=null){
            if(temp.getData()==data) {
                System.out.println("找到指定元素");
               return true;
            }
            temp=temp.next;
        }
        System.out.println("未找到指定元素");
        return false;
    }

   //删除第一个想删除的节点
    public void remove(int data){
//        if(first.getData()==data){
//            first=first.next;
//            size--;
//            return;
//        }else{
//            Node prev=first;
//            while(prev.next!=null){
//                if(prev.next.getData()==data)
//                {
//                    prev.next=prev.next.next;
//                    size--;
//                    return;
//                }
//                prev=prev.next;
//            }
//        }
        //虚拟头结点法
        Node dummyHead=new Node(data-1,null);
        dummyHead.next=first;
        Node temp=dummyHead;
        while(temp.next!=null){
            if(temp.next.getData()==data){
                temp.next=temp.next.next;
                size--;
                break;
            }else {
                temp = temp.next;
            }
        }
         first=dummyHead.next;
    }


    //找到指定结点
    public Node getIndexNode(int index){
        Node temp=first;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }


   //判断索引
    private boolean rangeCheck(int index){
        if(index<0||index>=size){
            System.out.println("索引非法");
            return false;
        }
        return true;
    }

}
