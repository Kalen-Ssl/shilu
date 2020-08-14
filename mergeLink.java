package fuxi;
//合并 有序单链表
class Node{
    int data;
    Node next;
    public Node(int data){
    this.data=data;
    }
}

public class mergeLink {
    public static Node Merge(Node n1, Node n2) {
        if (n1 == null) {
            return n2;
        }
        if (n2 == null) {
            return n1;
        }

        Node head, temp;
        if (n1.data < n2.data) {
            temp = n1;
            n1 = n1.next;
        } else {
            temp = n2;
            n2 = n2.next;
        }
        head = temp;

        while (n1 != null && n2 != null) {
            if (n1.data < n2.data) {
                temp.next = n1;
                n1 = n1.next;
            } else {
                temp.next = n2;
                n2 = n2.next;
            }
            temp = temp.next;
        }
        if (n1 == null) {
            temp.next = n2;
        }
        if (n2 == null) {
            temp.next = n1;
        }
        return head;
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node3;
        node3.next = node5;
        node2.next = node4;
        Node node = Merge(node1, node2);
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }
}



//
//class Node{
//    public int data;
//    public Node next;
//    public Node(int data){
//        this.data=data;
//    }
//
//}
//
//
//
//public class hebinglianbiao {
//
//    public static Node merga(Node head1,Node head2){
//        if(head1==null||head2==null){
//            return head1!=null?head1:head2;
//        }
//        Node head=head1.data<head2.data?head1:head2;
//        Node cur1=head==head1?head1:head2; //head1
//        Node cur2=head==head1?head2:head1;//head2
//
//        Node pre=null;//cur1的前一个元素
//        Node next=null;//cur2的后一个元素
//
//        while(cur1!=null&&cur2!=null){
//            if(cur1.data<cur2.data){
//                pre=cur1;
//                cur1=cur1.next;
//            }else{
//                next=cur2.next;
//                pre.next=cur2;
//                cur2.next=cur1;
//                pre=cur2;
//                cur2=next;
//            }
//        }
//        pre.next=cur1==null?cur2:cur1;
//        return head;
//    }
//
//
//
//    public static void main(String[] args) {
//        Node node1=new Node(1);
//        Node node2=new Node(2);
//        Node node3=new Node(3);
//        Node node4=new Node(4);
//        Node node5=new Node(5);
//        node1.next=node3;
//        node3.next=node5;
//        node2.next=node4;
//        Node node=merga(node1,node2);
//        while(node!=null){
//            System.out.println(node.data+" ");
//            node=node.next;
//        }
//
//    }
//}
//
