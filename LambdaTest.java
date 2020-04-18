package work;

/*
@FunctionalInterface
interface A {
    void func1();
    //default修饰的方法  有什么特性还是有什么意义呢？
    default void func2(){
        System.out.println("func2()");
    }
}
*/

//无返回值无参数
@FunctionalInterface
interface NoParameterNoReturn {
    void test();
}
//无返回值一个参数
@FunctionalInterface
interface OneParameterNoReturn {
    void test(int a);
}
//无返回值多个参数
@FunctionalInterface
interface MoreParameterNoReturn {
    void test(int a,int b);
}
//有返回值无参数
@FunctionalInterface
interface NoParameterReturn {
    int test();
}
//有返回值一个参数
@FunctionalInterface
interface OneParameterReturn {
    int test(int a);
}
//有返回值多参数
@FunctionalInterface
interface MoreParameterReturn {
    int test(int a,int b);
}
public class LambdaTest {

    public static void main(String[] args) {
        //int a = 99;
        NoParameterReturn noParameterReturn = ()->{
            //a = 88;
            System.out.println("有返回值，没有参数");
            return 19;
        };
        int ret = noParameterReturn.test();
        System.out.println(ret);

        /*OneParameterReturn oneParameterReturn = (int a) -> {
            System.out.println("有一个参数，且有返回值");
            return a;
        };*/
        OneParameterReturn oneParameterReturn = a -> {
            System.out.println("有一个参数，且有返回值");
            return a;
        };
        System.out.println(oneParameterReturn.test(100));

        MoreParameterReturn moreParameterReturn = ( a, b)->{
            System.out.println("有多个参数，且有返回值");
            return a+b;
        };
        System.out.println(moreParameterReturn.test(20, 70));
    }

    public static void main1(String[] args) {
        NoParameterNoReturn noParameterNoReturn =
                () ->  System.out.println("无参数无返回值！");
        noParameterNoReturn.test();

        OneParameterNoReturn oneParameterNoReturn
                = a -> System.out.println("有一个参数，没有返回值："+ a);

        oneParameterNoReturn.test(10);

        MoreParameterNoReturn moreParameterNoReturn = (a,b)->
                System.out.println("有两个参数，没有返回值："+a+" " + b);

        moreParameterNoReturn.test(1,2);
    }
}
