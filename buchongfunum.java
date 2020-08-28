package fuxi2;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class buchongfunum{
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        while(sc.hasNext()){
//            String str=sc.nextLine();
//            char[] num=str.toCharArray();
//            Set<Character> se=new LinkedHashSet<Character>();
//            for(int i=num.length-1;i>0;i--){
//                se.add(num[i]);
//            }
//            String result="";
//            for(Character c:se){
//                result+=c;
//            }
//            System.out.println(result);
//        }
//    }

        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            StringBuffer sb = new StringBuffer(str);
            Set s = new HashSet();
            sb.reverse();//字符串反转
            for(int i = 0;i<sb.length();i++){
                if(s.add(sb.substring(i,i+1))){//set不允许重复添加相同的元素
                    System.out.print(sb.substring(i,i+1));
                }
            }
        }
}
