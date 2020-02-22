/*小明的购物单 
*/
/*
#include <stdio.h>
int main(){
   double x,y;
   double count=0;
   freopen("r1.txt","r",stdin);
   while(scanf("%lf%lf",&x,&y)!=EOF){
   	count+=x*y/100;
   }
   printf("%lf",count);
   return 0; 
}
*/

//等差素数列  7,37,67,97,127,157...
//问：长度为10的等差素数列，其公差最小值是多少
/*
#include <stdio.h>
int main(){
	
	return 0;
} 
*/





/*
切巧克力，N块巧克力，K位小朋友，巧克力大小HiXWi 
*/
/*
#include <stdio.h>
#include <stdlib.h>

int cut(int* a,const int len,int c,int k){
	int i=0;
	int count=0;
	for(i=0;i<len/2;i+=2){
		count+=(a[i]/c)*(a[i+1]/c);
	}
	if(count>=k){
		return 1;
	}
	return 0;
}

int main(){
	int n,k;
	int l=0;
	int ans=10000;
	int i=0;
	int* a;
	scanf("%d%d",&n,&k);
	a=(int*)malloc(n*2*sizeof(int));
	for(i=0;i<2*n;i++){
		scanf("%d",&a[i]);
	}
	while(ans-1>1){
		int mid=(1+ans)/2;
		if(cut(a,2*n,mid,k)==0){
			ans=mid;
		}
		else{
			l=mid;
		}
	}
	printf("%d",l);
	return 0;
}


*/



//最大公共子串   

#include <stdio.h>
#include <string.h>
#define N 256

int f(const char* s1,const char* s2){
	int a[N][N];
	int len1=strlen(s1);
	int len2=strlen(s2);
	int i,j;
    memset(a,0,sizeof(int)*N*N);
	int max=0;
	for(i=1;i<=len1;i++){
		for(j=1;j<=len2;j++)
		{
			if(s1[i-1]==s2[j-1]){
				a[i][j]=a[i-1][j-1]+1;
				if(a[i][j]>max)
				max=a[i][j];
			}
		}
	}	
	return max;
}

int main(){
	printf("%d\n",f("abcdkkk","baabcdadabc"));
	return 0;
}




















 







