#include <math.h>
#include <stdio.h>
#include <string.h>
#include <ctype.h>
#include <string.h>


int charToint(char ch){
	switch(ch){
		case 'I':return 1;
		case 'V':return 5;
		case 'X':return 10;
		case 'L':return 50;
		case 'C':return 100;
		case 'D':return 500;
		case 'M':return 1000;
		default: return 0;
	}
}

int romanToint(char* s){
	int count=0;
	int sum=0;
	if(s==NULL){
		return 0;
	}
	//while(s[count]!='\0'){
	for(int count=0;s[count]!='\0';){
		if(charToint(s[count])<charToint(s[count+1])){
			sum=sum+charToint(s[count+1])-charToint(s[count]);
			count=count+2;
		}else{
			sum=sum+charToint(s[count]);
			count++;
		}
	}
	return sum;
	//}
}

int main(){
	char str[]="MCMXCIV";
	printf("%d\n",romanToint(str));
	return 0;
}

int main8(){
	char grade;
	scanf("%c",&grade);
	switch(grade){
		case 'A':
			printf("Excellenn");
			break;
		case 'C':
			printf("well\n");
			break;
		case 'D':
			printf("passed\n");
			break;
		case 'F':
			printf("try again\n");
			break;
		default:
			printf("Invaild\n");
	}
	return 0;
}

int main7(){
	//strcpy/strncpy  字符串复制函数 
	char str1[10]; char str2[]="DongTeng";
//	strcpy(str1,str2); 
//	printf("%s\n",str1);
//	//puts(str1);
//	int i;
//	for(i=0;i<strlen(str1);i++){
//		printf("%c",str1[i]);
//	}
//	printf("\n");
	strncpy(str1,str2,3); 
	printf("%s\n",str1);
	
	//strcat 字符串连接函数
	char str3[11]="bei";
	char str4[]="jing";
	strcat(str3,str4); 
	printf("%s\n",str3);
	
	//strcmp 字符串比较
	char str5[]="aaa";
	char str6[]="bbb";
	int c=strcmp(str5,str6); 
	printf("%d\n",c);
	
	char str7[]="Dongteng";
	printf("%d\n",strlen(str7));
	
	//strlwr 转换为小写
	//strupr 转换为大写 
	
	//strchr（s,ch)  在s所指的字符串中，找出第一次出现字符ch的位置 
	char str8[]="tsuna";
	char* r27=strchr(str8,'s');
	printf("%c",r27);
	return 0;
} 


int main6(){
	//字符函数 #include <ctype.h>
	char a='A';
	printf("%d\n",isalpha(a)); //是否字母
	printf("%d\n",isdigit(a));//是否数字 
	printf("%d\n",isxdigit(a));//是否16进制数字
	printf("%d\n",islower(a)); //是否小写 
	printf("%d\n",isupper(a));//是否大写 
	a=tolower(a);
	printf("%c\n",a);
//	printf("%d  %c\n",toupper(a),a);//转换为大写
} 

int main5(){
	//abs求绝对值 
	int i=-1;
	printf("%d\n",abs(i));
	//exp 求e的x次方
	double num=exp(2);
	printf("%lf\n",num);
	//pow 计算x的y次方
	printf("%.2lf\n",pow(2,3));
	//sqrt x的开方
	printf("%9lf\n",sqrt(2));
}


int main4(){
  char ch=0;
  while((ch=getchar())!=EOF){
  	if((ch>='a')&&ch<='z'){
  		//ch=ch-32;
  		ch=ch-('a'-'A');
  		printf("ch=%c\n",ch);
	  }
	else if((ch>='A')&&ch<='Z'){
  		//ch=ch-32;
  		ch=ch+('a'-'A');
  		printf("ch=%c\n",ch);
	  }
  }
}

int main3(){
	char str1[30]={0};
	char str2[30]={0};
	char str3[30]={0};
	gets(str1);
	scanf("%s",str2);
	scanf("%s",str3);
	printf("\nstr1:%s\n",str1);
	printf("str2:%s\n",str2);
	puts(str3);
	
}

int main2(){
	//pow函数，求x的y次方 
	double x=2.0,y=3.0;
	printf("%lf raised to %lf is %lf\n",x,y,pow(x,y));
	double p=3.0;

	char arr[10]={'A','B','C','D'};
	printf("%d\n",strlen(arr));
	printf("%d\n",sizeof(arr));
	return 0;
}

