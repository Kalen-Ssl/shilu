package list;


public class Test {
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.add(1);
        s.add(2);
        s.add(3);

        //此时头结点已经变成3
        //输出
        Node temp= s.reverse(s.getFirst());
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.next;
        }

    }

}
