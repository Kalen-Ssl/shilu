#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void Menu() {
	printf("**************************\n");
	printf("   1.��ʼ��Ϸ\n");
	printf("   0.�˳���Ϸ\n");
	printf("**************************\n");
	printf("����������ѡ��\n");
}
void fun() {
	int x;
	srand((unsigned int)time(0));//��ʱ������ı�ÿ�β��������������
	int to_guess = rand() % 100;//����0��99���������
	while (1) {
		printf("���������µ�����\n");
		scanf("%d", &x);
		if (x > to_guess) {
			printf("����\n");
		}
		else if (x < to_guess) {
			printf("����\n");
		}
		else {
			printf("�¶���\n");
			break;
		}
	}
}
int main() {
	int num;
	Menu();
	scanf("%d", &num);
	system("cls");
	if (num == 1) {
		fun();
	}
	if (num == 0) {
		printf("�ټ���\n");
	}
	system("pause");
	return 0;
}

#include<stdio.h>
#include<stdlib.h>

int main()
{
	int arr[10] = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int to_find = 5;
	int left = 0;
	int right = 9;
	int mid = 0;
	while (left <= right)
	{
		mid = (left + right) / 2;
		if (arr[mid] < to_find)
		{
			left = mid + 1;
		}
		else if (arr[mid] > to_find)
		{
			right = mid - 1;
		}
		else
		{
			break;
		}
	}
	if (left <= right)
	{
		printf("�ҵ���,�±�Ϊ��%d\n", mid);
	}
	else
	{
		printf("û�ҵ�\n");
	}

	return 0;
}


#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main() {
	int i = 0;
	for (; i < 3; ++i) {
		printf("�������������룺");
		char password[10] = { 0 };
		scanf("%s", password);
		if (strcmp(password, "123456") == 0) {//�Ա��û����������Ƿ���ȷ��Ĭ����ȷ����Ϊ123456
			break;
		}
	}
	if (i < 3) {
		printf("��½�ɹ�\n");
	}
	else {
		printf("�����������3�Σ���ֹ��¼\n");
	}
	system("pause");
	return 0;
}


#include<stdio.h>
int main()
{
	char c;
	int t;
	while ((c = getchar()) != EOF){
		if (c >= 'a'&&c <= 'z')
		{
			t = c - 32;
			putchar(t);
		}
		else if (c >= 'A'&&c <= 'Z')
		{
			t = c + 32;
			putchar(t);
		}
		else
			break;
	}
	return 0;

}
