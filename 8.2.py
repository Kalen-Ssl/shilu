class Account:
    def __init__(self,id,balance,yrate):
        self.id=id
        self.balance=balance
        self.yrate=yrate
    def get(self,num):
        self.balance=self.balance+num
        print('存入{}元'.format(num))
    def put(self,num):
        self.balance=self.balance-num
        print('取出{}元'.format(num))
    def getmrate(self):
        a=self.yrate/12
        print('月利率:{}%'.format(a))
    def getyuexi(self):
        b=(self.yrate/12/100)*self.balance
        print('月息:{}'.format(b))

acc=Account(998866,2000,4.5)
print("账户创建成功：")
print("------------")
acc.get(150)
acc.put(1500)
print("------------")
print("账户信息如下：")
print("账号:%s"%(acc.id))
print("余额:%.f"%(acc.balance))
print('年利率:{}%'.format(acc.yrate))
acc.getmrate()
acc.getyuexi()
