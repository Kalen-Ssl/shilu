package bishi;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Scanner;

//And millionaires will hold 46% of total wealth by 2019, the 201003abc2020 report says. This ratio is likely to increase in 2020 201003abc2020.
//输入：201003abc2020输出：2020
public class searchyear {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        for(int i=1;i<s.length()-4;i++){
            if(s.charAt(i)>='1'&&s.charAt(i)<='3'&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'
                    &&s.charAt(i+2)>='0'&&s.charAt(i+2)<='9'&&s.charAt(i+3)>='0'&&s.charAt(i+3)<='9'&&
                    (s.charAt(i-1)<'0'||s.charAt(i-1)>'9')&&(s.charAt(i+4)<'0'||s.charAt(i+4)>'9')){

                        System.out.print(s.substring(i,i+4)+" ");

            }
        }
        int i=s.length()-4;
        if(s.charAt(i)>='1'&&s.charAt(i)<='3'&&s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'
                &&s.charAt(i+2)>='0'&&s.charAt(i+2)<='9'&&s.charAt(i+3)>='0'&&s.charAt(i+3)<='9'&&(s.charAt(i-1)<'0'||s.charAt(i-1)>'9')){
            System.out.print(s.substring(i,i+4));

        }

    }

}

//小明想从一段英文短文中提取潜在的年份信息，待匹配的年份的范围为1000年至3999年，包含1000和3999。
//
//输入一段英文短文，按出现次序输出所提取到的所有可能的年份字符串。