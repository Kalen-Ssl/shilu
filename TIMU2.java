package test;

import java.util.HashSet;
import java.util.Scanner;

//输入多行，判断一共几种单词
public class TIMU2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        HashSet<String> set=new HashSet<>();
        while(sc.hasNext()){
            String str=sc.nextLine();
            String[] s=str.split(" ");
            for(String ss:s){
                set.add(ss);
            }
        }
        System.out.println(set.size());
    }
}
