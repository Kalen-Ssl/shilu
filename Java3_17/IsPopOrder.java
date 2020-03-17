package test;


import java.util.Stack;


public class IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0) {
            return false;
        }
       Stack<Integer> stack=new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < popA.length; i++) {
            stack.push(pushA[i]);
            while (j < popA.length && stack.peek() == popA[j]) {
                stack.pop();
                j++;
            }

        }
        if(stack.empty()){
            return true;
        }else{
            return false;
        }
    }
}
//判断第二个序列是否是第一个序列的弹出顺序（栈）