package test;


import java.util.LinkedList;
import java.util.Queue;

//队列实现栈
public class QueueImplStack {

    private Queue<Integer> qu1;
    private Queue<Integer> qu2;
    private  int usedSize;

    public QueueImplStack() {
        qu1 = new LinkedList<>();
        qu2 = new LinkedList<>();
    }

    public void push(int x) {
       if(!qu1.isEmpty()){
           qu1.offer(x);
       }else if(!qu2.isEmpty()){
           qu2.offer(x);
       }else{
           qu1.offer(x);
       }
       this.usedSize++;
    }

    public int pop() {
         if (empty()){
             throw new RuntimeException("栈为空");
         }
         int e=0;
         if(!qu1.isEmpty()) {
             for (int i = 0; i < this.usedSize - 1; i++) {
                 qu2.offer(qu1.poll());
             }
             e = qu1.poll();
         }else{
             for (int i = 0; i < this.usedSize - 1; i++) {
                 qu1.offer(qu2.poll());
             }
             e = qu2.poll();
         }
         this.usedSize--;
         return e;
    }


    public int top() {
        if(empty()){
            throw new RuntimeException("栈为空");
        }
        int e=0;
        if(!qu1.isEmpty()) {
            for (int i = 0; i < this.usedSize - 1; i++) {
                e = qu1.poll();
                qu2.offer(e);
            }
        }else {
            for (int i = 0; i < this.usedSize - 1; i++) {
                e = qu2.poll();
                qu1.offer(e);
            }
        }
        return e;

    }


    public boolean empty() {
       return this.usedSize==0;
    }
}