package array;

//���ά����������Ԫ�صĺ�
public class SumAll {
    public static void main(String[] args){
    	int total=0;
    	int arr[][]=new int[3][4];
    	//��ʼ������ʾ��ά����
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length;j++){
    			arr[i][j]=i+j;
    			System.out.print(" "+arr[i][j]);
    		}
    		System.out.println();
    	}
    	//���
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length;j++){
    			total+=arr[i][j];
    		}
    		System.out.println(total);
    	}
    }
}
