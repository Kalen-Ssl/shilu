import java.util.Scanner;
public class Text{
	public static void main (String [] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k;
		int  n=sc.nextInt()%100;{
			for (i=1;i<=n;i++){
				for (j=1;j<=n-i;j++){
					System.out.print(" ");	
				}
				for(k=1;k<=2*i-1;k++)
				System.out.print('*');
				System.out.println();
		}}
		
		{
			for (i=n;i>1;i--){
				for (j=0;j<=n-i;j++){
					System.out.print(" ");	
				}
				for(k=1;k<=2*i-3;k++)
					System.out.print('*');
					System.out.println();
			}		}
	
	}
}