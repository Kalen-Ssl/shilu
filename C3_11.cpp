//��С������ 
/* 
#include <stdio.h>
int max(int a,int b,int c){
	if(a>b&&a>c){
		return a;
	}else if(b>c&&b>a){
		return b;
	}else{
		return c;
	}
}

int main(){
	int a,b,c,i,j;
	scanf("%d%d%d",&a,&b,&c);
	i=max(a,b,c);
	int d=1;
	while(1){
		j=d*i;
		if((j%a==0)&&(j%b==0)&&(j%c==0)){
			break;
		}
		d++;
	}
	printf("%d\n",j);
	
	
	return 0;
}

*/

//���Լ��

/*
#include <stdio.h>
int fun(int a,int b){
	int c;
	c=a%b;
	while(c!=0){
		a=b;
		b=c;
		c=a/b;
	}
	return b;
}

int main(){
	int a,b,c;
	scanf("%d%d%d",&a,&b,&c);
	int d=fun(a,fun(b,c)); 
	printf("%d",d);
	return 0;
}

*/

//��������ת����
/*
#include <stdio.h>
#include <string.h>
int change(char c){
	int a[8]={1,5,10,50,100,500,1000};
	char l[8]={'I','V','X','L','C','D','M'};
	for(int i=0;i<7;i++){
		if(l[i]==c){
			return a[i];
		}
	}
	return 0;
}
 
int main(){
	char s[100];
	scanf("%s",s);
	int num=0;
	int m,n;
	for(int i=0;i<strlen(s)-1;i++){
		m=change(s[i]);
		n=change(s[i+1]);
		if(m>=n){
			num+=m;
		}else{
			num-=m;
		}
	}
	num+=change(s[strlen(s)-1]);
	printf("%d",num);
	return 0;
}
*/



//����ת�������� 
#include <stdio.h>
#include <string.h>

  char* num4(int n){
        char* res = "";
        switch(n){
            case 1:res="M";break;
            case 2:res="MM";break;
            case 3:res="MMM";break;
            case 0:res="";break;
        }
        return res;
    }
    char* num3(int n){
        char* res = "";
        switch(n){
            case 1:res="C";break;
            case 2:res="CC";break;
            case 3:res="CCC";break;
            case 4:res="CD";break;
            case 5:res="D";break;
            case 6:res="DC";break;
            case 7:res="DCC";break;
            case 8:res="DCCC";break;
            case 9:res="CM";break;
            case 0:res="";break;
        }
        return res;
    }
    char* num2(int n){
        char* res = "";
        switch(n){
            case 1:res="X";break;
            case 2:res="XX";break;
            case 3:res="XXX";break;
            case 4:res="XL";break;
            case 5:res="L";break;
            case 6:res="LX";break;
            case 7:res="LXX";break;
            case 8:res="LXXX";break;
            case 9:res="XC";break;
            case 0:res="";break;
        }
        return res;
    }
    char* num1(int n){
        char* res = "";
        switch(n){
            case 1:res="I";break;
            case 2:res="II";break;
            case 3:res="III";break;
            case 4:res="IV";break;
            case 5:res="V";break;
            case 6:res="VI";break;
            case 7:res="VII";break;
            case 8:res="VIII";break;
            case 9:res="IX";break;
            case 0:res="";break;            
        }
        return res;
    }



int main(){
     	int num;
     	scanf("%d",&num);
        int a = num%10;
        num/=10;
        int b =num%10;
        num/=10;
        int c =num%10;
        num/=10;
        int d = num%10;
       char str[80]="";
       strcat(str,num1(a));
       printf("%s",str);
}
    
   





 







