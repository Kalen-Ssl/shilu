import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        while (in.hasNextInt()) {
            int n=in.nextInt();
            int[] input=new int[n];
            for (int i = 0; i < input.length; i++) {
                input[i]=in.nextInt();
            }
            for (int i = 0; i < input.length; i++) {
                for (int j = i+1; j < input.length; j++) {
                    if (input[i]>input[j]) {
                        int temp=input[i];
                        input[i]=input[j];
                        input[j]=temp;
                    }
                }
            }
            System.out.println(input[0]);
            for (int i = 1; i < input.length; i++) {
                if (input[i]==input[i-1]) {
                    continue;
                }
                System.out.println(input[i]);
            }
             
        }
         
    }
}