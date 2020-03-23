//判断第一个字符串里的元素能否被第二个字符串里的组成 （赎金信、杂志） 
#include <stdio.h>
#include <string.h> 
bool canConstruct(char * ransomNote, char * magazine){
    int size = strlen(ransomNote);
    int len = strlen(magazine);
    while (size) { //从最后一个元素字母开始找 可以顺便用来控制循环
        char* temp = (char*)memchr(magazine, ransomNote[size-1], len);
        //从长度为len的杂志中找到赎金信中所需要的字母
        if (temp == NULL) {    //杂志中没找到 直接返回false
            return false;
        } else {      //找到了，把杂志中的那个字母给替换掉 因为每个字母只能用一次
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
