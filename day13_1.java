package days;
import java.util.Scanner;
//牛客 跟奥巴马一起编程
public class day13_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        char c = scanner.next().charAt(0);

        for (int i = 0; i < (N + 1) / 2; i++) {
            for (int j = 0; j < N; j++) {
                if(i == 0 || j == 0 || i == ((N+1)/2 - 1) || j == N-1) {
                    System.out.print(c);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}