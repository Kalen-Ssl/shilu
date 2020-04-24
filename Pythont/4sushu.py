
m = int(input("请输入一个正整数："))
for i in range(2, m):
  if m % i == 0:
    break
if i == m-1: print(m,"是素数。")
else: print(m,"不是素数。")