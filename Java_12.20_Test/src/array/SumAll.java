package array;

//求二维数组中所有元素的和
public class SumAll {
    public static void main(String[] args){
    	int total=0;
    	int arr[][]=new int[3][4];
    	//初始化并显示二维数组
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length;j++){
    			arr[i][j]=i+j;
    			System.out.print(" "+arr[i][j]);
    		}
    		System.out.println();
    	}
    	//求和
    	for(int i=0;i<arr.length;i++){
    		for(int j=0;j<arr.length;j++){
    			total+=arr[i][j];
    		}
    		System.out.println(total);
    	}
    }
}
