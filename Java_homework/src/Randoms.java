import java.util.Scanner;


public class Randoms {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] input=new int[n];
		for(int i=0;i<input.length;i++){
			input[i]=sc.nextInt();
		}
		
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i]>input[j])
				{
					int temp=input[i];
					input[i]=input[j];
					input[j]=temp;
				}
			}
		}
		
		int sum=0;
		for(int i=1;i<input.length;i++){
			if(input[i]==input[i-1]){
				continue;
			}
			sum++;
		}
		System.out.println(sum+1);
		
		System.out.print(input[0]);
		for(int i=1;i<input.length;i++){
			if(input[i]==input[i-1]){
				continue;
			}
			System.out.print(input[i]+" ");
		}
		
	}

}
