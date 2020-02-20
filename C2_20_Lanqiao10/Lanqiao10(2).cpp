/*
   小明对数位中含有2,0,1,9的数字很感兴趣（不包括前导0），在1到40中这样的数包括1,2,9,10
   至32,39,40，共28个，他们的和是574.
   请问，在1到n中，所有这样的数和是多少。
   例如，输入40，输出574 
*/ 
    
//   #include <stdio.h>
//   int a[10001]={0};
//   int main()
//   {
//   	   int i,n,num,sum=0;
//   	   for(int i=1;i<=10000;i++){	  
//   	   num=i;
//   	   while(num>0){
//   	   	 if(num%10==2||num%10==0||num%10==1||num%10==9){
//   	   	 	a[i]=1;
//   	   	 	break;
//		  }
//		  num=num/10;
//	   }
//      }
//	   scanf("%d",&n);
//	   for(i=1;i<=n;i++){
//	   	if(a[i]==1){
//	   		sum=sum+i;
//		   }
//	   }
//	  printf("%d",sum);
//	   return 0;
//	} 








/*
完全二叉树的权值 
给定一颗包含N个结点的完全二叉树，每个结点都有一个权值，按从上到下从左到右的顺序
依次是A1，A2，....An。
如果把相同深度的结点权值加在一起，想知道哪个深度的结点权值之和最大，如果有多个深度的权值和同为最大，
请输出其中最小的深度。
根的深度为1.

*/
 
  /*
 #include <stdio.h>
 #include <math.h>
 int a[100];
 int max=-100000;
 
 int main(){
 	int n,k=0;
 	scanf("%d",&n);
 	for(int i=1;i<=n;i++){
 		//给每个结点赋予权值 
 		scanf("%d",&a[i]);
	 }
	 //求深度 
	 int m=n;
	 while(m){
	 	m=m/2;
	 	k++;
	 } 
	 
	 //深度标记 
	 int flag=0;
	 for(int i=1;i<=k;i++){
	 	int sum=0;
	 	for(int j=pow(2,i-1);j<pow(2,i);j++){  //某一层结点标号在这个范围之间 
	 		sum+=a[j];
		 }
		 if(max<sum){
		 	max=sum;
		 	flag=i;
		 }
	 }
	 printf("%d",flag);
 	return 0;
 } 
 
 
 
 
 
 
 
 */
 
 /*
 等差数列：
 只记得一个等差数列中N个整数，求包含这N哥整数的最短等差序列有几项
 输入N，第二行输入N个整数（不一定按等差数列中的顺序给出） 
 输出一个整数。
 输入的N在2与100000之间，Ai在0到10的次方之间 
 */

void  sort(int arr[],int x,int y){
	int i,j;
	for(int i=0;i<y;i++){
		for(int j=i+1;j<y;j++){
			if(arr[i]>arr[j]){
				int t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
}

int getGcd(int a,int b){
	//return b==0?a:getGcd(b,a%b);
	int r;
	if(a<b){
		r=a;
		a=b;
		b=r;
	}
	while(r){
		r=a%b;
		a=b;
		b=r;
	}
	return a;
}

#include <stdio.h>
int main(){
	int arr[100100];
	int arr2[50100];
	int n,x,y,z,gcd,num;
	int d=100000;//公差初始化
	scanf("%d",&n);
	for(int i=0;i<n;i++){
		scanf("%d",&arr[i]);
	} 
    
    sort(arr,0,n);
    
	for(int i=0;i<n-1;i++){
		arr2[i]=arr[i+1]-arr[i];
	} 
	
	sort(arr2,0,n-1);
	
	if(arr2[0]==0){
	printf("%d",n);
	}else{
	    gcd=arr2[0];
		for(int i=1;i<n;i++){
			gcd=getGcd(gcd,arr2[i]);
		}
	}
	num=(arr[n-1]-arr[0])/gcd+1;
	printf("%d",num);
	return 0;
}





























