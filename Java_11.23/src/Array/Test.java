package Array;


import java.util.Arrays;
public class Test {
    public static void main(String[] args)
    {
       int[] arr={1,3,5,7,9};
       doubleArray2(arr);
    }

    //写一个方法，把数组中的每个元素都*2
    public static void doubleArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i]*=2;
        }
    }

    //写一个方法，把数组中的每个元素都*2,但不改变原数组
    public static void doubleArray2(int[] array){
        int[] newarr2=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newarr2[i]=array[i]*=2;
        }
        System.out.println(print(newarr2));
    }




    //将数组变为字符串输出
    public static String print(int[] array){
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if(i==array.length-1)
            {
                str=str+array[i]+"]";
            }else {
                str = str + array[i] + ",";
            }
        }
        return str;
    }
    //复制元素组内容，产生新数组xx
    public static int[] copy(int[] array)
    {
       int[] newarr=new int[array.length];
        for (int i = 0; i <array.length ; i++) {
            newarr[i] = array[i];
        }
        return newarr;
    }

}
