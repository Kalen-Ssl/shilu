//ÐÐÁÐ»¥»» 
#include<stdio.h>
int main()
{
 void rev(int array[3][3],int b[3][3]);
 int a[3][3],b[3][3];
 int i, j;
 printf("the array:\n");
 for (i = 0; i < 3; i++)
 {
  for (j = 0; j < 3; j++)
   scanf("%d", &a[i][j]);
  printf("\n");
 }
 printf("the new array:\n");
 rev(a,b);
 for (i = 0; i < 3; i++)
 {
 for (j = 0; j < 3; j++)
   printf("%d ", b[i][j]);
  printf("\n");
 }
 getchar();
 getchar();
 return 0;
}
void rev(int array[3][3],int b[3][3])
{
 int i, j;
 for (i = 0; i < 3; i++)
  for (j = 0; j < 3; j++)
   b[j][i] = array[i][j];
}

