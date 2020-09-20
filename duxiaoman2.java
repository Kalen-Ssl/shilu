package bishi;

import java.util.*;
public class duxiaoman2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int T = sc.nextInt();
            for (int i = 0; i < T; i++) {
                String s = sc.next();
                StringBuffer sb = new StringBuffer(s);
                String[] arr = new String[s.length()/3];
                for (int j = 0; j < arr.length; j++) {
                    String str = s.substring(0,3);
                    sb.delete(0,3);
                    s = sb.toString();

                    arr[j] = str;
                }
                System.out.println(likeString(arr)?"Yes":"No");
            }

        }

    }

    private static boolean likeString(String[] arr){
        //String类型的数组中每个位置都存储三位字符串
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                count =0;
                for (int k = 0; k < 3; k++) {
                    if(arr[i].charAt(k) != arr[j].charAt(k)){
                        count ++;
                    }
                }
                if(count > 1){
                    return false;
                }
            }
        }
        return true;
    }
}

//public class duxiaoman2 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n=sc.nextInt();
//        String[] str=new String[n];
//        int i=0;
//        for(int j=0;j<n;j++){
//            str[i++]=sc.next();
//        }
//        for(int q=0;q<n;q++){
//            char[][] num=new char[str[q].length()/3+1][3];
//            int index=0;
//            for(int e=0;e<str[q].length();e=e+3){
//                num[index][0]=str[q].charAt(e);
//                num[index][1]=str[q].charAt(e+1);
//                num[index][2]=str[q].charAt(e+2);
//           }
//           int a=0;int b=0;int c=0;
//           boolean f=true;
//           for(int l=0;l<num.length-1;l++){
//               for(int ll=l+1;ll<num.length-1;ll++){
//                   if(num[l][0]==num[l+1][0]){
//                       a=a+1;
//                   }
//                   if(num[l][1]==num[l+1][1]){
//                       b=b+1;
//                   }
//                   if(num[l][2]==num[l+1][2]){
//                       c=c+1;
//                   }
//                   if(a+b+c!=2||a+b+c!=3){
//                       f=false;
//                   }
//                   a=0;b=0;c=0;
//               }
//
//           }
//            if(f==true){
//                System.out.println("Yes");
//            }else{
//                System.out.println("No");
//            }
//        }
//
//    }
//}
//
//
