import java.util.Scanner;

public class minnam {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int[] input=new int[n];
		for(int i=0;i<input.length;i++){
			input[i]=sc.nextInt();
		}
		
		
		
		for(int i=0;i<input.length;i++){
			for(int j=i+1;j<input.length;j++){
				if(input[i]>input[j]){
					int t=input[i];
					input[i]=input[j];
					input[j]=t;
				}
			}
		}
		
		int[] num=new int[input.length];
		num[0]=num[0];
		for(int i=1,j=1;i<input.length;i++){
			if(input[i]==input[i-1]){
				continue;
			}
			num[j]=input[i];
			j++;
		}
		

		for(int v=0;v<num.length;v++){
			if(v==k-1){
				System.out.println(num[v]);
			}
		}
		
		
		
	}

}
