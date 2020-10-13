package bishi;


import java.util.Scanner;

public class xiecheng{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] num=new int[k];
        String[] str=new String[k];
        for(int i=0;i<k;i++){
            str[i]=sc.next();
            String[] str2=str[i].split(",");
            num[i]=Integer.parseInt(str2[str2.length-n]);
        }
        int re=0;
        for(int q=0;q<k;q++){
            re=re+num[q];
        }
        System.out.println(re);
    }
}
