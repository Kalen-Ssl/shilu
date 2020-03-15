package test;

import java.util.Stack;

//最小栈的实现
public class MinStack{

    private Stack<Integer> stack;
    private Stack<Integer> minStack;

    public MinStack(){
        this.stack=new Stack<>();
        this.minStack=new Stack<>();
    }

    public void push(int x){
        stack.push(x);
        if(minStack.empty()){
            minStack.push(x);
        }else{
            int tmp=minStack.peek();
            if(x<=tmp){
                minStack.push(x);
            }
        }
    }

    public void pop(){
        if(!stack.empty()){
            int tmp=stack.pop();
            if(tmp==minStack.peek()){
                minStack.pop();
            }
        }
    }

    public int top(){
        if(stack.empty()){
            return -1;
        }
        return stack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }



}





