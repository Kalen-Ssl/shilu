package days;

import java.util.Scanner;

//求最小公倍数
public class day7_2 {
    static int gcd(int m,int n){
        int r=m%n;
        if(r==0){
            return n;
        }else{
            return gcd(n,r);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int m=sc.nextInt();
            int n=sc.nextInt();
            if(gcd(m,n)==1){
                System.out.println(m*n);
            }else{
                System.out.println(m*n/gcd(m,n));
            }
        }
    }
}
