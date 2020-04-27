package LeetCode;

import java.util.Scanner;


//求可以组成的递增三元组的数量
public class _06 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true)
            work();
    }

    static void work() {
        int n, ans = 0;
        n = sc.nextInt();
        int[] data = new int[n];
        for (int i = 0; i < n; ++i) {
            data[i] = sc.nextInt();
        }
        for (int j = 1; j < n - 1; ++j) {
            int hasSmall = 0;
            for (int i = 0; i < j; ++i) {
                if (data[i] < data[j]) {
                    hasSmall = 1;
                    break;
                }
            }
            int hasBig = 0;
            for (int k = j + 1; k < n; ++k) {
                if (data[j] < data[k]) {
                    hasBig = 1;
                    break;
                }
            }
            if ((hasSmall & hasBig) == 1)
                ans++;
        }
        System.out.println(ans);
    }
}
