#define _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<stdlib.h>
#include<time.h>
void Menu() {
	printf("**************************\n");
	printf("   1.开始游戏\n");
	printf("   0.退出游戏\n");
	printf("**************************\n");
	printf("请输入您的选择\n");
}
void fun() {
	int x;
	srand((unsigned int)time(0));//用时间戳来改变每次产生的随机数序列
	int to_guess = rand() % 100;//产生0到99的随机整数
	while (1) {
		printf("请输入您猜的数字\n");
		scanf("%d", &x);
		if (x > to_guess) {
			printf("高了\n");
		}
		else if (x < to_guess) {
			printf("低了\n");
		}
		else {
			printf("猜对了\n");
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
		printf("再见！\n");
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
		printf("找到了,下标为：%d\n", mid);
	}
	else
	{
		printf("没找到\n");
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
		printf("请输入您的密码：");
		char password[10] = { 0 };
		scanf("%s", password);
		if (strcmp(password, "123456") == 0) {//对比用户输入密码是否正确，默认正确密码为123456
			break;
		}
	}
	if (i < 3) {
		printf("登陆成功\n");
	}
	else {
		printf("您已输入错误3次，禁止登录\n");
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
