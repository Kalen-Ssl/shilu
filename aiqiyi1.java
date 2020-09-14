package bishi;


import java.util.HashSet;
import java.util.Scanner;

//给定一个字符串，请你找出其中不含有重复字符的最长子串的长度。
public class aiqiyi1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        HashSet<Character> set=new HashSet<>();
        int num=0;
        for(int i=0;i<s.length();i++){
            if(!set.contains(s.charAt(i))){
                set.add(s.charAt(i));
            }else{
                num=Math.max(num,set.size());
                set.clear();
            }
        }
        System.out.println(num);
    }
}
