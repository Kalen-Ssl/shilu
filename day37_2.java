package days;

import java.util.Scanner;

//计算日期到天数转换
public class day37_2 {
//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        int year = scan.nextInt();
//        int month = scan.nextInt();
//        int day = scan.nextInt();
//        int []a = {31,28,31,30,31,30,31,31,30,31,30,31};
//        int []b = {31,29,31,30,31,30,31,31,30,31,30,31};
//
//        if(year % 4 == 0 && year % 100 != 0 ||year%400==0)
//            countDays(b,month,day);
//        else
//            countDays(a, month, day);
//
//    }
//
//    private static void countDays(int[] arr, int month, int day) {
//        int sum = 0;
//        for (int i = 0; i < month-1; i++) {
//            sum += arr[i];
//        }
//        sum += day;
//        System.out.println(sum);
//    }
private static int countDays(int[] arr, int month, int day) {
    int outDay = 0;
    for (int i = 0; i < month-1; i++) {
        outDay += arr[i];
    }
    outDay += day;
    return outDay;
}


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        int []a = {31,28,31,30,31,30,31,31,30,31,30,31};
        int []b = {31,29,31,30,31,30,31,31,30,31,30,31};

        if(year % 4 == 0 && year % 100 != 0 ||year%400==0)
            System.out.println(countDays(b,month,day));
        else
            System.out.println(countDays(a,month,day));

    }

}
