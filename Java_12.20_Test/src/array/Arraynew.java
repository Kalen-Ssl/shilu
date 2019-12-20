package array;

public class Arraynew {
	public static void main(String[] args){
		char[] s;
		s=new char[5];
		
		char[] s2=new char[5];
		
		int[] s3=new int[3];
		s[0]=1;s[1]=2;s[2]=3;
		
		
		int s4[]={1,2,3};  //这种方法初始化无需给出数组的长度
		
		//动态初始化   只指定长度，由系统给出初始化值
		 int[] c=new int[5];
		//静态初始化  给出初始化值，又系统决定长度
		 //数据类型[]  数组名=new 数据类型[]{元素1,元素2,元素3.....};
		int[] c2=new int[]{1,2,3,4,5,6,7};
		//数据类型[]  数组名={元素1,元素2,元素3.....};
		int[] c3={1,2,3,4,5,6,7};
	}

}
