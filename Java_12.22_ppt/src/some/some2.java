package some;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:第K小整数
 * @create:2019-12-22 14:43
 */
public class some2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            //1 3 3 7 2 5 1 2 4 6
            //1 1 2 2 3 3 4 5 6 7
            //第三小的整数3
            Arrays.sort(array);
            int count = 1;
            for (int i = 0; i < n-1; i++) {
                if(array[i] != array[i+1]){
                    count ++;
                    if(count == k){
                        System.out.println(array[i+1]);
                        break;
                    }
                }
            }
            if(count < k){
                System.out.println("NO RESULT");
            }
        }
    }
}