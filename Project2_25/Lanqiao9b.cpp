//#include <stdio.h>
//
//int five(int z,int x,int y){
//	int c;
//	c=0;
//	while(z!=0){
//		if(z%5==0){
//			c++;
//			z/=5;
//		}else{
//			break;
//		}
//	}
//	return c;
//}
//
//int two(int z,int x,int y){
//	int c;
//	c=0;
//	while(z!=0){
//		if(z%2==0){
//			c++;
//			z/=2;
//		}
//		else
//		   break;
//	}
//	return c;
//}
//
//int main(){
//	int i,j,sum1=0,sum2=0;
//	int a[11][11];
//	for(i=1;i<=10;i++){
//		for(j=1;j<=10;j++){
//			scanf("%d",&a[i][j]);
//		}
//	}
//	for(i=1;i<=10;i++){
//		for(j=1;j<=10;j++){
//			sum1+=five(a[i][j],i,j);
//			sum2+=two(a[i][j],i,j);
//		}
//	}
//	if(sum1>=sum2)
//	    printf("%d\n",sum2);
//	else
//	    printf("%d\n",sum1);
//	return 0;
//}


//从数组中找出第k小的元素
#include <stdio.h>
#include <stdlib.h>
int quick_select(int a[],int l,int r,int k) {
	int p=rand()%(r-1+1)+1;   //在l和r之间随机选一个数
	int x=a[p];
	{
		int t=a[p];
		a[p]=a[r];
		a[r]=t;
	}
	int i=l,j=r;
	while(i<j) {
		while(i<j&&a[i]<x) i++;  //while循环在a[i]>=x时停止
		if(i<j) {
			a[j]=a[i];
			j--;
		}
		while(i<j&&a[j]>x)  j--;
		if(i<j) {
			a[i]=a[j];
			i++;
		}
	}
	a[i]=x;
	p=i;
	if(i-l+1==k) return a[i];
	if(i-l+1<k) return quick_select(a,i+1,r,k-(i-l+1));
	else
		return quick_select(a,l,i-1,k);
}


int main() {
	int a[]= {1,4,2,8,5,7,23,58,16,27,55,13,26,24,12};
	printf("%d\n",quick_select(a,0,14,5));
	return 0;
}








