#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>

打印指定菱形
int main()
{
	int line = 0;
	int i = 0;
	scanf("%d", &line);
	for (i = 0; i<line; i++)
	{
		int j = 0;
		for (j = 0; j < line - i - 1; j++)
		{
			printf(" ");
		}
		for (j = 0; j < 2 * i + 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	for (i = 0; i < line - 1; i++)
	{
		int j = 0;
		for (j = 0; j <= i; j++)
		{
			printf(" ");
		}
		for (j = 0; j < 2 * (line - 1 - i) - 1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}



交换两个数的值
void swap(int &a, int &b)
{
	int t;
	t = a;
	a = b;
	b = t;
}

int main()
{
	int a, b;
	a = 3; b = 5;
	swap(a, b);
	printf("%d\n", a);
	printf("%d\n", b);
	return 0;
}





判断闰年
int  runnian(int x)
{
	if ((x % 4 == 0 && x % 100 != 0) || (x % 400 == 0))

		return 1;

	else

		return 0;

}

int main()
{
	int year = 0;
	int t = 0;
	printf("请输入一个闰年：");
	scanf("%d", &year);
	t = runnian(year);
	if (t == 1)
	{
		printf("%d 是闰年\n", year);
	}
	if (t == 0)
	{
		printf("%d 不是闰年\n", year);
	}
}




数组初始化、逆置、清空
void init(int arr[], int len)
{
	int i;
	printf("初始化数组：\n");
	for (i = 0; i < len; i++)
	{
		scanf("%d", &arr[i]);
	}
}

void reverse(int arr[], int len)
{
	int i;
	printf("数组逆置\n");
	int left = 0, right = len - 1;
	while (left < right)
	{
		int t = arr[left];
		arr[left] = arr[right];
		arr[right] = t;
		left++;
		right--;

	}

}

void empty(int arr[], int len)
{
	int i;
	printf("清空数组\n");
	for (i = 0; i < len; i++)
	{
		arr[i] = 0;
		printf("%d ", arr[i]);
	}
}
int main()
{
	int arr[10];
	int i, len;
	len = sizeof(arr) / sizeof(arr[0]);
	init(arr, len);
	reverse(arr, len);
	for (i = 0; i < len; i++)
	{
		printf("%d ", arr[i]);
	}
	printf("\n");
	empty(arr, len);
	return 0;
}


判断素数
int prime(int j)
{
	int i = 0;
	for (i = 2; i <j; i++)
	{
		if (j%i == 0)
		{
			return 0;
		}
	}
	return 1;

}

int main()
{
	int j = 0;
	scanf("%d", &j);
	if (prime(j))
	{
		printf("这个数是素数\n");
	}
	else
	{
		printf("这个数不是素数\n");
	}

}














