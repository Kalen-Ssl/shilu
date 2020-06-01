package days;

//向字符串A中加入字符串B，判断几种情况下回文
import java.util.Scanner;


public class day1_1 {

    public static boolean isHuiWen(String s){
        int i=0;
        int j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.nextLine();
        String B=sc.nextLine();
        int count = 0;
        for(int i=0;i<A.length();i++){
            StringBuilder sb=new StringBuilder(A);
            sb.insert(i,B);
            if(isHuiWen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);
    }
}
