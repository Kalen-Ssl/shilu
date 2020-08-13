#include<stdio.h>
#define N 20
int max(int a,int b){
	if(a>b) return a;
	return b;
}
int main()
{
	int n,w,i,j;
	int v[N],val[N],a[N][N]={0};
	scanf("%d %d",&n,&w);
	for(i=1;i<=n;i++){
		scanf("%d",&v[i]);
	}
	for(i=1;i<=n;i++){
		scanf("%d",&val[i]);
	}
	for(i=1;i<=n;i++){
		for(j=1;j<=w;j++){
			if(j>=v[i]){
				a[i][j]=max(a[i-1][j],a[i-1][j-v[i]]+val[i]);
			}
			else{
				a[i][j]=a[i-1][j];
			}
		}
	}
	printf("%d",a[n][w]);
}
