package test;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Test {
    public static void main1(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
    }

    public static void main2(String[] args) {
        MyStack<Integer> myStack=new MyStack<>();
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        System.out.println(myStack.pop());//4
        System.out.println(myStack.peek());//3
        System.out.println(myStack.pop());//3
        System.out.println(myStack.pop());//2
        System.out.println(myStack.pop());//1
    }

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(40);//入栈
        System.out.println(stack);
        int a=stack.pop();//出栈
        System.out.println(a);
        System.out.println(stack);
        int ret=stack.peek();//得到栈顶元素
        System.out.println(ret);
        System.out.println(stack);
        System.out.println(stack.size());
        System.out.println(stack.empty());
        System.out.println(stack.search(10));

    }

}
