package array;
import java.util.Arrays;

//Arrays类的基本使用
public class Arrayss {
	public static void main(String[] args){
		Integer array[]=new Integer[9];
		for(int i=1;i<10;i++){
			array[i-1]=(int)(Math.random()*100);
		}
		//显示，排序数组
		System.out.println("原内容：");
		display(array);
		Arrays.sort(array);
		System.out.println("排序后：");
		display(array);
		//将值-1分配给数组中下标从0到3位置上的元素
		Arrays.fill(array,0,3,-1);
		display(array);
		//将值-1分配给数组上的元素
		Arrays.fill(array,-1);
		display(array);
		//搜索39
		System.out.println("值39的位置：");
		int index=Arrays.binarySearch(array, 39);//二分查找指定值
		System.out.println(index);
		//toString
		System.out.println(Arrays.toString(array));
	}
	
	
	static void display(Integer array[]){
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}

}
