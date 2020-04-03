import math
a = float(input('请输入三角形的边长 a：'))
b = float(input('请输入三角形的边长 b：'))
c = float(input('请输入三角形的边长 c：'))
s = (a+b+c)/2
area = math.sqrt(s*(s-a)*(s-b)*(s-c))
print('三角形三边分别为：a=%.1f b=%.1f c=%.1f'%(a,b,c))
print('三角形的面积等于',area)