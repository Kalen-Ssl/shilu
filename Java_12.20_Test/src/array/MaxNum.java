package array;

//求一维数组的最大值及所在位置
public class MaxNum {
	public static void main(String[] args){
		final int ARRAY_SIZE=10;
		//int a[]=new int[10];
		int a[]=new int[ARRAY_SIZE];
		int max=0;
		int index=0;
		for(int i=0;i<a.length;i++){
			a[i]=(int)(Math.random()*10);//生成随机数，并给数组成员赋值
			System.out.print(" "+a[i]);
		}
		System.out.println();
		max=a[0];
		for(int j=0;j<ARRAY_SIZE;j++){
			if(a[j]>max){
				max=a[j];
				index=j;
			}
		}
		System.out.println("A["+index+"]="+a[index]);
	}
}
