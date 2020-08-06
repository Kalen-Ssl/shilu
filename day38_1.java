package days;

import java.util.Scanner;

//单词倒排
public class day38_1 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
     while(sc.hasNext()){
         String input=sc.nextLine();
         char[] charArray=input.toCharArray();
         for(int i=0;i<charArray.length;i++){
             if(!isAlphaBelta(charArray[i])){
                 charArray[i]=' ';
             }
         }
         input=String.valueOf(charArray).trim();
         StringBuilder sb=new StringBuilder();
         String[] split=input.split("\\s+");
         int i;
         for(i=split.length-1;i>=0;i--){
             sb.append(split[i]+" ");
         }
         System.out.println(sb);
     }

    }


    public static boolean isAlphaBelta(char c){
        if((c<='Z'&&c>='A')||c<='z'&&c>='a'){
            return true;
        }else{
            return false;
        }
    }
}
