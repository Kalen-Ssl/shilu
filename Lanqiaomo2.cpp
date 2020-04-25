//小明和朋友们一起去郊外植树，他们带了一些在自己实验室精心研究出的小树苗。
//　　小明和朋友们一共有 n 个人，他们经过精心挑选，在一块空地上每个人挑选了一个适合植树的位置，总共 n 个。他们准备把自己带的树苗都植下去。
//　　然而，他们遇到了一个困难：有的树苗比较大，而有的位置挨太近，导致两棵树植下去后会撞在一起。
//　　他们将树看成一个圆，圆心在他们找的位置上。如果两棵树对应的圆相交，这两棵树就不适合同时植下（相切不受影响），称为两棵树冲突。
//　　小明和朋友们决定先合计合计，只将其中的一部分树植下去，保证没有互相冲突的树。他们同时希望这些树所能覆盖的面积和（圆面积和）最大。
//输入格式
//　　输入的第一行包含一个整数 n ，表示人数，即准备植树的位置数。
//　　接下来 n 行，每行三个整数 x, y, r，表示一棵树在空地上的横、纵坐标和半径。
//输出格式
//　　输出一行包含一个整数，表示在不冲突下可以植树的面积和。由于每棵树的面积都是圆周率的整数倍，请输出答案除以圆周率后的值（应当是一个整数）。
#include <iostream>
#include <cstdio>
#include <cstring>
#include <algorithm>
#include <cmath>

using namespace std;

const int MAXN = 1000 + 10;
int n;
int x[MAXN], y[MAXN], r[MAXN];
double pi = acos(-1);
bool vis[MAXN];
int ans = 0;

bool cal(int i)
{
	for(int j = 0; j < n; j ++)
	{
		if(i != j && vis[j])
		{
			int dis = (x[i] - x[j]) * (x[i] - x[j]) + (y[i] - y[j]) * (y[i] - y[j]);
			if(dis < (r[i] + r[j]) * (r[i] + r[j])) return false;
		}
	}
	return true;
}

void dfs(int step, int sum)
{
	if(step == n)
	{
		ans = max(ans, sum);
		return;
	}
	for(int i = 0; i < n; i ++)
	{
		if(!vis[i])
		{
			int tmp = r[i];
			if(!cal(i)) r[i] = 0;
			vis[i] = true;
			dfs(step + 1, sum + r[i] * r[i]);
			vis[i] = false;
			r[i] = tmp;
		}
	}
}

int main()
{
	scanf("%d", &n);
	for(int i = 0; i < n; i ++)
		scanf("%d%d%d", &x[i], &y[i], &r[i]);
	dfs(0, 0);
	printf("%d", ans);
	return 0;
}





//螺旋矩阵
//问题描述
//　　对于一个 n 行 m 列的表格，我们可以使用螺旋的方式给表格依次填上正整数，我们称填好的表格为一个螺旋矩阵。
//　　例如，一个 4 行 5 列的螺旋矩阵如下：
//　　1 2 3 4 5
//　　14 15 16 17 6
//　　13 20 19 18 7
//　　12 11 10 9 8
//输入格式
//　　输入的第一行包含两个整数 n, m，分别表示螺旋矩阵的行数和列数。
//　　第二行包含两个整数 r, c，表示要求的行号和列号。
//输出格式
//　　输出一个整数，表示螺旋矩阵中第 r 行第 c 列的元素的值。 
//#include<iostream>
//using namespace std;
//int main()
//{
//    int n,m;
//    cin>>n>>m;
//    int r,c;
//    cin>>r>>c;
//    int a[n][m];
//    for(int x=0;x<n;x++)
//    {
//    	for(int y=0;y<m;y++)
//    	{
//    		a[x][y]=0;
//    	}
//    }
//    int i=0,j=0;
//    int t=1;
//    while(true)
//    {
//        while(a[i][j]==0 && j<m)
//        {
//            a[i][j]=t;
//            t++;
//            j++;
//        }
//        j--;
//        i++;
//        while(a[i][j]==0 && i<n)
//        {
//            a[i][j]=t;
//            t++;
//            i++;
//        }
//        i--;
//        j--;
//        while(a[i][j]==0 && j>=0)
//        {
//            a[i][j]=t;
//            t++;
//            j--;
//        }
//        i--;
//        j++;
//        while(a[i][j]==0 && i>=0)
//        {
//            a[i][j]=t;
//            t++;
//            i--;
//        }
//        i++;
//        j++;
//        if(a[r-1][c-1]!=0)
//        {
//        	cout<<a[r-1][c-1];
//        	return 0;
//        }
//    }
//
//}
//




////摆动序列
//如果一个序列的奇数项都比前一项大，偶数项都比前一项小，则称为一个摆动序列。即 a[2i]<a[2i-1], a[2i+1]>a[2i]。
//　　小明想知道，长度为 m，每个数都是 1 到 n 之间的正整数的摆动序列一共有多少个。
//输入格式
//　　输入一行包含两个整数 m，n。
//输出格式
//　　输出一个整数，表示答案。答案可能很大，请输出答案除以10000的余数。
//#include <stdio.h>
//
//#define MAXN 1004
//#define MOD 10000
//
//int d[MAXN][MAXN];
//
//int main()
//{
//    int m,n,i,j;
//    scanf("%d%d",&m,&n);
//
//    for(i = 1; i <= n; i++)
//        d[1][i] = n - i + 1;
//
//    for(i = 2; i <= m; i++)
//        if(i & 1)
//            for(j = n; j >= 1; j--)
//                    d[i][j] = (d[i-1][j-1] + d[i][j+1]) % MOD;
//        else
//            for(j = 1; j <= n; j++)
//                d[i][j] = (d[i-1][j+1] + d[i][j-1]) % MOD;
//
//    int ans = m & 1 ? d[m][1] : d[m][n];
//    printf("%d", ans);
//    return 0;
//}





//给定一个单词，请使用凯撒密码将这个单词加密。
//凯撒密码是一种替换加密的技术，单词中的所有字母都在字母表上向后偏移3位后被替换成密文。
//即a变为d，b变为e，...，w变为z，x变为a，y变为b，z变为c。
//例如，lanqiao会变成odqtldr。
//A 65   Z 90    a97   z122
//#include <stdio.h>
//#include <string.h>
//int main(){
//	char s[101];
//	int i;
//	scanf("%s",s);
//	for(i=0;i<strlen(s);i++){
//		if(s[i]>='a'&&s[i]<='w'){
//			s[i]+=3;
//		}
//		if(s[i]>='x'&&s[i]<='z'){
//			s[i]-=23;
//		}
//	}
//	printf("%s",s);
//	return 0;
//}





//给定三个整数 a, b, c，如果一个整数既不是 a 的整数倍也不是 b 的整数倍还不是 c 的整数倍，则这个数称为反倍数。
//请问在 1 至 n 中有多少个反倍数。
//#include <stdio.h>
//int main(){
//	int i,n,a,b,c,num=0;
//	scanf("%d",&n);
//	scanf("%d%d%d",&a,&b,&c);
//	for(i=1;i<=n;i++){
//		if(i%a!=0&&i%b!=0&&i%c!=0){
//			num++;
//		}
//	}
//	printf("%d",num);
//	return 0;
//}

//#include <stdio.h>
//int main(){
//	printf("%f",12.5*1024);
//	return 0;
//}
