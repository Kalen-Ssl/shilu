package fuxi;


public class LinkLoop {

    public static boolean isLoop(Node head){
        Node slow = head.next;
        Node fast = head.next.next;
        if(slow == null || fast == null){
            return false;
        }
        while(slow.next != null){

            // 只有 两个节点
            if(fast.next == null){
                return false;
            }
            // 如果slow的数据域和fast的数据域相同，则表示有环
            if(slow.data == fast.data){
                return true;
            }
            // slow指针走一步，fast走两步
            slow = slow.next;
            fast = fast.next.next;

            //如果fast走到最后为空，表示没有环
            if(fast == null){
                return false;
            }
        }
        return false;
    }



    public static void main(String[] args) {
        // 构造链表 1->2->3->4->5->6-4;
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = d;
        System.out.println(isLoop(a));

    }

}
