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

/* 编写一个程序，输入一个句子，然后统计出这个句子当中不同的单词个数。例如：对于句子“one  little  two  little  three  little  boys”，总共有5个不同的单词：one,  little,  two,  three,  boys。
说明：
（1）由于句子当中包含有空格，所以应该用gets函数来输入这个句子；
（2）输入的句子当中只包含英文字符和空格，单词之间用一个空格隔开；
（3）不用考虑单词的大小写，假设输入的都是小写字符；
（4）句子长度不超过100个字符。
输入
输入只有一行，即一个英文句子。
输出
输出只有一行，是一个整数，表示句子中不同单词的个数。
样例输入

one  little  two  little  three  little  boys

样例输出

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
    gets(c);        //读到数组
    str=c;          //转化为string
    istringstream ss(str); //利用string流,自动去除空格
    string word;
    while(ss>>word) {
        arr.insert(word);
    }
        cout << arr.size()<< endl;
    return 0;

}

