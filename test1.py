class Person(object):
    def __init__(self,name,age):
        print("执行__init__方法")
        self.name=name
        self.age=age

    def getName(self):
        return self.name

    def getAge(self):
        return self.age

if __name__=='__main__':
    p=Person('Tom',24)
    print('姓名:',p.getName())
    print('年龄:',p.getAge())

