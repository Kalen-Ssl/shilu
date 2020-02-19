
public class Test {
    public static void main(String[] args) {
        DoubleLinkedList dl = new DoubleLinkedList();
        dl.addLast(1);
        dl.addLast(1);
        dl.addLast(1);
        dl.addLast(2);
        dl.addLast(3);
        dl.addLast(4);
        dl.removeAll(1);
        dl.print();
    }
}
