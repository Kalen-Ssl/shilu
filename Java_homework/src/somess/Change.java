package somess;

import java.util.Scanner;

//���ַ���������Ĵ�Сд��ĸ�໥ת��
public class Change {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String c=sc.nextLine();
		char[] arr=c.toCharArray();
		for(int i=0;i<arr.length;i++){
			if(arr[i]>='a'&&arr[i]<='z'){
				arr[i]-=32;
			}
			else if(arr[i]>='A'&&arr[i]<='Z'){
				arr[i]+=32;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}

}
