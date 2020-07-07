#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#include<time.h>
void menu()
{
    printf("*********************************\n");
    printf("******        1. play       *****\n");
    printf("******        0. exit       *****\n");
    printf("*********************************\n");
}
 
void game()
{

    int ret = 0;
    int guess = 0;
    ret = rand()%100+1;//0-32767，取余之后是1~99然后+1
    while(1)
    {
        printf("请猜数字:>");
        scanf("%d", &guess);
        if(guess>ret)
        {
            printf("猜大了\n");
        }
        else if(guess<ret)
        {
            printf("猜小了\n");
        }
        else
        {
            printf("恭喜你，猜对了\n");
            break;
        }
    }
}
 
int main()
{
    int input = 0;
    srand((unsigned int)time(NULL));
    do 
    {
        //打印菜单
        menu();
        printf("请选择:>");
        scanf("%d", &input);
        switch(input)
        {
        case 1:
            game();
            break;
        case 0:
            printf("退出游戏\n");
            break;
        default:
            printf("选择错误，请重新选择!\n");
            break;
        }
    } while (input);
    return 0;
}
