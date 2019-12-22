package chapters2;

public class JaggedArrayinJava {
	public static void main(String[] args){
		int arr[][]=new int[5][];
		for(int i=0;i<arr.length;i++){
			arr[i]=new int[i+1];
		}
		int count=0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=count++;
			}
		}
		
		System.out.println("ÈçÏÂ£º");
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
