/*#include<stdio.h>
#include<string.h>
#define WORD 105
#define LENTH 25
int count[WORD];
char word[WORD][LENTH];
void different(int n)
{
	int i,j;
	for(i=0;i<=n;i++)
	{
		if(strcmp(word[i],"")!=0)
		{
			count[i]++;
			for(j=i+1;j<=n;j++)
			{
				if(strcmp(word[i],word[j])==0)
				{
					strcpy(word[j],"");
					count[i]++;
				}
			}
		}	
	}
	for(i=0;i<=n;i++)
	{
		if(count[i]>0)
		{
			printf("%s:",word[i]);
			for(j=0;j<count[i];j++)
			{
				printf("*");
			}
			printf("%d\n",count[i]);
		}
	}
}
int words(char string[])
{
	int flag=0,j=0;
	char *p=string;
	while(*p)
	{
		if(*p>='a' && *p<='z')
		{
			word[flag][j++]=*p-32;
		}
		else if(*p>='A' && *p<='Z')
		{
			word[flag][j++]=*p;
		}
		else
		{
			if(*(p+1)>='a' && *(p+1)<='z' || *(p+1)>='A' && *(p+1)<='Z')
			{
				word[flag][j]='\0';
				flag++;
				j=0;
			}
		}
		p++;
	}
/*	for(int i=0;i<=flag;i++)
	{
		puts(word[i]);
	} 
*//*	return flag;
}
int main()
{
	int n;
	char string[WORD*LENTH];
	memset(count,0,sizeof(count));
	gets(string);
	n=words(string);
	different(n);
	return 0;
}
*/ 


//////////////////////////////////////

/* ��дһ����������һ�����ӣ�Ȼ��ͳ�Ƴ�������ӵ��в�ͬ�ĵ��ʸ��������磺���ھ��ӡ�one  little  two  little  three  little  boys�����ܹ���5����ͬ�ĵ��ʣ�one,  little,  two,  three,  boys��
˵����
��1�����ھ��ӵ��а����пո�����Ӧ����gets����������������ӣ�
��2������ľ��ӵ���ֻ����Ӣ���ַ��Ϳո񣬵���֮����һ���ո������
��3�����ÿ��ǵ��ʵĴ�Сд����������Ķ���Сд�ַ���
��4�����ӳ��Ȳ�����100���ַ���
����
����ֻ��һ�У���һ��Ӣ�ľ��ӡ�
���
���ֻ��һ�У���һ����������ʾ�����в�ͬ���ʵĸ�����
��������

one  little  two  little  three  little  boys

�������

5
*/ 
#include <iostream>
#include <sstream>
#include <set>
#include<cstdio>
using namespace std;
int main() {
    string str;
    char c[101];
    set<string> arr;
    gets(c);        //��������
    str=c;          //ת��Ϊstring
    istringstream ss(str); //����string��,�Զ�ȥ���ո�
    string word;
    while(ss>>word) {
        arr.insert(word);
    }
        cout << arr.size()<< endl;
    return 0;

}

