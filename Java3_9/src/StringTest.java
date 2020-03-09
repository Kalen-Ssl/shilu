import java.util.Scanner;

public class StringTest{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            StringBuffer stringBuffer=new StringBuffer();
            for(int i=0;i<str.length();i++){
                char tmp=str.charAt(i);
                if(!stringBuffer.toString().contains(tmp+"")){
                    stringBuffer.append(tmp);
                }
            }
            System.out.println(stringBuffer);
        }

    }
}
