//1. 将数组A中的内容和数组B中的内容进行交换。（数组一样大）
//2. 计算1 / 1 - 1 / 2 + 1 / 3 - 1 / 4 + 1 / 5 …… + 1 / 99 - 1 / 100 的值。
//3. 编写程序数一下 1到 100 的所有整数中出现多少次数字9。
#include <stdio.h>
int main()
{
	int a[10] = {0,1,2,3,4,5,6,7,8,9};
	int b[10] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	int t = 0;
	int i;
	for (i = 0; i < sizeof(a) / sizeof(a[0]); i++)
	{
		t = a[i];
		a[i] = b[i];
		b[i] = t;
	}
	for (i = 0; i < sizeof(a) / sizeof(a[0]); i++)
	{
		printf("%d", a[i]);
	}
	printf("\n");
	for (i = 0; i < sizeof(b) / sizeof(b[0]); i++)
	{
		printf("%d", b[i]);
	}
	return 0;
}