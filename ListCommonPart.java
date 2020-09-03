package fuxi;

//打印两个有序链表的公共部分
//当head1和head2
public class ListCommonPart {
    public static class Node{
        int val;
        Node next;
        public Node(int val){
            this.val=val;
        }
    }

    public static void printCommonPart(Node head1, Node head2){
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                head1=head1.next;
            }else if(head1.val>head2.val){
                head2=head2.next;
            }
            else{
                System.out.println(head1.val+" ");
                head1=head1.next;
                head2=head2.next;
            }
        }
    }

    public static void main(String[] args) {
        Node node=new Node(1);
        Node node1=new Node(11);
        Node node2=new Node(23);
        Node node3=new Node(25);
        Node node4=new Node(65);
        Node node5=new Node(11);
        Node node6=new Node(17);
        Node node7=new Node(23);
        Node node8=new Node(65);
        node.next=node1;
        node1.next=node2;
        node2.next=node3;
        node3.next=node4;
        node5.next=node6;
        node6.next=node7;
        node7.next=node8;
        printCommonPart(node,node5);


    }
}
