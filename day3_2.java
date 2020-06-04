package days;


import java.util.Stack;


//判断括号匹配
public class day3_2 {
    public boolean chkParenthesis(String A, int n) {
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!='('&&A.charAt(i)!=')'){
                return false;
            }
            if(A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }else if(stack.empty()){
                return false;
            }else if(stack.peek()=='('){
                stack.pop();
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
}
