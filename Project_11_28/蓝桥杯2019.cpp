//蓝桥杯2019 
//小明用字母 A 对应数字 1，B 对应 2，以此类推，用 Z 对应 26。对于 27
//以上的数字，小明用两位或更长位的字符串来对应，例如 AA 对应 27，AB 对
//应 28，AZ 对应 52，LQ 对应 329。
//请问 2019 对应的字符串是什么？


/*#include <stdio.h>
int main()
{
	int a=2019;

	a=2019%26;
		printf("%d ",a);
		a=2019/26%26;
			printf("%d ",a);
	int b=2019/26/26;
	printf("%d",b);
	return 0;
}
*/




//给定数列 1, 1, 1, 3, 5, 9, 17, …，从第 4 项开始，每项都是前 3 项的和。求
//第 20190324 项的最后 4 位数字。
/*#include <stdio.h>
int yushu(int n)
{
	if(n<=3)
	{
		return 1;
	}
	int a=1,b=1,c=1;
	int sum=0;
	for(int i=4;i<=n;i++)
	{
		sum=(a+b+c)%10000;
		a=b;
		b=c;
		c=sum;
	}
	printf("%d",sum);
	
}
int main()
{
	yushu(20190324);
	return 0;
}*/


//把 2019 分解成 3 个各不相同的正整数之和，并且要求每个正整数都不包
//含数字 2 和 4，一共有多少种不同的分解方法？
//注意交换 3 个整数的顺序被视为同一种方法，例如 1000+1001+18 和
//1001+1000+18 被视为同一种。

/*
#include <stdio.h>


	bool twofour(int n)   //判断某个数字中是否包含2或4
	{
	    while(n)
	    {
	    	if((n%10==2)||(n%10==4))
	    	{
	    		return true;
			}
			n=n/10;
		}
		return false;
    }
    
    //有数字出现2和4，或者出现重复数字，返回0
	bool chongfu(int a,int b,int c)
	{
		if(twofour(a)||twofour(b)||twofour(c)||a==b||a==c||b==c)
		{
			return false; 
		}
		
			return true;
		
	} 

int main()
{
	int num=0;
    for(int i=1;i<2019;i++)
    {
    	for(int j=1;j<2019;j++)
    	{
    		for(int k=1;k<2019;k++)
    		{
    		    if(i+j+k==2019)
    		    {
    		    	num=num+chongfu(i,j,k);
				}
			}
		}
	}
	printf("%d",num/6);

    
	return 0;
}

*/

/*时间限制: 1.0s 内存限制: 256.0MB 本题总分：15 分
【问题描述】
小明对数位中含有 2、0、1、9 的数字很感兴趣（不包括前导 0） ，在 1 到
40 中这样的数包括 1、2、9、10 至 32、39 和 40，共 28 个，他们的和是 574。
请问，在 1 到 n 中，所有这样的数的和是多少？
【输入格式】
输入一行包含两个整数 n。
【输出格式】
输出一行，包含一个整数，表示满足条件的数的和。
【样例输入】
40
【样例输出】
574
*/


/*#include <stdio.h>
bool nums(int n)
{
    while(n)
	{
	   if((n%10==0)||(n%10==1)||(n%10==2)||(n%10==9))
	   {
	   	  return true;
	   }
	   n/=10;
	}	
	return false;
}

int main()
{
	int i,n;
	int sum=0;
	scanf("%d",&n);
	for(i=1;i<=n;i++)
	{
		 if(nums(i))
       {
     	  sum+=i;
	   }
	}
    printf("%d ",sum);
	return 0;
}

*/

/*数学老师给小明出了一道等差数列求和的题目。但是粗心的小明忘记了一
部分的数列，只记得其中 N 个整数。
现在给出这 N 个整数，小明想知道包含这 N 个整数的最短的等差数列有
几项？
【输入格式】
输入的第一行包含一个整数 N。
第二行包含 N 个整数 A 1 ,A 2 ,··· ,A N 。(注意 A 1 ～ A N 并不一定是按等差数
列中的顺序给出)
【输出格式】
输出一个整数表示答案。
【样例输入】
5
2 6 4 10 20
【样例输出】
10
【样例说明】
包含 2、6、4、10、20 的最短的等差数列是 2、4、6、8、10、12、14、16、
18、20。
*/

#include <stdio.h>
int value[10000];
int sort(int a,int b)
{
	int t;
	while(a){
		
	}
}

int main()
{
	int i,n;
	int max,min;
	scanf("%d",n);
	for(i=0;i<5;i++)
	{
		scanf("%d",&value[i]);
		max=value[0];
		min=value[0];
		if(value[i]>max)
		{
			max=value[i];
		}
		if(value[i]<min)
		{
			min=value[i];
		}
	}
	sort(value,value+n);
	return 0;
}












