package days;

//链式A+B

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class day19_1 {
    public ListNode plusAB(ListNode a, ListNode b) {
        ListNode ret = new ListNode(-1);
        ListNode result = ret;
        int up = 0;
        while(a != null && b != null)
        {
            int sum = a.val + b.val + up;
            if(sum > 9)
            {
                up = 1;
                ret.next = new ListNode(sum - 10);
            }
            else
            {
                up = 0;
                ret.next = new ListNode(sum);
            }
            ret = ret.next;
            a = a.next;
            b = b.next;
        }
        if(a != null)
        {
            ListNode newNode = a.next;
            ret.next = new ListNode(a.val + up);
            ret.next.next = newNode;
        }
        else if(b != null)
        {
            ListNode newNode = b.next;
            ret.next = new ListNode(b.val + up);
            ret.next.next = newNode;
        }
        else
        {
            if(up == 1)
            {
                ret.next = new ListNode(1);
            }
        }
        return result.next;
    }
}
