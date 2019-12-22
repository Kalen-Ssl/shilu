package chapters6;
//给定一个K值，将数组的后k个元素移动
public class Testnum {
   public static void main(String[] args){
	   int[] arr={1,2,3,4,5,6,7};
	   
	   //         7 1 2 3 4 5 6
	   int k=3;
	   for(int i=0;i<k;i++){
		   int a=arr[arr.length-1];
		   for(int j=arr.length-1;j>=1;j--){
			   arr[j]=arr[j-1];
		   }
		   arr[0]=a;
	   }
	   for(int g=0;g<arr.length;g++){
		   System.out.print(arr[g]+" ");
	   }
	  
   }
}
