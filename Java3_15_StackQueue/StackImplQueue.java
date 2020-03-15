package test;

import java.util.Stack;

//栈实现队列
public class StackImplQueue{
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public StackImplQueue(){
        this.stack1=new Stack<>();
        this.stack2=new Stack<>();
    }

    public void push(int x){
        stack1.push(x);
    }

    public int pop(){
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push( stack1.pop());
            }
        }
        int tmp=0;
        if(!stack2.empty()){
            tmp=stack2.pop();
        }else{
            System.out.println("队列为空");
            return -1;
        }
        return tmp;
    }

    public int peek(){
        if(stack2.empty()){
            while(stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        int tmp=0;if(stack2.empty()){
            tmp=stack2.peek();
        }else{
            System.out.println("队列为空");
            return -1;
        }
        return tmp;
    }

    public boolean empty(){
        if(stack1.empty()&&stack2.empty()){
            return true;
        }
        return false;
    }

}


