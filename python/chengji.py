a=input('请输入成绩：')
if a.isdigit():
    if eval(a)>=90 and eval(a)<=100:
        print('优秀')
    elif eval(a)>=80 and eval(a)<90:
        print('良好')
    elif eval(a)>=70 and eval(a)<80:
        print('中等')
    elif eval(a)>=60 and eval(a)<70:
        print('及格')
    else:
        print('不及格')