//�жϵ�һ���ַ������Ԫ���ܷ񱻵ڶ����ַ��������� ������š���־�� 
#include <stdio.h>
#include <string.h> 
bool canConstruct(char * ransomNote, char * magazine){
    int size = strlen(ransomNote);
    int len = strlen(magazine);
    while (size) { //�����һ��Ԫ����ĸ��ʼ�� ����˳����������ѭ��
        char* temp = (char*)memchr(magazine, ransomNote[size-1], len);
        //�ӳ���Ϊlen����־���ҵ������������Ҫ����ĸ
        if (temp == NULL) {    //��־��û�ҵ� ֱ�ӷ���false
            return false;
        } else {      //�ҵ��ˣ�����־�е��Ǹ���ĸ���滻�� ��Ϊÿ����ĸֻ����һ��
            *temp = '1'; 
            size--;
        }
    } 
    return true;
}

int main(){
	char s1[50]="aa";
	char s2[50]="ab";
	bool c=canConstruct(s1,s2);
	printf("%d",c);
	return 0;
}
