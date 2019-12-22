package test1;

public class sum100and200 {
	public static void main(String[] args){
		
	//while
//		int sum=0;
//		int i=100;
//		while(i<200){
//			i++;
//			sum=sum+i;
//		}
//		System.out.println(sum);
//	}
		
		//do while
//		int sum=0;
//		int i=100;
//		do{
//		  i++;
//		  sum=sum+i;
//		}while(i<200);
		
		
//		int sum=0,i;
//		for(i=101;i<=200;i++){
//			sum+=i;
//		}
//		
		
		//java允许两个或两个以上的变量控制for循环，可以在初始化部分和迭代部分声明和使用多个变量，每个变量之间用逗号隔开
//		int a,b;
//		for(a=1,b=4;a<b;a++,b--){
//			System.out.println("a="+a);
//			System.out.println("b="+b);
//		}
		
		
		//for-each
		int sum=0;
		int a[]=new int[100];
		for(int i=0;i<100;i++)
		{
			a[i]=101+i;
		}
		
		for(int e:a){
			sum=sum+e;
		}
		System.out.println("the sum is "+sum);
		
		
		
	}
}
