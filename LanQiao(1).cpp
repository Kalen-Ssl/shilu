//#include <stdio.h>
//int main(){
//	double a=15.125;
//	printf("%f",a*1024);
//	return 0;
//}



//Լ������ 
//#include <stdio.h>
//#define N 1200000
//int main() {
//    int ans = 0;
//    for (int i = 1; i <= N; ++i) {
//        if (N % i == 0)
//            ans++;
//    }
//    printf("%d\n",ans);
//    return 0;
//}



//��1��2019�У��ж��ٸ�������λ�а�������9��
//ע�⣬�е����е���λ�а������9�������ֻ��һ�Ρ����磬1999�������������9���ڼ���ʱֻ����һ������         
#include <stdio.h>
#include <string.h>

#define N 2019

int check(int i) {
    char s[5];
    sprintf(s, "%d", i);
    for (int j = 0; j < strlen(s); ++j) {
        if(s[j]=='9')return 1;
    }
    return 0;
}

int main() {
    int ans = 0;
    for (int i = 9; i <= N; ++i) {
        if (check(i)){
            ans++;
        }
    }
    printf("%d\n",ans);
    return 0;
}







