////����ժƻ�� 
//#include <stdio.h>
//int main(){
//	int a[10];//ʮ��ƻ���ĸ߶� 
//	int b;//����ֱ�ĸ߶� 
//	int c=0;//ժ����ƻ������
//	for(int i=0;i<10;i++){
//		scanf("%d",&a[i]);
//	} 
//	scanf("%d",&b);
//	for(int n=0;n<10;n++){
//		if(a[n]<=(b+30)){
//			c++;
//		}
//	}
//	printf("%d",c);
//	return 0;
//}


#include <stdio.h>
#include <string.h>

int main(void)
{
    char s[256];
    int i,j,len;
    int count_b = 0,count_g = 0;

    scanf("%s", s);
    len = strlen(s);
    for(i = 0; i < len; i++)
    {
        //�����ĵ���"boy" 
        if(i+2 < len && s[i] == 'b' && s[i+1] == 'o' && s[i+2] == 'y')
        {
            count_b++;
            i += 2;
            continue;
        }
        //�����ĵ���"girl" 
        if(i+3 < len && s[i] == 'g' && s[i+1] == 'i' && s[i+2] == 'r' && s[i+3] == 'l')
        {
            count_g++;
            i += 3;
            continue;
        }
        //�ж��ǲ���"boy" 
        if(s[i] == 'b' && i+2 < len)
        {
            count_b++;
        }
        if(s[i] == 'o' && s[i-1] != 'b' && i-1 >= 0 && i+1 < len) //������ĸ��ǰһ����ĸ��"boy"�����ĸ�������¼ 
        {
            count_b++;
        }
        if(s[i] == 'y' && s[i-1] != 'o' && i-2 >= 0)
        {
            count_b++;
        }
        //�ж��ǲ���"girl"
        if(s[i] == 'g' && i+3 < len)
        {
            count_g++;
        }
        if(s[i] == 'i' && s[i-1] != 'g' && i-1 >= 0 && i+2 < len) //������ĸ��ǰһ����ĸ��"girl"�����ĸ�������¼
        {
            count_g++;
        }
        if(s[i] == 'r' && s[i-1] != 'i' && i-2 >= 0 && i+1 < len)
        {
            count_g++;
        }
        if(s[i] == 'l' && s[i-1] != 'r' && i-3 >= 0)
        {
            count_g++;
        }
    }
    printf("%d\n%d", count_b,count_g);

    return 0;
} 
















