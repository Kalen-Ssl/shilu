
/*int main(void)
{
char string[] = "This is an example output string";
puts(string);
return 0;
}
*/

/*int main()
{
int i;
char string[20];
for (i = 0; i < 10; i++)
string[i] = 'a';
string[10] = '\0';
puts(string);
return 0;
}
*/

/*#include <stdio.h>
int main()
{
char a, b, c;
a = 'T'; b = 'M', c = 'D';
putchar(a);
putchar(b);
putchar(c);
putchar('\n');
putchar(a);
putchar('\n');
return 0;
}
*/

/*#include <stdio.h>
int main()
{
char c;
printf("�������ַ���");
c = getchar();
printf("������ַ���");
putchar(c);
return 0;
}
*/

/*#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
char str1[5];
gets(str1);
printf("%s\n", str1);
puts(str1);
return 0;
}
*/

//���ط���
/*
�ù�����һ�ٸ����䣬��1��100���˺š���һ������Ա�����еķ����Ŷ����ˣ�
�ڶ�������Ա�����б����2�ı����ķ��䡰�෴������
����������Ա�����б����3�ı����ķ��������෴������������
�Ժ�ÿ������Ա������ˡ��ʵ�100������Ա�������ļ������Ǵ򿪵ġ�
����ν���෴�����ǣ�ԭ�����ŵ��Ź��ϣ�ԭ�����ϵ��Ŵ򿪡���
*/
/*
#define _CRT_SECURE_NO_WARNING
#include <stdio.h>
int main()
{
	int i, j, m;
	int room[101];
	for (i = 1; i <= 100; i++)
	{
		room[i] = 1;
	}
	for (i = 2; i <= 100; i++)
	{
		for (j = 1; j <= 100; j++)
		{
			if (j % i == 0)
			{
				room[j] = room[j] * (-1);
			}
		}
	}
	for (m = 1; m <= 100; m++)
	{
		if (room[m] == 1)
		{
			printf("%d ", m);
		}
	}

	return 0;
}
/*
/*
#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
int main()
{
	for (int i = 1; i <= 9; i++)
	{
		for (int j = 1; j <= i; j++)
		{
			printf("%d*%d=%d ", j, i, j*i);
		}
		putchar('\n');
	}
	return 0;
}
*/

/*#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>
char word[100][20];
int count[100];
int words(char string[])
{
	int flag = 0, j = 0;
	char *p = string;
	while (*p)
	{
		if (*p >= 'a'&&*p <= 'z')
		{
			word[flag][j++] = *p - 32;
		}
		else if (*p >= 'A'&&*p <= 'Z')
		{
			word[flag][j++] = *p;
		}
		else
		{
			if (*(p + 1) >= 'a'&&*(p + 1) <= 'z' || *(p + 1) >= 'A'&&*(p + 1) <= 'Z')
			{
				word[flag][j] = '\0';
				flag++;
				j = 0;
			}

		}
		p++;

	}
	return flag;
}


void different(int n) //nΪ�Ѿ��õ��ĵ��ʸ���
{
	int i, j;
	for (i = 0; i <= n; i++)
	{
		if (strcmp(word[i], "") != 0)
		{
			count[i]++;
			for (j = i + 1; j <= n; j++)
			{
				if(strcmp(word[i],word[j])==0)
				{
					strcpy(word[j], "");
					count[i]++;
				}
			}
		}
	}

	for (i = 0; i <= n; i++)
	{
		if (count[i] > 0)
		{
			printf("%s:", word[i]);
			for (j = 0; j < count[i]; j++)
			{
				printf("*");
			}
			printf("%d\n", count[i]);
		}
	}
}



int main()
{
	

	int n;
	char string[1000];
	for (int i = 0; i < 100; i++)
	{
		count[i] = 0;
	}
	gets(string);
	n = words(string);
	different(n);
	return 0;
}
*/


