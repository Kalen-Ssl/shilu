//#include <stdio.h>
//#include <string.h>
//
//#define N 2019
//
//int check(int i){
//	char s[5];
//	sprintf(s,"%d",i);
//	for(int i=0;i<strlen(s);i++){
//		if(s[i]=='9'){
//			return 1;
//		}
//	}
//	return 0;
//}
//
//int main(){
//	int ans=0;
//	for(int i=0;i<=N;i++){
//		if(check(i)==1){
//			ans++;
//		}
//	}
//	printf("%d\n",ans);
//	return 0;
//} 



һ������������κ�һ����λ�������ұߵ���λ
������һ����λ��������
��1135��   1024����
����������n������������1��n���ж��ٸ�����������
#include <stdio.h>
#include <string.h>

int main(){
    int n=0;
    scanf("%d",&n);
    int ans=0;
    for(int i=0;i<=n;i++){
    	char s[8];
    	sprintf(s,"%d",i);
    	int flag=1;
    	for(int j=1;j<strlen(s);j++){
    		if(s[j]<s[j-1]){
    			flag=0;
    			break;
			}
		}
		if(flag){
			ans++;
		}
	}
	printf("%d\n",ans); 
	return 0;
}









 










