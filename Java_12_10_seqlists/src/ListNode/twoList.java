package ListNode;

public class twoList {
      //给定一个链表，删除其中的重复元素
      public ListNode newList(ListNode head){
          if(head==null&&head.next==null){
              return head;
          }
          ListNode temp=head;
          while(temp.next!=null){
              if(temp.val!=temp.next.val){
                  temp=temp.next;
              }
              else{
                  temp.next=temp.next.next;
              }
          }
          return head;

      }

}
