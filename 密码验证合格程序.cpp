#include "stdio.h"
#include "string.h"
 //密码验证合格程序 
int process_str(char str[])
{
	int len,i,rep,Lowercase=0,Uppercase=0,Digit=0,others=0; 
	int j;
	len = strlen(str);
	
	if(len <= 8){
	    printf("NG\n");
		return 0;
	}
	
	for(i=0;i<len;i++){
		if(str[i]>='a' && str[i]<='z'){
		    Lowercase = 1;
		}
		else if(str[i]>='A' &&str[i]<='Z'){
			Uppercase = 1;
		}
		else if (str[i]>='0' && str[i]<='9'){
			Digit = 1;
		}
		else{
			others = 1;
		}
	}
	rep = Lowercase + Uppercase + Digit + others;
	
	if(rep <= 2){
		printf("NG\n");
		return 0;
	}
	int array[len+1][len+1] ;
	memset(array,0,sizeof(array));
	for(i=0;i<len;i++){
		for(j=0;j<len;j++){
			if(str[i] == str[j]){
				array[i+1][j+1] = array[i][j] + 1; 
			}
		}
			
	}
	for(i=0;i<len+1;i++){
		for(j=0;j<len+1;j++){
			if(i!=j && array[i][j]>2){
				printf("NG\n");
				return 0;
			}
		}
	}
	printf("OK\n");
	return 0;
	
}
 
int main()
{
	char str[100];
	
	while(gets(str))
	{
	    process_str(str);
	}
 
	return 0;
}
