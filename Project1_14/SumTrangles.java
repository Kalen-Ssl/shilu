import java.util.Scanner;
public class SumTrangles {
    public static void func(int n) {
        if (n < 0) return;
        int[][] a = new int[n][n];
        for (int i = 0;i < n;i++) {
            if (i == 0) {
                a[i][0] = 1;
                System.out.print(1);
            }
            for (int j = 0;j < i;j++) {
                if (j == 0 || j == n - 1) {
                    a[i][j] = 1;
                } else {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                }
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        func(n);
    }
}