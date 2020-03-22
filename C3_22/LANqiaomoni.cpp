//#include <stdio.h>
//int main(){
//	int n=1200000;
//	int m=0;
//	for(int i=1;i<=n;i++){
//		if((n%i)==0){
//			m++;
//		}
//	}
//	printf("%d",m);
//	return 0;
//}

//#include <stdio.h>
//int main(){
//	int n=15.125;
//	printf("%d",n*1024);
//	return 0;
//}

//
//#include <stdio.h>
//int main(){
//	int i,t=0;
//	int a,b,c,d;
//	for(i=1;i<=99;i++){
//		a=i%10;
//		b=i/10%10;
//		if(a==9||b==9){
//			t=t+1;
//		}
//	}
//	for(i=100;i<=999;i++){
//		a=i%10;
//		b=i/10%10;
//		c=i/100%10;
//		if(a==9||b==9||c==9){
//			t=t+1;
//		}
//	}
//	for(i=1000;i<=2019;i++){
//		a=i%10;
//		b=i/10%10;
//		c=i/100%10;
//		d=i/1000%10;
//		if(a==9||b==9||c==9||d==9){
//			t=t+1;
//		}
//	}
//	printf("%d",t);
//	return 0;
//}



//#include <stdio.h>
//int getnums(int num2[],int n,int m){
//	   int v,j;
//		for(v=0;v<n-1;v++){
//		for(j=v+1;j<n;j++){
//			if(num2[v]<num2[j]){
//				int t=num2[v];
//				num2[v]=num2[j];
//				num2[j]=t;
//			}
//		}
//	}
//	int getnum=num2[m-1];
//    return getnum;
//}
//
//int main()
//{
//	int n,m,i,o,b;
//	scanf("%d%d",&n,&m); 
//	int num[n+1];
//	int num2[n+1];
//	for(i=0;i<n;i++){
//		scanf("%d",&num[i]); 
//	}
//	for(b=0;b<n;b++){
//		num2[b]=num[b]; 
//	}
//    int get=getnums(num2,n,m);
//    for(o=0;o<n;o++){
//    	if(num[o]>=get){
//    		printf("%d ",num[o]);
//		}
//	}
//	return 0;
//}
//
//
//
//
//
//
//


//#include <stdio.h>
//#include <string.h>
//int main(){
//	char s[101];
//	scanf("%s",s);
//	int i;
//	bool tmp=false;
//	bool t=false;
//	bool m=false;
//	bool j=false;
//    for(i=0;i<strlen(s);i++){
//        if(s[i]!='a'||s[i]!='e'||s[i]!='i'||s[i]!='o'||s[i]!='u'){
//			tmp=true;
//		}
//		if((tmp==true)&&((s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'))){
//			t=true;
//		}
//		if((t==true)&&(s[i]!='a'||s[i]!='e'||s[i]!='i'||s[i]!='o'||s[i]!='u')){
//			m=true;
//		}
//		if((m==true)&&s[i]=='a'||s[i]=='e'||s[i]=='i'||s[i]=='o'||s[i]=='u'){
//			j=true;
//		}
//	}
//	if(j==true){
//		printf("yes"); 
//	}else{
//		printf("no");
//	}
//	return 0;
//}
//

#include <stdio.h>
int main(){
	int ans=0;
	int a,b,c,d;
	for(int i=1;i<=2019;i++){
		a=i/1000;
		b=i%1000/100;
		c=i%100/10;
		d=i%10;
		if(a==9||b==9||c==9||d==9){
			ans++;
		}
	}
	printf("%d",ans);
	return 0;
} 

 
