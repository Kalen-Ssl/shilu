package fuxi3;

import java.util.*;

public class fuxi0910 {
    //合并链表
    public ListNode Merge(ListNode list1, ListNode list2) {
        ListNode head = new ListNode(-1);
        head.next = null;
        ListNode root = head;
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                head.next = list1;
                head = list1;
                list1 = list1.next;
            } else {
                head.next = list2;
                head = list2;
                list2 = list2.next;
            }
        }
        if (list1 != null) {
            head.next = list1;
        }
        if (list2 != null) {
            head.next = list2;
        }
        return root.next;
    }


    //删除字符
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Character> queue = new LinkedList<>();
        int n = -1, m;
        int num = 0;
        String str = sc.nextLine();
        if (str.length() == 1) {
            queue.add(str.charAt(0));
            System.out.println(queue.add(str.charAt(0)));
            return;
        }
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) != str.charAt(i + 1) &&) {
                queue.add(str.charAt(i));
            }
        }
        if (str.charAt(str.length() - 2) != str.charAt(str.length() - 1)) ;
        {
            queue.add(str.charAt(str.length() - 1));
        }


        if (queue.isEmpty()) {
            System.out.println("no");
        } else {
            while (!queue.isEmpty()) {
                System.out.print(queue.poll());
            }
        }
    }

   //最小子序列
    public String getMinString(String str1,String str2){
      if(str2==null||str2.length()==0){
          return str1;
      }
      int[] strA=new int[128];
      int[] strB=new int[128];
      int left=0,right=0;
      for(int i=0;i<str1.length();i++){
          strA[str1.charAt(i)]++;
      }
      for(int i=0;i<str2.length();i++){
          strB[str2.charAt(i)]++;
      }
      for(int k=0;k<str2.length();k++){
          if(strA[str2.charAt(k)]<strB[str2.charAt(k)]){
              return "";
          }
      }
      for(int k=str1.length()-1;k>=0;k--){
          if(--strA[str1.charAt(k)]<strB[str1.charAt(k)]){
              left=k;
              break;
          }
      }
        for(int k=str1.length()-1;k>=0;k--){
            if(--strA[str1.charAt(k)]<strB[str1.charAt(k)]){
                right=k;
                break;
            }
        }

        return str1.substring(left,right+1);
    }
}






