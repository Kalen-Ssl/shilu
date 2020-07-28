package fuxi;


public class MyStack {
    int[] elem;
    int usedSize;
    public MyStack(){
        this.elem=new int[10];
        this.usedSize=0;
    }

    public void push(int val){
        if(isFull()){
            return;
        }
        this.elem[this.usedSize]=val;
        this.usedSize++;
    }

    public int pop(){
        if(empty()){
            throw new RuntimeException("栈为空！");
        }
        //先把出栈的元素保存到data中
        int data=this.elem[this.usedSize-1];
        this.usedSize--;
        return data;
    }

    public int peek(){
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