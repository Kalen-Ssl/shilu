package some;

import java.util.Arrays;
import java.util.Scanner;


//��kС����
public class NumMinK{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int n=sc.nextInt();
			int k=sc.nextInt();
			int[] array=new int[n];
			for(int i=0;i<n;i++){
				array[i]=sc.nextInt();
			}
			Arrays.sort(array);
			int count=0;
			for(int i=0;i<n;i++){
				if(array[i]!=array[i+1]){
					count++;
					if(count==k){
						System.out.println(array[i]);
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
