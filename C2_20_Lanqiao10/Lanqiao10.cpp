//С������ĸA��Ӧ����1��B��Ӧ2���Դ����ƣ���Z��Ӧ26.����27���ϵ����֣�����λ�����λ���ַ�����Ӧ��
//����AA  27��AB28.AZ52��LQ329����2019��Ӧʲô�ַ���
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


//��������1,1,1,3,5,9,17...�ӵ�4�ʼ��ÿ���ǰ3��ĺͣ����20190324������4λ����
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




//��2019�ֽ��3��������ͬ��������֮�ͣ�����Ҫ��ÿ��������������������2��4��һ���ж����ֲ�ͬ�ķֽⷽ��
//ע�⽻��3��������˳����Ϊͬһ�ַ���������1000+1001+18��1001+1000+18����Ϊͬһ��
 
#include <stdio.h>

//�ж�ÿλ���������Ƿ���2��4���з���true��û�з���false 
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
		//true��������ѭ���������´�ѭ�� 
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















