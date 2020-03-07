package array;

import java.util.Arrays;

//动态数组
public class MyArray {
    private int[] num;
    private int size;//当前数组中存储元素的个数

    public MyArray(){
        num=new int[16];
    }

    public MyArray(int length){
        num=new int[length];
    }

    public void add(int data){
        if(size==num.length){
            grow();//扩容
        }
        num[size]=data;
        size++;
    }


    public void add(int index,int data){
        if(index<0||index>size){
            System.out.println("索引非法！");
            return;
        }
        else if(index==size){
            add(data);
        }else{
            if(size==num.length){
                grow();
            }
            //将index以及之后的元素向后移动一位
            //{1,2,3,4,5,0} add(1,10)
            System.arraycopy(num,index,num,index+1,size-index);
            num[index]=data;
            size++;
        }
    }

    public int find(int data){
        for(int i=0;i<size;i++){
            if(num[i]==data){
                System.out.println("找到元素");
                return i;
                }
              }
              System.out.println("元素不存在");
            return -1;
    }


    public boolean contains(int data){
        for(int i:num){
            if(i==data){
                System.out.println("找到元素");
                return true;
            }
        }
        System.out.println("未找到元素");
        return false;
    }

    public boolean remove(int data){
        for(int i=0;i<size;i++){
            if(num[i]==data){
                System.arraycopy(num,i+1,num,i,size-i-1);
                num[size]=0;
                size--;
                return true;
            }
        }
        return false;
    }


     public int get(int index){
        if(rangeCheck(index)){
            return num[index];
        }
        return -1;
     }


     public boolean set(int index,int data){
        if(rangeCheck(index)){
            num[index]=data;
            return true;
        }
        return false;
     }

     public void print(){
        for(int i=0;i<size;i++){
            System.out.println(num[i]+"、");
         }
         System.out.println();
     }


     public void clear(){
         Arrays.fill(num,0);
     }


     private void grow(){
        num= Arrays.copyOf(num,num.length<<1);
     }

     private boolean rangeCheck(int index){
        if(index<0||index>=size){
            System.out.println("索引非法");
            return false;
        }
        return true;
     }




}
