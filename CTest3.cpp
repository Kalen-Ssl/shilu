//С���������� hello ���ֵ��ʷǳ�����Ȥ�����ֵ��ʿ������÷�Ϊ�ĶΣ�
//��һ����һ������������ĸ��ɣ��ڶ�����һ������Ԫ����ĸ��ɣ�
//��������һ������������ĸ��ɣ����Ķ���һ������Ԫ����ĸ��ɡ�
//����һ�����ʣ����ж���������Ƿ�Ҳ�����ֵ��ʣ�
//����������yes�����������no��Ԫ����ĸ���� a, e, i, o, u���������
//������Ϊ������ĸ��
#include <stdio.h>
#include <string.h>

int isYuan(char c){
	return c=='a'||c=='e'||c=='i'||c=='o'||c=='u';
}

int main(){
	char word[101];
	scanf("%s",&word);
	int size=strlen(word);
	if(size<4){
		printf("no");
		return 0;
	}
	if(isYuan(word[0])||!isYuan(word[size-1])){
		printf("no");
		return 0;
	}
	//�½��������ڱ��
	int h[size];
	for(int i=0;i<size;i++){
		if(isYuan(word[i])){
			h[i]=1;
		}else{
			h[i]=0;
		}
	} 
	int cnt=0;
	for(int i=1;i<size;i++){
		if(h[i-1]+h[i]==1){
			cnt++;
		}
	}
	if(cnt==3){
		printf("yes");
	}else{
		printf("no");
	}
	return 0;
}







//������Ԫ�� 
//#include <stdio.h>
//int main(){
//	int n,ans=0;
//	scanf("%d",&n);
//	int data[n];
//	for(int i=0;i<n;i++){
//		scanf("%d",&data[i]);
//	}
//	for(int j=0;j<n;j++){
//		int hasSmall=0;
//		for(int i=0;i<j;i++){
//			if(data[i]<data[j]){
//				hasSmall=1;
//				break;
//			}
//		}
//		int hasBig=0;
//		for(int k=j+1;k<n;k++){
//			if(data[k]>data[j]){
//				hasBig=1;
//				break;
//			}
//		}
//		if(hasSmall&&hasBig){
//			ans++;
//		}
//	}
//	printf("%d",ans);
//  return 0;
//}


//#include <stdio.h>
//#include <string.h>
//
//#define N 2019
//
//int check(int i){
//	char s[5];
//	sprintf(s,"%d",i);
//	for(int j=0;j<strlen(s);++j){
//		if(s[j]=='9')return 1;
//	}
//	return 0;
//}
//
//int main(){
//	int ans=0,i;
//	for(i=9;i<=N;i++){
//		if(check(i)){
//			ans++;
//		}
//	}
//	printf("%d",ans);
//	return 0;
//}
//
//



//#include <stdio.h>
//int main(){
//  int n=1200000;
//  int i,num=0;
//  for(i=1;i<=1200000;i++){
//  	if(n%i==0){
//  		num+=1;
//	  }
//  }
//  printf("%d",num);
//  return 0;
//}
