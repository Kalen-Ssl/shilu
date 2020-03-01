import java.util.Scanner;

public class StringTest2 {


    public static void main(String[] args) {

    }







    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String str=sc.next();
        System.out.println(func(str,3));
    }
    //abcdefg---defgabc
     public static  String func(String str,int k){
        if(str==null||k<=0||k>=str.length()){
            return null;
        }
        String str1,str2,str3;
        str=reverse(str,0,k-1);//cbadefg
        str=reverse(str,k,str.length()-1);//cbagfed
        str=reverse(str,0,str.length()-1);//defgabc
        return str;
    }

    //字符串逆置
    public static String reverse(String str,int left,int right){

        char[] value =str.toCharArray();
        while(left<right){
            char ch=value[left];
            value[left]=value[right];
            value[right]=ch;
            left++;
            right--;
        }
        return new String(value);
        //return String.copyValueOf(value);
        //return String.valueOf(value);
    }

    public static void main3(String[] args) {
       String str="abcdefg";
        System.out.println(reverse(str,0,str.length()-1));
    }








//连接两个字符串并输出
  /*  public static String func(String str) {
        String[] ss = str.split(" ");
        String ret = "";
        for (String s : ss) {
            ret += s;
        }
        return ret;
    }

    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String ret = func(str);
        System.out.println(ret);
    }*/
}
