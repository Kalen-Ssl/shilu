import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Person per = new Person("zs",20);
//        Person per1 = new Person("ls",18);
//        Person per2 = new Person("wu",19);
//        Person[] pers=new Person[]{per,per1,per2};
//        Arrays.sort(pers);
//        System.out.println(Arrays.toString(pers));

        //任意一个引用修改，其他都修改（浅拷贝）
//        Person per1=per;
//        Person per2=per;
//        per1.setName("Peter");
//        System.out.println(per);
//        System.out.println(per1);
//        System.out.println(per2);


        //用Cloneable接口
        //深拷贝，出来的对象和原本只是属性的值一样，但对象不同
        Person per1=per.clone();
        per1.setName("Peter");
        System.out.println(per);
        System.out.println(per1);
        //证明：
        System.out.println(per==per1);
    }
}
