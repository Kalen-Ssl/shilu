package days;

import java.util.Scanner;

//买苹果
public class day4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if (n < 6 || n == 7) {
                System.out.println(-1);
                return;
            }
            int b = n / 24;
            int a = n % 24;
            if (a == 0){
                System.out.println(3*b);
                return;
            }
            int c = 0;
            boolean s=false;
            for (int i = 3; i >=0; i--) {
                for (int j = 0; j <= 4; j++) {
                    if (i * 8 + j * 6 == a) {
                        c = i + j;
                        s=true;
                        break;
                    }
                }
            }
            if(!s){
                for (int i = 3; i >=0; i--) {
                    for (int j = 0; j <= 4; j++) {
                        if (i * 8 + j * 6 == n) {
                           int d = i + j;
                            System.out.println(d);
                            return;
                        }
                    }
                }
                System.out.println(-1);
                return;
            }
            int num = b*3 + c;
            System.out.println(num);
        }
//    public static void main(String[] args) {
//
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int temp = n;
//        for(int i=n/8; i>=0; i--){
//            temp = n-8*i;
//            if(temp%6 == 0){
//                System.out.println(i+temp/6);
//                return;
//            }
//        }
//        System.out.println(-1);
//    }
}
