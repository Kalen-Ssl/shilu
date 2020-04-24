arr = [10,23,35,46,57,68,79,80,92,103,0]

print('原始数组是：',end="\n")
for i in arr:
    print(i,end=' ')
print('\n')
num = eval(input('请输入一个新的数：'))
for x in range(0,11):
    if num<arr[x]:
        arr.insert(x,num)
        break
print('插入新数后的数组是：',end="\n")
for i in arr:
    print(i,end=' ')