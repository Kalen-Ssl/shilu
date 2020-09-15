package bishi;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

//输入一个大写字母串，输出其中字符的个数
public class wuba1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[] ss=s.toCharArray();
        Arrays.sort(ss);
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(!set.contains(ss[i])){
                set.add(ss[i]);
                int num=1;
                for(int j=i+1;j<s.length();j++){
                    if(ss[i]==ss[j]){
                        num=num+1;
                    }
                }
                System.out.print(ss[i]+"="+num+" ");
            }
        }

    }
}
