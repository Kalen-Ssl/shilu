package days;

import java.util.Scanner;
//瓶盖问题，三个瓶盖换一个

public class day2_1{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n =sc.nextInt();
            int num=data(n);
            if(num==0){
                System.out.println("");
            }else{
                System.out.println(num);
            }
        }
    }


    public static int data(int a){
        if(a<3&&(a+1)/3==0){
            return 0;
        }
        if(a<3&&(a+1)/3==1){
            return 1;
        }
        return a/3+data(a/3+a%3);
    }
}



