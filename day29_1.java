package days;


import java.util.Scanner;
//在霍格沃兹找零钱
public class day29_1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String P=input.next();
        String A=input.next();
        String[] P1=P.split("\\.");
        String[] A1=A.split("\\.");
        int sumP=(Integer.parseInt(P1[0])*17*29+Integer.parseInt(P1[1])*29+Integer.parseInt(P1[2]));
        int sumA=(Integer.parseInt(A1[0])*17*29+Integer.parseInt(A1[1])*29+Integer.parseInt(A1[2]));
        int R=sumA-sumP;
        int r1,r2,r3;
        r1=R/(17*29);
        r2=(R-r1*17*29)/29;
        r3=(R-(r1*17*29)-r2*29);
        if(sumP<=sumA) {
            System.out.println(r1 + "." + r2 + "." + r3 );
        }else{
            System.out.println("-"+Math.abs(r1) + "." +"-"+Math.abs(r2) + "." +"-"+ Math.abs(r3));
        }
    }
}
