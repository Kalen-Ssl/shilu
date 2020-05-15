c = input("请输入字符串:");
b = list(c)
a = 0
for j in range(0,len(b)):
    if b[j] in ['a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U']:
        a += 1
print('字符串中元音字母的个数为:',a)