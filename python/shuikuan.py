salary = float(input("请输入工资："))
if salary<5000:
    num=0
elif salary>5000 and salary<=36000:
    num=(salary-5000)*0.03
elif salary>36000 and salary<=144000:
    num = ((salary - 5000) * 0.1)-2520
elif salary > 144000:
    num = ((salary - 5000) * 0.2) - 16920
print('应交税款为：%f'%num)