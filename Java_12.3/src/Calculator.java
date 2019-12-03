//编写一个类Calculator,有两个属性num1,num2,这两个数据的值，
 // 不能在定义的同时初始化，最后实现加减乘除四种运算
import java.util.Scanner;
public class Calculator {
    public double num1;
    public double num2;

    public void add() {
        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
    }

    public void sub() {
        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
    }

    public void mul() {
        System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
    }

    public void div() {
        double num1 = this.num1;
        double num2 = this.num2;
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }


    public static void main(String[] args){
         Calculator cal1=new Calculator();
         Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数字");
        cal1.num1=sc.nextDouble();
        cal1.num2=sc.nextDouble();
        cal1.add();
        cal1.sub();
        cal1.mul();
        cal1.div();
    }
}

