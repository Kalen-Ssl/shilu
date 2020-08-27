package fuxi2;


class ListNode{
    int val;
    ListNode next=null;
    ListNode(int val){
        this.val=val;
    }
}

public class addInList {
    public ListNode add(ListNode head1,ListNode head2){
        if(head1==null) return head2;
        if(head2==null) return head1;
        ListNode l1=reverse(head1);
        ListNode l2=reverse(head2);
        ListNode result = new ListNode(-1);
        int flag=0;
        while(l1!=null&&l2!=null){
            int val=l1.val+l2.val+flag;
            flag=val/10;
            ListNode tmp = new ListNode(val%10);
            tmp.next = result.next;
            result.next = tmp;
            l1 = l1.next;
            l2 = l2.next;
        }
        if(l1 == null){
            while(l2 != null){
                int val = l2.val + flag;
                flag = val/10;
                ListNode tmp = new ListNode(val%10);
                tmp.next = result.next;
                result.next = tmp;
                l2 = l2.next;
            }
        }
        if(l2 == null){
            while(l1 != null){
                int val = l1.val + flag;
                flag = val/10;
                ListNode tmp = new ListNode(val%10);
                tmp.next = result.next;
                result.next = tmp;
                l1 = l1.next;
            }
        }
        if(flag == 1){
            ListNode tmp = new ListNode(flag);
            tmp.next = result.next;
            result.next = tmp;
        }
        return result.next;
    }
    public ListNode reverse(ListNode head){
        if(head == null) return head;
        ListNode pre = new ListNode(-1);
        while(head!= null){
            ListNode tmp = head.next;
            head.next = pre.next;
            pre.next = head;
            head = tmp;
        }
        return pre.next;
    }
}







