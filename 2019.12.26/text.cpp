/*#include <stdio.h>
int main()
{
	int a[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
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
*/

// ¼ÆËã1/1-1/2+1/3-1/4+1/5 ¡­¡­ + 1/99 - 1/100 µÄÖµ

#include <stdio.h>
int main()
{
	int i, sum = 0, num = 0;
	for (i = 0; i < 50; i++)
	{
		sum = sum + 1 / (1 + 2i);
	}
	for (i = 1; i < 50; i++)
	{
		num = num + 1 / (2i);
	}
	printf("%f", sum - num);
	return 0;
}