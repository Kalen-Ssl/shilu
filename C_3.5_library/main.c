#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <conio.h>   //getch()

#define M 1000       //���峣��M 

typedef struct item  //�ṹ�� 
{
    int type;        //�����֧��  1����  2 ֧��
    int date;        //����
    float money;     //���
} ITEM;      


ITEM items[M];       //������֧��Ŀ����

int n = 0;           //��֧��Ŀ

void print1();       //��ӡ���⺯�� 
void print2();       //��ӡ���������� 
void input();        //���뺯�� 
void look();         //�鿴���� 
void Look2();        //������ݲ鿴���� 
void update();       //�޸ĺ��� 
void Delete();       //ɾ������ 
void add();          //ͳ�ƺ��� 

int main()
{
    int c;
    while(1)                      //�ظ����� 
	{
        system("cls");            //����
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
			exit(0);          //�˳����� 
			
            default:
			printf("\n*****����������������룡*****\n");
        }
    }
}


void print1()                  //��ӡ���� 
{
    printf("��������������������������������������������������������������-\n");
    printf("***************************************************************\n");
    printf("*                                                             *\n");
    printf("*                                                             *\n");
    printf("*                      �� �� �� ֧ ϵ ͳ                      *\n");
    printf("*                                                             *\n");
    printf("*                                                             *\n");
    printf("***************************************************************\n");
    printf("��������������������������������������������������������������-\n");
}


void print2()                 //��ӡ������ 
{
    printf("|                        1. ������֧��Ϣ                      |\n");
    printf("|                        2. ��ʾ������֧                      |\n");
    printf("|                        3. �޸���֧��Ϣ                      |\n");
    printf("|                        4. ɾ����֧��Ϣ                      |\n");
    printf("|                        5. ��ѯĳ��������֧                  |\n");
    printf("|                        6. ͳ����֧����                      |\n");
    printf("|                        0. �˳�������                        |\n");
    printf("---------------------------------------------------------------\n");
}


void input()                                          //����
{ 
    ITEM item;  
    system("cls");                                    //����
    fflush(stdin);                                    //ˢ�����뻺��ȡ ����ֹ�������
    char c;
    print1();                                         //��ӡ
    printf("������¼����Ϣ������  1:����  2:֧��\n");
    scanf("%s",&c);
    if(c=='1')
	{
        printf("������������Ϣ\n");
        item.type = c;                              //�������� 
    }
   else if(c=='2')
    {
    	 printf("������֧����Ϣ\n");
        item.type = c;                               
    }
	else 
	{
        printf("\n*****����������������룡*****\n");
        printf("���������\n");
        getch();
        input();                                    //�ٴε������뺯�� 
        return;
    }
    while(1)
	{
        printf("���������� ��ʽ��:20180224 �س���ȷ��\n");
        scanf("%d",&item.date);
        break;
    }
    printf("�������� ������λС�� �س���ȷ��\n");
    scanf("%f",&item.money);
    items[n++] = item;                              //item����items[n]��n��һ 
    printf("���������\n");
    getch();
}


void look()                                          //�鿴���� 
{
    system("cls");
    print1();
    printf("*************************����֧����Ϣ****************************\n\n");
    printf("���\t\t����\t\t����\t\t\t���\t\t\n");
    int i;
    for(i=0;i<n;i++)
    {
        printf("%d\t\t",i+1);
        printf("%s\t\t",items[i].type=='1'?"����":"֧��");
        printf("%d\t\t",items[i].date);
        printf("%.2f\t\t\n",items[i].money);
    }
    printf("\n");
    printf("���������\n");
    getch();
}


void Look2()
{
    system("cls");
    print1();
    printf("*************************����֧����Ϣ****************************\n\n");
    int q,i;
    printf("������������ ��ʽ�磺2012\n");
    scanf("%d",&q);
    printf("���\t\t����\t\t����\t\t\t���\t\t\n");
   for(i=0;i<n;i++)
   {
   	  if(items[i].date/10000==q)                       //�Ա� 
   	  {
   	  	printf("%d\t\t",i+1);
        printf("%s\t\t",items[i].type=='1'?"����":"֧��");
        printf("%d\t\t",items[i].date);
        printf("%.2f\t\t\n",items[i].money);
	  }
   }
    getch();
 
}


void update()
{
    ITEM item ;
    system("cls");                                 //����
    fflush(stdin);                                //ˢ�����뻺��ȡ ����ֹ�������
    char c;
    print1();
    printf("������Ҫ�޸ĵı��\n");
    int num;
    scanf("%d",&num);
    if(num>n)
	{
        printf("�����ڸü�¼\n");
        printf("���������\n");
        getch();
        return;
    }
    printf("��������֧����  1:����  2:֧��\n");
    fflush(stdin);                                //ˢ�����뻺��ȡ ����ֹ�������
    scanf("%s",&c);
    if(c=='1'||c=='2')
    {
        printf("������%s��Ϣ\n",c=='1'?"����":"֧��");
        item.type = c;
    }
	else
    {
        printf("\n*****����������������룡*****\n");
        getch();
        update();                                 //�ٴε��ú��� 
        return;
    }
    
    printf("���������� ��ʽ:yyyyMMdd �س���ȷ��\n");
    scanf("%d",&item.date);
    printf("�������� ������λС�� �س���ȷ��\n");
    scanf("%f",&item.money);
    items[num-1] = item;     
    printf("���������\n");
    getch();
}


void Delete()                                     //ɾ������ 
{ 
    ITEM item ;
    system("cls");                                //����
    fflush(stdin);                                //ˢ�����뻺��ȡ ����ֹ�������
    print1();
    int num ;
    while(1)
	{
        printf("������Ҫɾ���ı��\n");
        scanf("%d",&num);
        fflush(stdin);
        if(num>n||num<=0)
		{
            printf("��Ų����ڣ�����������\n");
        }else
		{
          break;
        }
    }
    while(1){
        printf("���Ҫɾ����Y/N��?");
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
            printf("ɾ���ɹ�\n");
            break;
        }
		else if(c=='N'||c=='n')
		{
            break;
        }else
		{
            printf("�����������������\n");
        }
    }
    printf("���������\n");
    getch();
}

void add()
{
	system("cls");
    print1();
    printf("*************************����֧����Ϣ****************************\n\n");
    printf("���\t\t����\t\t����\t\t\t���\t\t\n");
    int i,sum;                                     //����Ǯ��num��ѭ������i 
    
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
    
    printf("��������Ŀӯ���������Ϊ��    %s%d",sum>=0?"����":"֧��",sum);
    printf("\n");
    printf("���������\n");
    getch();
}

