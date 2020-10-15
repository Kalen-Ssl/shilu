#include <stdio.h>

//某君新认识一网友。
//当问及年龄时，他的网友说：
//“我的年龄是个2位数，我比儿子大27岁,
//如果把我的年龄的两位数字交换位置，刚好就是我儿子的年龄”
//
//请你计算：网友的年龄一共有多少种可能情况？
void test01(){
	int num=0;
	int i;
	for(i=10;i<=99;i++){
		if(i-27==i/10+i%10*10){
			num++;
		}
	}
	printf("%d",num);
}

/*
某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。

现在算起来，他一共吹熄了236根蜡烛。

请问，他从多少岁开始过生日party的？
*/

int test022(int a){
	int num=0;
	for(int i=1;i<=a;i++){
		num+=i;
	}
	return num;
}
void test02(){
	int i,j;
	for(i=0;i<150;i++){
		for(j=0;j<150;j++){
			if(test022(i)-test022(j)==236){
				printf("%d",j);
			}
		}
	}
}



int main2(){
	//test01();
	test02();
	return 0;
}


int num[3][4];
int sum=0;
bool isFilled[10];
int abs(int n){
	return n>=0?n:-n;
}
//在num[r][c]处防止i符合规则返回true 
bool isLegal(int r,int c,int val){
	if(r==0&&c==0)
	   return true;
	else if(r==0)
	   return abd(val-num[r][c-1])>1;
	else if(c==0)
	   return abs(val-num[r-1][c])>1&&abs(val-num[r-1][c+1])>1;
	 else if( c != 3 )
        return abs(val-num[r][c-1]) > 1 && abs(val-num[r-1][c]) > 1 && abs(val-num[r-1][c-1])>1 && abs(val-num[r-1][c+1])>1;
    else
        return abs(val-num[r][c-1]) > 1 && abs(val-num[r-1][c]) > 1 && abs(val-num[r-1][c-1])>1;   
}

void dfs(int r,int c){
	if(r==2&&c==3){
		sum++;
		return;
	}
	for(int i=0;i<=9;i++){
		if(!isFilled[i]&&isLegal(r,c,i)){
			num[r][c]=i;
			isFilled[i]=true;
			dfs(r+(c+1)/4),(c+1)%4);
			isFilled[i]=false;
		}
	}
}

int main3(){
	num[0][0]=-10;
	num[2][3]=-10;
	for(int i=0;i<10;i++){
		isFilled[i]=false;
	}
	dfs(0,1);
	printf("%d\n",sum);
	return 0;
}


//快排
#include <stdio.h>
void swap(int a[],int i,int j){
	int t=a[i];
	a[i]=a[j];
	a[j]=t;
}

int partition(int a[],int p,int r){
	int i = p;
    int j = r + 1;
    int x = a[p];
    while(1){
        while(i<r && a[++i]<x);
        while(a[--j]>x);
        if(i>=j) break;
        swap(a,i,j);
    }
    swap( a, p, j ); 
    return j;
}

void quickSort(int[] a,int p,int r){
	if(p<r){
		int q=partition(a,p,r);
		quickSort(a,p,q-1);
		quickSort(a,q+1,r);
	}
}

int main4(){
	int i;
	int a[]={5,13,6,24,2,8,19,27,6,12,1,17};
	int N=12;
	quickSort(a,0,N-1);
	for(i=0;i<N;i++){
		printf("%d ",a[i]);
	}
	printf("\n");
	
	return 0;
} 






