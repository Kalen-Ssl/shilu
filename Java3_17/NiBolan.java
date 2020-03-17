package test;


import java.util.Stack;

//逆波兰表达式求值
public class NiBolan {
    public int evalRPN(String[] tokens) {
        Stack stack=new Stack();
        boolean flag=true;
        int val=0;
        for(int i=0;i<tokens.length;i++){
            if("+".equals(tokens[i])){
                int a=Integer.valueOf(stack.pop().toString());
                int b=Integer.valueOf(stack.pop().toString());
                stack.push(b+a);
            }else if("-".equals(tokens[i])){
                int a=Integer.valueOf(stack.pop().toString());
                int b=Integer.valueOf(stack.pop().toString());
                stack.push(b-a);
            }else if("*".equals(tokens[i])){
                int a=Integer.valueOf(stack.pop().toString());
                int b=Integer.valueOf(stack.pop().toString());
                stack.push(b*a);
            }else if("/".equals(tokens[i])){
                int a=Integer.valueOf(stack.pop().toString());
                int b=Integer.valueOf(stack.pop().toString());
                stack.push(b/a);
            }else{
                stack.push(tokens[i]);
            }
        }
        return Integer.valueOf(stack.peek().toString());
    }

}
