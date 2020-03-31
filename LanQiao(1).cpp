//#include <stdio.h>
//int main(){
//	double a=15.125;
//	printf("%f",a*1024);
//	return 0;
//}



//约数个数 
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



//在1至2019中，有多少个数的数位中包含数字9？
//注意，有的数中的数位中包含多个9，这个数只算一次。例如，1999这个数包含数字9，在计算时只是算一个数。         
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







