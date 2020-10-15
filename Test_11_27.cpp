/*有一堆煤球，堆成三角棱锥形。具体：
第一层放1个，
第二层3个（排列成三角形），
第三层6个（排列成三角形），
第四层10个（排列成三角形），
....
如果一共有100层，共有多少个煤球？
请填表示煤球总数目的数字。
注意：你提交的应该是一个整数，不要填写任何多余的内容或说明性文字。
*/

/*#include <stdio.h>
int main()
{
	int sum=0;  
	int num=0;
	for(int i=1;i<=100;i++)
	{
		sum=sum+i;
		num=sum+num;
	}
	printf("%d",num);
	return 0;
}*/


/*某君从某年开始每年都举办一次生日party，并且每次都要吹熄与年龄相同根数的蜡烛。
现在算起来，他一共吹熄了236根蜡烛。
请问，他从多少岁开始过生日party的？
请填写他开始过生日party的年龄数。
*/
/*#include <stdio.h>
int main()
{
	int i,j;
	int n=236;
	for(int i=1;i<=100;i++)
	{
		int sum=0;
		for(int j=i;j>0;j--)
		{
			sum=sum+j;
			if(sum==236)
			{
				printf("%d",j);
			}
			
		}
	}
	return 0;
 } 
 */
 
 
/*四平方和定理，又称为拉格朗日定理：
每个正整数都可以表示为至多4个正整数的平方和。
如果把0包括进去，就正好可以表示为4个数的平方和。
（^符号表示乘方的意思）
对于一个给定的正整数，可能存在多种平方和的表示法。
要求你对4个数排序：
0 <= a <= b <= c <= d
并对所有的可能表示法按 a,b,c,d 为联合主键升序排列，最后输出第一个表示法
程序输入为一个正整数N (N<5000000)
要求输出4个非负整数，按从小到大排序，中间用空格分开

*/

/*
#include <stdio.h>
#include <string.h>
 int my_strlen(char *s)
  {
  	char *p=s;
  	while(*p!=0)
  	{
  		p++;
	  }
	  return p-s;
  }
  

int main()
{
    char arr[]="i love china";
    char *arr2="and";
    printf("%d",my_strlen(arr));
	return 0;
}

*/
/*#include <stdio.h>
#include <string.h>
int count[100];
char word[100][28];

int words(char arr[])
{
	int a=0,b=0;
	char *p=arr;
	while(*p)
	{
		if(*p>='a'&&*p<='z')
		{
			word[a][b++]=*p;
		}
		else if(*p>='A'&&*p<='Z')
		{
			word[a][b++]=*p+32;
		}
		else
		{
			if(*(p+1)>='a' && *(p+1)<='z' || *(p+1)>='A' && *(p+1)<='Z')
			{
			word[a][b]='\0';
			a++;
			b=0;
	    	}
		}
		p++;
	}
	return a;
}


void dif(int n){
	int i,j;
	for( i=0;i<=n;i++)
	{
		if(strcmp(word[i],"")!=0)
		{
			count[i]++;
			for(j=i+1;j<=n;j++)
			{
				if(strcmp(word[i],word[j]==0))
				{
					strcpy(word[j],"");
					count[i]++;
				}
			}
    	}
	}
	for( i=0;i<=n;i++)
	{
		if(count[i]>0)
		{
		
	  	printf("%s",word[i]);
		for( j=0;j<count[i];j++)
		{
			printf("*");
		}
		printf("%d\n",	count[i]);
    	}
	}
}

int main()
{
	int n;
	char string[2800];
	memset(count,0,sizeof(count));
	gets(string);
	n=words(string);
	dif(n);
	return 0;
 } 
 */
 
 

  #include <stdio.h>
  #include <math.h> 
   int main()
   {    
       int i;   
       int s_n = 0;       //计算十六进制数组长度  
	   int index = 0;   //将s_n赋值给index，16的多少次幂    
	   int sum = 0;  //结果    
	   char sixteen[8];    //输入的字符串数组    
	   int sixteen_1[8];    //将输入的字符串数组转换成实数存入其中  
	   char SUM[50];       //存储结果   
	    int len = 0;     //计算SUM长度     
       scanf("%s",sixteen);    
	   for(i = 0; i < 8; i++)     //将char型的输入数据转换为int型数组 
		{       
		  switch(sixteen[i])       
		  {        
			case '0':            
				sixteen_1[s_n++] = 0;            
				break;        
			case '1':            
			     sixteen_1[s_n++] = 1;          
				break;        
			case '2':         
			   sixteen_1[s_n++] = 2;         
			    break;        
		    case '3':       
			     sixteen_1[s_n++] = 3;            
				 break;        
			case '4':         
			   sixteen_1[s_n++] = 4;        
			    break;        
			case '5':        
			    sixteen_1[s_n++] = 5;           
				 break;        
			case '6':        
			    sixteen_1[s_n++] = 6;       
				break;       
			case '7':         
			   sixteen_1[s_n++] = 7;            
			   break;        
			case '8':         
			   sixteen_1[s_n++] = 8;            
			   break;        
			case '9':        
			    sixteen_1[s_n++] = 9;        
				break;        
			case 'A':         
			   sixteen_1[s_n++] = 10;        
			    break;       
			case 'B':        
			    sixteen_1[s_n++] = 11;       
				break;       
			case 'C':       
			     sixteen_1[s_n++] = 12;            
				 break;       
			case 'D':       
			     sixteen_1[s_n++] = 13;            
				 break;       
			case 'E':        
			    sixteen_1[s_n++] = 14;            
				break;        
			case 'F':        
			    sixteen_1[s_n++] = 15;            
				break;       
			}    
	   }    
					  
		index = s_n;  
		for(i = 0; i < s_n; i++)   
		{       
			sum += sixteen_1[i] * pow(16,index - 1);       
			index--;   
		}    
		if(sum == 0)   
		 {       
			SUM[len++] = '0';   
		 }    
							   
		else  
		{        
			 while(sum > 0)        
		     {           
				SUM[len++] = sum % 10 + '0';           
			    sum /= 10;       
			  }  
		}    
		for(i = len - 1; i >= 0; i--)   
		 {       
			 printf("%c",SUM[i]);  
		}   
	return 0;
}

 
 
 
  
 





