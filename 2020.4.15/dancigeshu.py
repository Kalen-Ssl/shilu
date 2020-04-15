str = input("请输入字符串：")
str1 = str.strip()
index = 0
count = 0
while index < len(str1):
    while str1[index] !=" ":
        index +=1
        if index == len(str1):
            break
    count += 1
    if index == len(str1):
        break
    while str1[index] == " ":
        index += 1
print("单词个数为：%d"%count)