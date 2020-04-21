//#include <stdio.h>
//#include <string.h>
//#include <math.h>                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
//
//
//int getN(char s){
//	char nn;
//	switch(s){
//		case '0':nn=0;break;
//		case '1':nn=1;break;
//		case '2':nn=2;break;
//		case '3':nn=3;break;
//		case '4':nn=4;break;
//		case '5':nn=5;break;
//		case '6':nn=6;break;
//		case '7':nn=7;break;
//		case '8':nn=8;break;
//		case '9':nn=9;break;
//		case 'A':nn=10;break;
//		case 'B':nn=11;break;
//		case 'C':nn=12;break;
//		case 'D':nn=13;break;
//		case 'E':nn=14;break;
//		case 'F':nn=15;break;
//	}
//	return nn;
//}
//
//int main(){
//	char s[9];
//	gets(s);
//	char i;
//	long long int sum=0;
//	int num;
//	for(i=strlen(s)-1;i>=0;i--){
//		num=getN(s[i]);
//		sum+=num*pow(16,strlen(s)-i-1);
//	}
//	printf("%lld\n",sum);
//    return 0;
//} 
//
//
//
//
//
//
//
//
//
//


#include <stdio.h>
#define M 10007 
int main(){
	int a1,a2;
	a1=a2=1;
	int sum=0;
	int temp;
	int n,i;
	scanf("%d",&n);
	for(i=1;i<=n;i++){
	   sum=a1%M;
	   temp=a2;
	   a2=(a1+a2)%M;
	   a1=temp; 
	}	
	
     printf("%d\n",sum); 
	return 0;
} 














