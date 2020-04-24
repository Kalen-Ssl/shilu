s=input('请输入一个 5 位的数：')
for i in range(len(s)//2):
    if s[i]!=s[-(i+1)]:
        print('{}不是一个回文数。'.format(s))
        break
else:
    print('{}是一个回文数。'.format(s))