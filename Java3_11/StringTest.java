import java.util.ArrayList;
import java.util.List;

public class StringTest {





    public static void main(String[] args) {
        String str1="welcome to bit";
        String str2="come";
        List<Character> list=new ArrayList<>();
        char[] ch1=str1.toCharArray();
        char[] ch2=str2.toCharArray();
        boolean a=true;
        for(int i=0;i<ch1.length;i++){
            for(int j=0;j<ch2.length;j++){
                if(ch1[i]==ch2[j]){
                    a=false;
                    break;
                }
            }
            if(a==true){
                list.add(ch1[i]);
            }
            a=true;
        }
        System.out.println(list);
    }
}
