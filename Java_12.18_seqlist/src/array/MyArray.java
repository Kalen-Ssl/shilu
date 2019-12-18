package array;


import java.util.Arrays;

/**
 * @Author: ssl
 * @Date: 2019/12/18 16:51
* @Description:动态数组
 */
public class MyArray {
    private int[] num;
    private int size;

    public MyArray(){
        num=new int[16];
    }

    public MyArray(int length){
       num=new int[length];
    }



    /**
     * 向动态数组中添加元素，默认向数组末尾添加
     * @param data
     */
    public void add(int data){
       if(size==num.length){
           //数组已经满载，需要扩容
           grow();
       }
       num[size]=data;
       size++;
    }



    /**
     * 向动态数组的任意位置插入元素
     * @param index 插入的目标索引
     * @param data
     */
    public void add(int index,int data){
       if(index<0||index>size){
           System.out.println("输入索引非法");
           return;
       }else if(index==size){
           //尾部插入
           add(data);
       }else{
           if(size==num.length){
               //在中间位置插入
               grow();
           }
           //将index之后的元素向后移动一位
           System.arraycopy(num,index,num,index+1,size-index);
           num[index]=data;
           size++;
       }
    }


    /**
     * 在数组中查找是否有指定data的元素，若有返回索引
     * @param data
     * @return 找到返回元素下标，否则返回-1
     */
    public int find(int data){
        for(int i=0;i<size;i++){
            if(data==num[i]){
                System.out.println("找到元素");
                return i;
            }
        }
        return -1;
    }


    /**
     * 在数组中查找是否有指定元素
     * @param data
     * @return
     */
    public boolean contains(int data){
//        for(int i=0;i<size;i++){
//            if(data==num[i]){
//                System.out.println("有指定元素");
//                return true;
//            }
//        }
        for(int i:num){
            if(i==data){
                System.out.println("有指定元素");
                return true;
            }
        }
        System.out.println("未找到元素");
        return false;
    }



    /**
     * 在数组中删除第一个出现的指定内容
     * @param data
     * @return
     */
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


    /**
     * 取得指定位置的元素
     * @param index
     * @return
     */
    public int get(int index){
        if(rangeCheck(index)) {
            return num[index];
        }
        return -1;
    }


    /**
     * 修改指定索引的内容
     * @param index 指定的元素下标
     * @param data 修改后的内容
     * @return
     */
    public boolean set(int index,int data){
        if(rangeCheck(index)){
            num[index]=data;
            return true;
        }
        return false;
    }


    // 返回动态数组长度
    public int size(){
        return size;
    }


    // 打印动态数组内容
    public void print(){
        for(int i=0;i<size;i++){
            System.out.println(num[i]+"、");
        }
        System.out.println();
    }

    //清空所有数组元素
    public void clear(){
        Arrays.fill(num,0);
    }


    //内部数组扩容法，只在本类中使用，所以封装
    private void grow(){
        num= Arrays.copyOf(num,num.length<<1);
    }

    //内部校验访问index是否合法方法
    private boolean rangeCheck(int index){
        if(index<0||index>size){
            System.out.println("索引非法");
            return false;
        }
        return true;
    }



}
