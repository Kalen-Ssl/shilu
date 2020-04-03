x = input('请输入字母:')

if x[0] == 'm':
    print('星期一')
elif x[0] == 't':
    b = input('请输入第二个字母:')
    if b[0] == 'u':
        print('星期二')
    elif b[0] == 'h':
        print('星期四')
    else:
        print('输入错误!')
elif x[0] == 'w':
    print('星期三')
elif x[0] == 'f':
    print('星期五')
elif x[0] == 's':
    a = input('请输入第二个字母:')
    if a[0] == 'a':
        print('星期六')
    elif a[0] == 'u':
        print('星期日')
    else:
        print('输入错误')
else:
    print('输入错误')