package test;


public class MyStack<T>{
    private T[] elem;
    private int usedSize;


    public MyStack(){
        this.elem=(T[])new Object[10];
        this.usedSize=0;
    }

    //入栈
    public void push(T val){
        if(isFull()){
            return;
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }

    //出栈
    public T pop(){
        if(empty()){
            throw new RuntimeException("栈为空！");
        }
        //先把出栈的元素保存到data中
        T data=this.elem[this.usedSize-1];
        this.usedSize--;
        return data;
    }

    //得到栈顶元素
    public T peek(){
        if(empty()){
            throw new RuntimeException("栈为空！");
        }
        return this.elem[this.usedSize-1];
    }

    public boolean empty(){
        if(this.usedSize==0){
            return true;
        }
        return false;
    }


    public boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
        return false;
    }

}







