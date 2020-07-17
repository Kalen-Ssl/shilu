package days;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class day23_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int[] num1=new int[2];
            Map<Integer,Integer> map=new HashMap<>();
            for(int j=0;j<n;j++) {
                if (map.containsKey(arr[j])) {
                    map.put(arr[j], map.get(arr[j]) + 1);
                } else {
                    map.put(arr[j], 1);
                }
            }
            int k =0;
            for (Integer key:map.keySet()) {
                if(map.get(key)%2!=0){
                    num1[k] = key;
                    k++;
                }

            }
            Arrays.sort(num1);
            String a ="";
            a=num1[0]+" "+num1[1];
            System.out.println(a);

        }

    }
}
