package fuxi3;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

class ListNode{
    int val;
    ListNode next=null;
    public ListNode(int val){
        this.val=val;
    }
}

public class fuxi0904 {

    //反转链表
    public ListNode ReverseList(ListNode head){
        ListNode newhead=null;
        ListNode currenthead=head;
        if(head==null||head.next==null){
            return head;
        }
        while(currenthead!=null){
            ListNode next=currenthead.next;
            currenthead.next=newhead;
            newhead=currenthead;
            currenthead=next;
        }
        return newhead;
    }

    //判断是否是合法的括号
    public static void main4(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n=s.length();
        if(chack(s,n)==true){
            System.out.println("是合法的括号");
        }else{
            System.out.println("不是合法的括号");
        }
    }

    public static boolean chack(String s,int n){
        Stack<Character> stack=new Stack<Character>();
        if(s==null||s.length()!=n){
            return false;
        }
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('){
                stack.push(s.charAt(i));
            }else if(s.charAt(i)==')'){
                if(stack==null){
                    return false;
                }else{
                    stack.pop();
                }

            }else{
                return false;
            }
        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }


//合法的括号对数
    public static void main1(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        String s = sc.nextLine();
        int n=s.length();
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            } else{
                stack.pop();
                num=num+1;
            }
        }
        System.out.println(num);
    }



//求素数个数
    public static void main2(String[] args){
        int i,j;
        int num=0;
        for(i=101;i<=200;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }else{
                    if(j==i-1){
                        System.out.println(i+" ");
                        num++;
                    }
                }
            }

        }
        System.out.println(num+"个");
    }

}











