/*��һ��ú�򣬶ѳ�������׶�Ρ����壺
��һ���1����
�ڶ���3�������г������Σ���
������6�������г������Σ���
���Ĳ�10�������г������Σ���
....
���һ����100�㣬���ж��ٸ�ú��
�����ʾú������Ŀ�����֡�
ע�⣺���ύ��Ӧ����һ����������Ҫ��д�κζ�������ݻ�˵�������֡�
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


/*ĳ����ĳ�꿪ʼÿ�궼�ٰ�һ������party������ÿ�ζ�Ҫ��Ϩ��������ͬ����������
��������������һ����Ϩ��236������
���ʣ����Ӷ����꿪ʼ������party�ģ�
����д����ʼ������party����������
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
 
 
/*��ƽ���Ͷ����ֳ�Ϊ�������ն���
ÿ�������������Ա�ʾΪ����4����������ƽ���͡�
�����0������ȥ�������ÿ��Ա�ʾΪ4������ƽ���͡�
��^���ű�ʾ�˷�����˼��
����һ�������������������ܴ��ڶ���ƽ���͵ı�ʾ����
Ҫ�����4��������
0 <= a <= b <= c <= d
�������еĿ��ܱ�ʾ���� a,b,c,d Ϊ���������������У���������һ����ʾ��
��������Ϊһ��������N (N<5000000)
Ҫ�����4���Ǹ�����������С���������м��ÿո�ֿ�

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
       int s_n = 0;       //����ʮ���������鳤��  
	   int index = 0;   //��s_n��ֵ��index��16�Ķ��ٴ���    
	   int sum = 0;  //���    
	   char sixteen[8];    //������ַ�������    
	   int sixteen_1[8];    //��������ַ�������ת����ʵ����������  
	   char SUM[50];       //�洢���   
	    int len = 0;     //����SUM����     
       scanf("%s",sixteen);    
	   for(i = 0; i < 8; i++)     //��char�͵���������ת��Ϊint������ 
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

 
 
 
  
 





