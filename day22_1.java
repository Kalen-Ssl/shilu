package days;


import java.util.Scanner;
//数字之和

public class day22_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            if (n<=0 || n>=40000) {
                return ;
            }
            int m = n*n;
            int sum1 = 0;
            int sum2 = 0;
            while(n>0) {
                sum1 += n%10;
                n=n/10;
            }
            while(m>0) {
                sum2 += m%10;
                m = m/10;
            }
            System.out.print(sum1+ " " + sum2);
        }
    }
}
