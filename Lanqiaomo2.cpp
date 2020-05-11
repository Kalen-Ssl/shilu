//С����������һ��ȥ����ֲ�������Ǵ���һЩ���Լ�ʵ���Ҿ����о�����С���硣
//����С����������һ���� n ���ˣ����Ǿ���������ѡ����һ��յ���ÿ������ѡ��һ���ʺ�ֲ����λ�ã��ܹ� n ��������׼�����Լ��������綼ֲ��ȥ��
//����Ȼ��������������һ�����ѣ��е�����Ƚϴ󣬶��е�λ�ð�̫��������������ֲ��ȥ���ײ��һ��
//�������ǽ�������һ��Բ��Բ���������ҵ�λ���ϡ������������Ӧ��Բ�ཻ�����������Ͳ��ʺ�ͬʱֲ�£����в���Ӱ�죩����Ϊ��������ͻ��
//����С���������Ǿ����Ⱥϼƺϼƣ�ֻ�����е�һ������ֲ��ȥ����֤û�л����ͻ����������ͬʱϣ����Щ�����ܸ��ǵ�����ͣ�Բ����ͣ����
//�����ʽ
//��������ĵ�һ�а���һ������ n ����ʾ��������׼��ֲ����λ������
//���������� n �У�ÿ���������� x, y, r����ʾһ�����ڿյ��ϵĺᡢ������Ͱ뾶��
//�����ʽ
//�������һ�а���һ����������ʾ�ڲ���ͻ�¿���ֲ��������͡�����ÿ�������������Բ���ʵ���������������𰸳���Բ���ʺ��ֵ��Ӧ����һ����������
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





//��������
//��������
//��������һ�� n �� m �еı������ǿ���ʹ�������ķ�ʽ�������������������������ǳ���õı���Ϊһ����������
//�������磬һ�� 4 �� 5 �е������������£�
//����1 2 3 4 5
//����14 15 16 17 6
//����13 20 19 18 7
//����12 11 10 9 8
//�����ʽ
//��������ĵ�һ�а����������� n, m���ֱ��ʾ���������������������
//�����ڶ��а����������� r, c����ʾҪ����кź��кš�
//�����ʽ
//�������һ����������ʾ���������е� r �е� c �е�Ԫ�ص�ֵ�� 
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




////�ڶ�����
//���һ�����е��������ǰһ���ż�����ǰһ��С�����Ϊһ���ڶ����С��� a[2i]<a[2i-1], a[2i+1]>a[2i]��
//����С����֪��������Ϊ m��ÿ�������� 1 �� n ֮����������İڶ�����һ���ж��ٸ���
//�����ʽ
//��������һ�а����������� m��n��
//�����ʽ
//�������һ����������ʾ�𰸡��𰸿��ܴܺ�������𰸳���10000��������
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





//����һ�����ʣ���ʹ�ÿ������뽫������ʼ��ܡ�
//����������һ���滻���ܵļ����������е�������ĸ������ĸ�������ƫ��3λ���滻�����ġ�
//��a��Ϊd��b��Ϊe��...��w��Ϊz��x��Ϊa��y��Ϊb��z��Ϊc��
//���磬lanqiao����odqtldr��
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





//������������ a, b, c�����һ�������Ȳ��� a ��������Ҳ���� b �������������� c �������������������Ϊ��������
//������ 1 �� n ���ж��ٸ���������
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