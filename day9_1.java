package days;
import java.util.Scanner;
//数字颠倒
//输入一个整数，将这个整数以字符串的形式逆序输出
//程序不考虑负数的情况，若数字含有0，则逆序形式也含有0，如输入为100，则输出为001
public class day9_1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            String str = scanner.nextLine();
            char[] nums = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for (int i = str.length()-1; i >=0 ; i--) {
                sb.append(nums[i]);
            }
            System.out.println(sb);
        }
    }
}
