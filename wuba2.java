package bishi;

import java.util.Scanner;

//输出字符的范围在5到8之间，最长的58串
//58神奇串
public class wuba2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        boolean flag=true;
        for(int i=0;i<s.length();i++){
            while(s.charAt(i)=='5'||s.charAt(i)=='6'||s.charAt(i)=='7'||s.charAt(i)=='8'){
                System.out.print(s.charAt(i));
                i++;
                flag=false;
            }
            if(flag==false){
                break;
            }
        }

    }
}
