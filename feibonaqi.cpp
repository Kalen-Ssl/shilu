//ì³²¨ÄÇÆõ 
//#include <stdio.h>
//#include <stdlib.h>
//int main()
//{
// int n = 0;
// int a = 1;
// int b = 1;
// int c = 0;
// int i = 0;
// scanf("%d", &n);
// printf("%5d %5d ", a, b);
// for (i = 0; i < n - 2;i++)
// {
//   c = a + b;
//   a = b;
//   b = c;
//   printf("%5d ", c);
// }
// printf("\n");
// return 0;
//}
#include <stdio.h>
#include <stdlib.h>
int fib(int n)
{
 if (n <= 2)
 {
  return 1;
 }
 else
 {
  return fib(n - 1) + fib(n - 2);
 }
}
int main()
{
 int n = 0;
 int ret = 0;
 scanf("%d", &n);
 ret = fib(n);
 printf("%d\n", ret);
 return 0;
}

