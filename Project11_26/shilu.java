package shilu;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class shilu {
    public static void main(String[] args) {

        int[] arr={1,6,3,14,36,875,124,4,5};
        int[] arr2=new int[5];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //数组转字符串
        // String arrs= Arrays.toString(arr);

        /*
        //数组拷贝(此函数为深拷贝)
        int[] newarr=Arrays.copyOf(arr,arr.length);
        System.out.println(Arrays.toString(newarr));
        arr[0]=10;
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(newarr));
        //部分拷贝
        int[] newArr2= Arrays.copyOfRange(arr,2,4);
        System.out.println(Arrays.toString(newArr2));
        */


    }


    //递归求n的阶乘
    public static int factor(int n){
        if(n==1){
            return 1;
        }
        return n*factor(n-1);
    }

    //递归求1+2+3...+10
    public static int sum(int num){
        if(num==1)
        {
            return 1;
        }
        return num+sum(num-1);
    }

    //按顺序打印一个数字的每一位
    public static void print(int num)
    {
        if(num>9)
        {
            print(num/10);
        }
        System.out.println(num%10);
    }

    //输入一个非负整数，返回组成它的数字之和
    public static int sums(int num){
        if(num<10)
        {
            return num;
        }
        return num%10+sums(num/10);
    }

     //求斐波那契数列的第n项
    public static int fib(int n){
        if(n==1||n==2)
        {
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }

      //斐波那契数列 非递归
    public static int fib2(int n){
        int a,b,c;
        a=1;b=1;
        int num=0;
        for(int i=3;i<=n;i++)
        {
            num=a+b;
            a=b;
            b=num;
        }
        return num;
    }

     //将数组中每个元素都乘2
     public static void transform(int[] arr){
        for(int i=0;i<arr.length;i++){
            arr[i]*=2;
        }
     }

     //输出数组
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }

    //给新数组中的每个元素都乘2
    public static void transforms(int[] arr){
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[i]*2;
        }
    }

    //数组转字符串
    public static String main(int[] arr)
    {
        String ret="[";
        for(int i=0;i<arr.length;i++)
        {
            ret+=arr[i];
            if(i!=arr.length-1){
                ret+=",";
            }
        }
        ret+="]";
        return ret;
    }

    //数组拷贝
    public static int[] copyOf(int[] arr){
        int[] ret=new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            ret[i]=arr[i];
        }
        return ret;
    }

    //找出数组中的最大元素
    public static int max(int[] arr){
        int max=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    //求数组元素的平均值
    public static double avg(int[] arr){
        int sum=0;
        for(int i:arr){
            sum+=i;
        }
        return sum/arr.length;
    }

    //顺序查找数组中指定元素
    public static int find(int[] arr,int toFind){
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==toFind){
                return i;
            }
        }
        return -1;
    }


    //二分查找数组中指定元素
    public static int find2(int[] arr,int n,int key) {
        int left = 0;
        int right = n - 1;
        while (left <=right) {
            int mid = (left + right) / 2;
            if (arr[mid] > key) {
                right = mid - 1;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            }
            if (key == arr[mid]) {
                return mid;
            }
        }
        return -1;
    }


    //判断数组是否升序
    public static boolean isSort(int[] arr){
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    //冒泡排序 升序
    public static void pao(int[] arr){
        int t;
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j=0;j<arr.length-1-i;j++) {
                if(arr[j]>arr[j+1])
                {
                    t=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=t;
                }
            }
        }
    }








}
