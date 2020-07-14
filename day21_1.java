package days;


import java.util.Scanner;

//人民币转换
public class day21_1 {

        public static String[] RMB = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        public static String[] unit1 = {"元", "拾", "佰", "仟", "万", "拾", "佰", "仟", "亿", "拾", "佰", "仟"};
        public static String[] unit2 = {"角", "分"};
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            while(sc.hasNext()){
                String s=sc.next();
                String result="";
                if(s.contains(".")){
                    String s1=s.substring(s.indexOf('.')+1);
                    String s2=s.substring(0,s.indexOf('.'));
                    result="人民币"+integer(s2)+decimal(s1);
                }else{
                    result="人民币"+integer(s)+"整";
                }
                System.out.println(result);
            }
        }

   public static String integer(String s) {
            if(s.length()==1&&s.charAt(0)=='0') return "";
            StringBuilder sb=new StringBuilder();
            for(int i=s.length()-1;i>-1;i--){
                sb.append(s.charAt(i));
            }
            int[] arr=new int[s.length()];
            for(int i=0;i<arr.length;i++){
                arr[i]=Integer.parseInt(String.valueOf(sb.toString().charAt(i)));
            }
            sb.delete(0,sb.length());
            for(int i=0;i<arr.length;i++){
                sb.append(unit1[i]+RMB[arr[i]]);
            }
            sb=sb.reverse();
            if(sb.charAt(0) == '壹' && sb.charAt(1) == '拾') sb.deleteCharAt(0);
            return sb.toString();
    }


    public static String decimal(String s) {
            String temp = "";
            int[] arr = new int[s.length()];
            for (int i = 0; i < arr.length; i ++ )
                arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
            for (int i = 0; i < arr.length; i ++ ) {
                if(arr[i] == 0) continue;
                temp += RMB[arr[i]] + unit2[i];
            }
            return temp;

    }


}
