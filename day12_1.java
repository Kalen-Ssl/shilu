package days;

//组个最小数
import java.util.Scanner;
public class day12_1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] a = new int[10];
        for(int i = 0;i <a.length;i++){
            a[i] = s.nextInt();
        }
        int j = 1;
        for(;j<a.length;j++) {
            if (a[j] != 0) {
                System.out.print(j);
                a[j] = a[j]-1;
                break;
            }
        }
        for(int k = 0;k <10;k++){
            for(int m = 0;m<a[k];m++){
                System.out.print(k);
            }
        }
    }
}