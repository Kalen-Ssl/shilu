package bishi;

import java.util.Scanner;
//1 2 3 5 8
public class qunaer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(getNum(n));

    }

    //非递归
    public static int getNum(int n){
        int a=1;
        int b=2;
        int c=0;
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        for(int i=3;i<=n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }

    //递归
//    public static int getNum(int n){
//        if(n==0){
//            return 0;
//        }
//        if(n==1){
//            return 1;
//        }
//        if(n==2){
//            return 2;
//        }
//        else{
//            return getNum(n-1)+getNum(n-2);
//        }
//    }
}
