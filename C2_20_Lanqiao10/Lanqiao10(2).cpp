/*
   С������λ�к���2,0,1,9�����ֺܸ���Ȥ��������ǰ��0������1��40��������������1,2,9,10
   ��32,39,40����28�������ǵĺ���574.
   ���ʣ���1��n�У����������������Ƕ��١�
   ���磬����40�����574 
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
��ȫ��������Ȩֵ 
����һ�Ű���N��������ȫ��������ÿ����㶼��һ��Ȩֵ�������ϵ��´����ҵ�˳��
������A1��A2��....An��
�������ͬ��ȵĽ��Ȩֵ����һ����֪���ĸ���ȵĽ��Ȩֵ֮���������ж����ȵ�Ȩֵ��ͬΪ���
�����������С����ȡ�
�������Ϊ1.

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
 		//��ÿ����㸳��Ȩֵ 
 		scanf("%d",&a[i]);
	 }
	 //����� 
	 int m=n;
	 while(m){
	 	m=m/2;
	 	k++;
	 } 
	 
	 //��ȱ�� 
	 int flag=0;
	 for(int i=1;i<=k;i++){
	 	int sum=0;
	 	for(int j=pow(2,i-1);j<pow(2,i);j++){  //ĳһ�������������Χ֮�� 
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
 �Ȳ����У�
 ֻ�ǵ�һ���Ȳ�������N���������������N����������̵Ȳ������м���
 ����N���ڶ�������N����������һ�����Ȳ������е�˳������� 
 ���һ��������
 �����N��2��100000֮�䣬Ai��0��10�Ĵη�֮�� 
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
	int d=100000;//�����ʼ��
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





























