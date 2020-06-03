from prettytable import PrettyTable
import os
book_list=[]

#图书馆书籍借阅管理系统


#保存信息
def save():
    f=open("book.txt",mode="w",encoding='utf-8')
    for book in book_list:
        s=' '.join(book)
        f.write(s)
        f.write('\n')
    f.close()

#读取信息
def load():
    rs=os.path.exists('book.txt')
    if rs==True:
        f=open("book.txt",mode="r",encoding='utf-8')
        contents=f.readlines()
        for msg in contents:
            msg=msg.strip('\n')
            book=msg.split(" ")
            book_list.append(book)
        f.close()

#菜单
def menu():
    print("_"*30)
    print("-----图书馆书籍借阅管理系统-----")
    print("1 借出书籍")
    print("2 归还书籍")
    print("3 增加书籍信息")
    print("4 删除书籍信息")
    print("5 更改书籍信息")
    print("6 查询书籍信息")
    print("7 查询所有书籍信息")
    print("8 统计书籍数量")
    print("9 排序书籍")
    print("10 exit")
    print("_" * 30)

#检查新增图书是否重复
def check_book(book):
    flag=True
    while flag:
        for i in range(len(book_list)):
            if book_list[1]==book:
                book=check_book(input("图书重复，请重新输入："))
        flag=False
    return book




#添加图书
def add_book():
    name=input("请输入书名：")
    price = input("请输入价格：")
    press = input("请输入出版社：")
    comment = input("请输入好评度：")
    lend = "未借出"
    book=[name,price,press,comment,lend]
    book_list.append(book)
    print("添加成功！")


#查询书籍
def find_book():
    B=PrettyTable()
    fin_book = input("请输入要查询的书名：")
    flag = False
    for i in range(0, len(book_list)):
        if book_list[i][0] == fin_book:
            flag = True
            key = i
            break
    if flag:
        book = book_list[key]
        name = book[0]
        price = book[1]
        press = book[2]
        comment = book[3]
        lend = book[4]
        B.field_names = ["序号", "书名", "价格", "出版社", "好评度", "状态"]
        B.add_row([key, name, price, press, comment, lend])
        print(B)
    else:
        print('%s查找失败，该书籍不存在' % fin_book)



#查询所有书籍
def find_all():
    A=PrettyTable()
    for x in range(0,len(book_list)):
        book=book_list[x]
        name=book[0]
        price=book[1]
        press=book[2]
        comment=book[3]
        lend=book[4]
        A.field_names=["序号","书名","价格","出版社","好评度","状态"]
        A.add_row([x,name,price,press,comment,lend])
    print(A)
    print("="*30)


#统计图书数量
def count_book():
    count=0
    for x in range(0, len(book_list)):
        count=count+1
    print("*" * 30)
    print('馆藏图书的总数量为%d'%count)
    print("*" * 30)


#删除图书
def del_book():
    del_book=input("请输入要删除的书名：")
    flag=False
    # index=0
    for i in range(0,len(book_list)):
        if book_list[i][0]==del_book:
            flag=True
            key=i
            break
    if flag:
        book_list.pop(key)
        print("删除成功")
    else:
        print("输入有误")


#借出书籍
def borrow_book():
    bor_book = input("请输入要借出的书名：")
    flag = False
    # index = 0
    for i in range(0, len(book_list)):
        if book_list[i][0] == bor_book:
            flag = True
            key = i
            break
    if flag:
        book = book_list[key]
        if(book[4] =="已借出"):
            print('%s借出失败,该图书已借出' % bor_book)
        else:
            new_lend = "已借出"
            book[4] = new_lend
            print('%s借出成功' % bor_book)
    else:
        print('%s借出失败,该图书不存在' % bor_book)


#归还书籍
def return_book():
    ret_book = input("请输入要归还的书名：")
    flag = False
    # index = 0
    for i in range(0, len(book_list)):
        if book_list[i][0] == ret_book:
            flag = True
            key = i
            break
    if flag:
        book = book_list[key]
        new_lend = "未借出"
        book[4] = new_lend
        print('%s归还成功' % ret_book)
    else:
        print('%s归还失败' % ret_book)

#更改图书的详细信息
def change_massage(index):
    while True:
        book=book_list[index]
        choice=input("请输入要修改的图书【1.书名 2.价格 3.出版社 4.好评度 5.状态】")
        if choice=='1':
            new_bookname=input("请输入书名：")
            book[0]=new_bookname
            break
        if choice=='2':
            new_bookprice=input("请输入价格：")
            book[1]=new_bookprice
            break
        if choice=='3':
            new_bookpress=input("请输入出版社：")
            book[2]=new_bookpress
            break
        if choice=='4':
            new_bookcomment=input("请输入好评度（1-5）：")
            book[3]=new_bookcomment
            break
        if choice=='5':
            new_booklend=input("请输入状态 已借出/未借出：")
            book[4]=new_booklend
            break
        else:
            print("输入有误")

#更改图书信息
def change_book():
    index=0
    flag=False
    bookname=input("请输入要更改图书的书名：")
    for i in range(0,len(book_list)):
        if book_list[i][0]==bookname:
            flag=True
            index=i
            break
    if flag:
        change_massage(index)
        print("更新图书信息成功")
    else:
        print("更新图书信息失败，请确认书名是否存在")

#排序
def sortbook():
    while True:
        A=PrettyTable()
        choice=input("请选择的排序标准[1.价格 2.好评度 3.是否借出]")
        if choice == '1':
            A=(''.join(sorted(open('book.txt',mode="r",encoding='utf-8'),key=lambda s:s.split()[1])))
            print(A)
            break
        elif choice == '2':
            A=(''.join(sorted(open('book.txt',mode="r",encoding='utf-8'),key=lambda s:s.split()[3])))
            print(A)
            break
        elif choice == '3':
            A = (''.join(sorted(open('book.txt', mode="r", encoding='utf-8'), key=lambda s: s.split()[4])))
            print(A)
            break
        else:
            print("输入有误，请重新输入！")


def main():
    load()
    flag=True
    while flag:
        menu()
        key=input("请输入所选序号：")
        if key=='1':
            borrow_book()
            save()
        elif key=='2':
            return_book()
            save()
        elif key=='3':
            add_book()
            save()
        elif key=='4':
            del_book()
            save()
        elif key=='5':
            change_book()
            save()
        elif key=='6':
            find_book()
        elif key=='7':
            find_all()
        elif key=='8':
            count_book()
        elif key=='9':
            sortbook()
        elif key=='10':
            flag=False
        else:
            print("输入有误，请输入正确的数值")

main()









