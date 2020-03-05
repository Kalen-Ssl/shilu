#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>   //getch()

#define M 1000       //定义常量M 

typedef struct item  //结构体 
{
    int type;        //收入或支出  1收入  2 支出
    int date;        //日期
    float money;     //金额
} ITEM;      


ITEM items[M];       //声明收支条目数组

int n = 0;           //收支条目

void print1();       //打印标题函数 
void print2();       //打印功能栏函数 
void input();        //插入函数 
void look();         //查看函数 
void Look2();        //按照年份查看函数 
void update();       //修改函数 
void Delete();       //删除函数 
void add();          //统计函数 

int main()
{
    int c;
    while(1)                      //重复调用 
	{
        system("cls");            //清屏
        print1();
        print2();
        scanf("%d",&c);
        switch(c)
		{
            case 1:
			input();
			break;
			
            case 2:
			look();
			break;
			
            case 3:
			update();
			break;
			
            case 4:
			Delete();
			break;
			
            case 5:
			Look2();
			break;
			
			case 6:
			add();
			break;
			 
            case 0:
			exit(0);          //退出程序 
			
            default:
			printf("\n*****输入错误，请重新输入！*****\n");
        }
    }
}


void print1()                  //打印标题 
{
    printf("———————————————————————————————-\n");
    printf("***************************************************************\n");
    printf("*                                                             *\n");
    printf("*                                                             *\n");
    printf("*                      个 人 收 支 系 统                      *\n");
    printf("*                                                             *\n");
    printf("*                                                             *\n");
    printf("***************************************************************\n");
    printf("———————————————————————————————-\n");
}


void print2()                 //打印功能栏 
{
    printf("|                        1. 输入收支信息                      |\n");
    printf("|                        2. 显示所有收支                      |\n");
    printf("|                        3. 修改收支信息                      |\n");
    printf("|                        4. 删除收支信息                      |\n");
    printf("|                        5. 查询某年所有收支                  |\n");
    printf("|                        6. 统计收支总数                      |\n");
    printf("|                        0. 退出本程序                        |\n");
    printf("---------------------------------------------------------------\n");
}


void input()                                          //输入
{ 
    ITEM item;  
    system("cls");                                    //清屏
    fflush(stdin);                                    //刷新输入缓冲取 ，防止误读数据
    char c;
    print1();                                         //打印
    printf("请输入录入信息的类型  1:收入  2:支出\n");
    scanf("%s",&c);
    if(c=='1')
	{
        printf("请输入收入信息\n");
        item.type = c;                              //输入类型 
    }
   else if(c=='2')
    {
    	 printf("请输入支出信息\n");
        item.type = c;                               
    }
	else 
	{
        printf("\n*****输入错误，请重新输入！*****\n");
        printf("任意键继续\n");
        getch();
        input();                                    //再次调用输入函数 
        return;
    }
    while(1)
	{
        printf("请输入日期 格式如:20180224 回车键确认\n");
        scanf("%d",&item.date);
        break;
    }
    printf("请输入金额 保留两位小数 回车键确认\n");
    scanf("%f",&item.money);
    items[n++] = item;                              //item赋给items[n]，n加一 
    printf("任意键继续\n");
    getch();
}


void look()                                          //查看函数 
{
    system("cls");
    print1();
    printf("*************************收入支出信息****************************\n\n");
    printf("编号\t\t类型\t\t日期\t\t\t金额\t\t\n");
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d\t\t",i+1);
        printf("%s\t\t",items[i].type=='1'?"收入":"支出");
        printf("%d\t\t",items[i].date);
        printf("%.2f\t\t\n",items[i].money);
    }
    printf("\n");
    printf("任意键继续\n");
    getch();
}


void Look2()
{
    system("cls");
    print1();
    printf("*************************收入支出信息****************************\n\n");
    int q,i;
    printf("请输入查找年份 格式如：2012\n");
    scanf("%d",&q);
    printf("编号\t\t类型\t\t日期\t\t\t金额\t\t\n");
   for(i=0;i<n;i++)
   {
   	  if(items[i].date/10000==q)                       //对比 
   	  {
   	  	printf("%d\t\t",i+1);
        printf("%s\t\t",items[i].type=='1'?"收入":"支出");
        printf("%d\t\t",items[i].date);
        printf("%.2f\t\t\n",items[i].money);
	  }
   }
    getch();
 
}


void update()
{
    ITEM item ;
    system("cls");                                 //清屏
    fflush(stdin);                                //刷新输入缓冲取 ，防止误读数据
    char c;
    print1();
    printf("请输入要修改的编号\n");
    int num;
    scanf("%d",&num);
    if(num>n)
	{
        printf("不存在该记录\n");
        printf("任意键继续\n");
        getch();
        return;
    }
    printf("请输入收支类型  1:收入  2:支出\n");
    fflush(stdin);                                //刷新输入缓冲取 ，防止误读数据
    scanf("%s",&c);
    if(c=='1'||c=='2')
    {
        printf("请输入%s信息\n",c=='1'?"收入":"支出");
        item.type = c;
    }
	else
    {
        printf("\n*****输入错误，请重新输入！*****\n");
        getch();
        update();                                 //再次调用函数 
        return;
    }
    
    printf("请输入日期 格式:yyyyMMdd 回车键确认\n");
    scanf("%d",&item.date);
    printf("请输入金额 保留两位小数 回车键确认\n");
    scanf("%f",&item.money);
    items[num-1] = item;     
    printf("任意键继续\n");
    getch();
}


void Delete()                                     //删除函数 
{ 
    ITEM item ;
    system("cls");                                //清屏
    fflush(stdin);                                //刷新输入缓冲取 ，防止误读数据
    print1();
    int num ;
    while(1)
	{
        printf("请输入要删除的编号\n");
        scanf("%d",&num);
        fflush(stdin);
        if(num>n||num<=0)
		{
            printf("编号不存在，请重新输入\n");
        }else
		{
          break;
        }
    }
    while(1){
        printf("真的要删除吗（Y/N）?");
        char c ;
        scanf("%c",&c);
        fflush(stdin);
        int i;
        if (c=='Y'||c=='y')
		{
            items[num-1] = item;     
            for(i=num;i<=n;i++)
			{
                items[i-1] = items[i];
            }
            n--;
            printf("删除成功\n");
            break;
        }
		else if(c=='N'||c=='n')
		{
            break;
        }else
		{
            printf("输入错误，请重新输入\n");
        }
    }
    printf("任意键继续\n");
    getch();
}

void add()
{
	system("cls");
    print1();
    printf("*************************收入支出信息****************************\n\n");
    printf("编号\t\t类型\t\t日期\t\t\t金额\t\t\n");
    int i,sum;                                     //定义钱数num和循环变量i 
    
    for(i=0;i<n;i++)    
    {
    	if(items[i].type=='1')
    	{
    		sum=sum+items[i].money;
    	}
    	else
    	{
    		sum=sum-items[i].money;
    	}
    }
    
    printf("您个人账目盈余亏损数据为：    %s%d",sum>=0?"收入":"支出",sum);
    printf("\n");
    printf("任意键继续\n");
    getch();
}

