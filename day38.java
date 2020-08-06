package days;
//骆驼命名法
import java.util.Scanner;
public class day38 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String s=sc.nextLine();
            StringBuilder ss=new StringBuilder();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)!='_'){
                    ss.append(s.charAt(i));
                }else{
                    i++;
                    char ch=(char)(s.charAt(i)-32);
                    ss.append(ch);
                }
            }
            System.out.println(ss);
        }
    }
}
