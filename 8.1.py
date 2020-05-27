class Circle:
    def __init__(self,r):
        self.radius=r
    def getArea(self):
        return self.radius*self.radius*3.1415926
    def getPerimeter(self):
        return 2*3.1415926*self.radius

for i in range(1,11):
    t=Circle(i)
    # print("半径为", i, "的圆，面积：   ", t.getArea(), "周长：   ", t.getPerimeter())
    print('半径为%d的圆，面积：  %.2f  周长:   %.2f' % (i,t.getArea(),t.getPerimeter()))