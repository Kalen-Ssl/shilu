package shunxu;


class A {
    public A(){
        System.out.print("1 ");
    }
    {
        System.out.print("2 ");
    }
    static{
        System.out.print("3 ");
    }
}

public class B extends A{
    public B(){
        System.out.print("4 ");
    }
    {
        System.out.print("5 ");
    }
    static{
        System.out.print("6 ");
    }
    public static void main(String[] args){
        System.out.print("7 ");
        new B();
        new B();
        System.out.print("8 ");
    }

}

