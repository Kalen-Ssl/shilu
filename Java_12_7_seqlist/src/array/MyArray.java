package array;
import java.util.Arrays;

public class MyArray {
    private int[] num;
    private int size;

    public MyArray(){
        num=new int[16];
    }

    public MyArray(int length){
        num=new int[length];
    }

    //向数组中末尾位置插入元素
    public void add(int data){
        //判断数组是否已满
        if(size==num.length){
            grow();
        }
        num[size]=data;
        size++;
    }

    //向数组中任意位置插入元素
    public void add(int index,int data){
        if(index<0||index>size){
            System.out.println("索引非法");
            return;
        }
        if(index==size){
            add(data);
        }else {
            //此时在数组中间添加元素
            System.arraycopy(num,index,num,index+1,size-index);
            num[index]=data;
            size++;
        }
    }

    //查找并返回索引
    public int find(int data){
        for(int i=0;i<size;i++)
        {
            if(num[i]==data){
                System.out.println("找到元素");
                return i;
            }
        }
        System.out.println("元素不存在");
        return -1;
    }

    //在数组中查找是否有指定元素
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

     //在数组中删除第一个出现的指定内容
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

    //取得指定位置的元素
    public int get(int index){
        if(rangeCheck(index)){
            return num[index];
        }
        return -1;
    }

    //修改指定索引的内容
    public boolean set(int index,int data){
        if(rangeCheck(index)){
            num[index]=data;
            return true;
        }
        return false;
    }


    //返回动态数组长度
    public int size(){
        return size;
    }

    //打印动态数组内容
    public void print(){
        for(int i=0;i<size;i++){
            System.out.print(num[i]+"、");
        }
        System.out.println();
    }

    //清空所有数组元素
    public void clear(){
        Arrays.fill(num,0);
    }


    //内部数组扩容方法(此方法只有本类使用，因此将其封装）
    private void grow(){
        Arrays.copyOf(num,num.length<<1);
    }

    //内部校验访问index是否何法
    public boolean rangeCheck(int index){
        if(index<0||index>size){
            System.out.println("索引非法");
           return false;
        }
        return true;
    }



}
