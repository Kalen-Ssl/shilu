package test;


import java.util.Scanner;

import static java.lang.Math.abs;

public class TIMU1 {

    public static int Fib(int num){
        int a=1,b=1;
        int c,num1,num2;
        for(int i=0;i<100;i++){
            num1=b;
        c=a+b;
        a=b;
        b=c;
        num2=c;
        if(num1<=num&&num2>=num){
             if(abs(num1-num)>=abs(num2-num))
                 return num2;
             else{
                 return num1;
             }
        }
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int q=Fib(n);
        System.out.println(abs(n - q));

    }
}
