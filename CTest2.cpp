#include <stdio.h>
int main(){
	long long num=0;
	int a[1000];
	int i=0;
	int m=0;
	int yushu;
	char hex[16]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	scanf("%lld",&num);
	while(num>0){
		yushu=num%16;
		a[i++]=yushu;
		num=num/16;
	}
	for(i=i-1;i>=0;i--){
		m=a[i];
		printf("%c",hex[m]);
	}
	return 0;
}


//#include <stdio.h>
//int main(){
//	int n,i,j;
//	scanf("%d",&n);
//	int arr[n];
//	for(i=0;i<n;i++){
//		scanf("%d",&arr[i]);
//	}
//	for(i=0;i<n-1;i++){
//		for(j=0;j<n-1-i;j++){
//			if(arr[j]>arr[j+1]){
//				int t=arr[j];
//				arr[j]=arr[j+1];
//				arr[j+1]=t;
//			}
//		}
//	}
//	for(i=0;i<n;i++){
//		printf("%d ",arr[i]);
//	}
//}


//#include <stdio.h>
//int main(){
//	int a,b;
//    scanf("%d%d",&a,&b);
//	printf("%d",a+b);
//	return 0;
//}




//#include <stdio.h>
//int main(){
//    long long n,sum;
//    scanf("%lld",&n);
//    sum=n*(n+1)/2;
//    printf("%lld\n",sum);
//	return 0;
//} 




//#include <stdio.h>
//int main(){
//	long long a=100123223;
//	printf("%I64d\n",a);
//	printf("%Id\n",a);
//	printf("%d",a);
//	return 0;
//}



//#include <stdio.h>
//#include <math.h>
//#define PAI 3.14159265358979323
//int main(){
//	int r;
//	double n;
//	scanf("%d",&r);
//	n=PAI*pow(r,2);
//	printf("%.7f\n",n);
//	return 0;
//}
