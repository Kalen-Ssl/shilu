package bishi;


import java.util.Scanner;

public class meituan1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long a=sc.nextInt();
        long b=sc.nextInt();
        long c=sc.nextInt();
        long d=sc.nextInt();
        long e=sc.nextInt();
        long f=sc.nextInt();
        long g=sc.nextInt();
        long num=0;
        if(e>=f&&e>=g){
            num=num+Math.min(a,d)*e;
            d=d-Math.min(a,d);
            if(d!=0&&f>=g){
                num=num+Math.min(b,d)*f;
                d=d-Math.min(b,d);
                if(d!=0){
                    num=num+Math.min(c,d)*g;
                }
            }else if(d!=0&&g>f){
                num=num+Math.min(c,d)*g;
                d=d-Math.min(c,d);
                if(d!=0){
                    num=num+Math.min(b,d)*g;
                }
            }
        }
        if(f>=e&&f>=g){
            num=num+Math.min(b,d)*f;
            d=d-Math.min(b,d);
            if(d!=0&&e>=g){
                num=num+Math.min(a,d)*e;
                d=d-Math.min(a,d);
                if(d!=0){
                    num=num+Math.min(c,d)*g;
                }
            }else if(d!=0&&g>e){
                num=num+Math.min(c,d)*g;
                d=d-Math.min(c,d);
                if(d!=0){
                    num=num+Math.min(a,d)*g;
                }
            }
        }
        if(g>=e&&g>=f){
            num=num+Math.min(c,d)*g;
            d=d-Math.min(c,d);
            if(d!=0&&e>=f){
                num=num+Math.min(a,d)*e;
                d=d-Math.min(a,d);
                if(d!=0){
                    num=num+Math.min(b,d)*g;
                }
            }else if(d!=0&&f>e){
                num=num+Math.min(b,d)*f;
                d=d-Math.min(b,d);
                if(d!=0){
                    num=num+Math.min(a,d)*g;
                }
            }
        }
        System.out.println(num);
    }
}
