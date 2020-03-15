package test;


import java.util.Scanner;
import java.util.Stack;

public class KuoHTest {

    public  static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            //如果是左括号入栈
            if(s.charAt(i) == '(' || s.charAt(i) == '['|| s.charAt(i) == '{') {
                stack.push(s.charAt(i));
            }else {
                //右括号
                if(stack.empty()) {
                    System.out.println("右括号多！");
                    return false;
                }else {
                    //拿到栈顶元素进行比较 看是否匹配  匹配出栈
                    if((stack.peek()=='('&&s.charAt(i)==')')||(stack.peek()=='['&&s.charAt(i)==']')||(stack.peek()=='{'&&s.charAt(i)=='}')){
                        stack.pop();
                    }else{
                        System.out.println("右括号匹配错误");
                        return false;
                    }
                }
            }
        }
        //判断栈是空的还是非空的
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        System.out.println(isValid(s));

    }

}
