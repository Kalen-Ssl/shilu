package array;
import java.util.Arrays;

//Arrays��Ļ���ʹ��
public class Arrayss {
	public static void main(String[] args){
		Integer array[]=new Integer[9];
		for(int i=1;i<10;i++){
			array[i-1]=(int)(Math.random()*100);
		}
		//��ʾ����������
		System.out.println("ԭ���ݣ�");
		display(array);
		Arrays.sort(array);
		System.out.println("�����");
		display(array);
		//��ֵ-1������������±��0��3λ���ϵ�Ԫ��
		Arrays.fill(array,0,3,-1);
		display(array);
		//��ֵ-1����������ϵ�Ԫ��
		Arrays.fill(array,-1);
		display(array);
		//����39
		System.out.println("ֵ39��λ�ã�");
		int index=Arrays.binarySearch(array, 39);//���ֲ���ָ��ֵ
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
