package days;

import java.util.Scanner;

//守形数
public class day24_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n1=sc.nextInt();
            int n2=(int)Math.pow(n1,2);
            String s1=""+n2;
            String s2=s1.substring(1);
            if(s2.length()>0) {
                int n3 = Integer.parseInt(s2);
                if (n1 == n3) {
                    System.out.println("Yes!");
                } else {
                    System.out.println("No!");
                }
            }else {
                System.out.println("No!");
            }
        }
    }
}
