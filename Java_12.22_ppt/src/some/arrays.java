package some;

import java.util.*;

import static java.util.Arrays.asList;

/**
 * @program:test_12.22
 * @author: Nine_odes
 * @description:ÖÚÊý
 * @create:2019-12-22 15:38
 */

public class arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i < n; i++) {
                array[i] = sc.nextInt();
            }
            Arrays.sort(array);

            int []count = new int[n];
            for (int i = 0; i < n; i++) {
                for (int j = i; j < n; j++) {
                    if(array[i] == array[j] ){
                        count[i] ++;
                    }
                }
            }
            
            int max = 0;
            int s = 0;
            for (int i = 0; i < n; i++) {
                if(count[i] >= max){
                    max = count[i];
                    s = array[i];
                    System.out.println(s + " " + max);
                    
                }
            }
        }
    }
}