
/*
public class ListNode{
  int val;
  ListNode next=null;

  ListNode(int val){
  this.val=val;
}
*/

public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        ListNode node = new ListNode(-1);//虚拟节点
        ListNode tmp = node;
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                tmp.next = list1;
                list1 = list1.next;
                tmp = tmp.next;
            }else {
                tmp.next = list2;
                list2 = list2.next;
                tmp = tmp.next;
            }
        }
        //循环走到这里-》1、list1 == null   2、list2 == nul
        if(list1 != null) {
            tmp.next = list1;
        }
        if(list2 != null) {
            tmp.next = list2;
        }
        return node.next;
    }
}
