//小明用字母A对应数字1，B对应2，以此类推，用Z对应26.对于27以上的数字，用两位或更长位的字符串对应。
//例如AA  27，AB28.AZ52，LQ329，问2019对应什么字符串
//#include <stdio.h>
//char letter[27]="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//int main(){
//	int num,i=0;
//	char a[26];
//	scanf("%d",&num);
//	while(num>0){
//		a[i++]=letter[num%26-1];
//		num=num/26; 
//	}
//	while(i>0) 
//	printf("%c",a[--i]);
//	return 0;
//} 


//给定数列1,1,1,3,5,9,17...从第4项开始，每项都是前3项的和，求第20190324项的最后4位数字
//#include <stdio.h>
//int main(){
//	  int a[3]={1,1,1};
//	  int num,i;
//      for(i=4;i<=20190324;i++){
//      	num=(a[0]+a[1]+a[2])%10000;
//      	a[0]=a[1];
//      	a[1]=a[2];
//      	a[2]=num;
//	  }	   
//	  printf("%d",num);
//	return 0;
//} 




//把2019分解成3个各不相同的正整数之和，并且要求每个正整数都不包含数字2和4，一共有多少种不同的分解方法
//注意交换3个整数的顺序被视为同一种方法，例如1000+1001+18和1001+1000+18被视为同一种
 
#include <stdio.h>

//判断每位正整数上是否有2和4，有返回true，没有返回false 
bool check(int m){
	while(m){
		if(m%10==2||m%10==4){
			return true;
		}
		m=m/10;
	}
	return false;
} 


int main(){
	int sum=0;
	for(int a=674;a<2019;a++){
		if(check(a))
		continue;
		//true结束本次循环，继续下次循环 
		for(int b=2;b<a;b++){
		if(check(b))
		continue;
		
		for(int c=1;c<b;c++){
		if(check(c))
		continue;
		if(a+b+c>2019)
		break;
		if(a+b+c==2019)
		sum++;
	}
	}
	}
	printf("%d",sum);
	return 0;
} 















