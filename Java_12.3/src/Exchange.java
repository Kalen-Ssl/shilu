import java.util.Scanner;
public class Exchange {
    public double num1;
    public double num2;


    public void exchange() {
        double temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.printf("交换的值为 num1 = %f, num2 = %f", num1, num2);
    }
    public static void main(String[] args) {
        Exchange change = new Exchange();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要交换的两个数:");
        change.num1 = sc.nextDouble();
        change.num2 = sc.nextDouble();
        change.exchange();
        sc.close();
    }
}
