
public class TestDemo1 {
    public static void main(String[] args) {
//        String s1="abcdef";
//        String s2="abc"+"def";
//        System.out.println(s1==s2);//true
//
//          String s1="abcdef";
//        String s2="def";
//        String s3="abc"+s2;
//        System.out.println(s1==s3);//false
//        //因为s2不是常量，是变量，所以编译的时候不知道

//        String s1="abcdef";
//        String s2="abc"+new String("def");
//       System.out.println(s1==s2);//false
//
//        String s1="abcdef";
//        String s2="abc
//
//
//
//
//
//
// "+new String("def");
//        System.out.println(s1==s2);//false
//
        String s1="abcdef";
        String s2="abc"+new String("def").intern();
        //手动入池  如果在常量池中，有当前字符串，则返回当前字符串
        //在常量池当中的地址给当前引用
        System.out.println(s1==s2);//true


//        String s1="abcdef";
//        String s2=new String("abcdef");
//        System.out.println(s1==s2);//false
//        System.out.println(s1.equals(s2));//true
        //s1中用“”括起来的，存放在常量池中，从JDK1.7开始，常量池在堆上
    }

    public static void main2(String[] args) {
        //空
        String s1=new String();
        System.out.println(s1);

        String s2=new String("abcdef");
        System.out.println(s2);

        String s3="abcdef";
        System.out.println(s3);

        byte[] bytes={97,98,99,100};
        String s4=new String(bytes);
        System.out.println(s4);
        //输出结果是a,b,c,d  (ascii)

        char[] value={'a','b','c','d','e'};
        String s5=new String(value);
        System.out.println(s5);

        //3是偏移量，2是取几个
        String s6=new String(value,3,2);
        System.out.println(s6);
    }
}
