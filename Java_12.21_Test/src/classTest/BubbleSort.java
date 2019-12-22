package classTest;
import java.util.Scanner;

public class BubbleSort{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[] numbers=new int[8];
		System.out.println("请输入8个数字");
		for(int i=0;i<numbers.length;i++){
			numbers[i]=sc.nextInt();
		}
		//排序
		for(int i=numbers.length-1;i>0;i--){
			for(int j=0;j<i;j++){
				if(numbers[j]>numbers[j+1]){
					int t=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=t;
				}
			}
		}
		System.out.println("排序后的结果是");
		for(int i=0;i<numbers.length;i++){
			System.out.println(numbers[i]+" ");
		}
	}

}
