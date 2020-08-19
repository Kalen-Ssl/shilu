package fuxi;

//两个单链表相交的起始节点
class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
 }
public class LinkDo {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA = 0;
        int lenB = 0;
        ListNode listA = headA;
        ListNode listB = headB;

        while (listA != null) {
            listA = listA.next;
            lenA++;
        }
        while (listB != null) {
            listB = listB.next;
            lenB++;
        }

        int diff;
        if(lenA > lenB) {
            diff = lenA - lenB;
            while (diff > 0) {
                diff--;
                headA = headA.next;
            }
        } else {
            diff = lenB - lenA;
            while (diff > 0) {
                diff--;
                headB = headB.next;

            }
        }

        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }

            headA = headA.next;
            headB = headB.next;
        }

        return null;
    }
}