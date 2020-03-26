num = eval(input('请输入一个三位的正整数：'))
a=num//100
b=num//10%10
c=num%10
d=a*a*a+b*b*b+c*c*c
print('各位数的立方之和是：',d)
