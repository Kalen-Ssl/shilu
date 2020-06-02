from prettytable import PrettyTable
import os
book_list=[]

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
    print("-----图书管理系统-----")
    print("1 增加图书信息")
    print("2 删除图书信息")
    print("3 更改图书信息")
    print("4 查询图书信息")
    print("5 排序图书")
    print("6 exit")
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
    book=[name,price,press,comment]
    book_list.append(book)
    print("添加成功！")

#查询所有图书
def find_all():
    A=PrettyTable()
    for x in range(0,len(book_list)):
        book=book_list[x]
        name=book[0]
        price=book[1]
        press=book[2]
        comment=book[3]
        A.field_names=["序号","书名","价格","出版社","好评度"]
        A.add_row([x,name,price,press,comment])
    print(A)
    print("="*30)

#删除图书
def del_book():
    del_book=input("请输入要删除的书名：")
    flag=False
    index=0
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


#更改细节
def change_book_massage(index):
    while True:
        book=book_list[index]
        choice=input("请输入要修改的图书【1.书名 2.价格 3.出版社 4.好评度】")
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
            new_bookcomment=input("请输入好评度：")
            book[3]=new_bookcomment
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
        change_book_massage(index)
        print("更新成功")
    else:
        print("更新失败")

#排序
# def sortbook():
#     while True:
#         A=PrettyTable()
#         choice=input("请选择排序标准[1.价格 2.好评度(按星级，满星5)]")
#         if choice=='1':
#             A=(''.join(sorted(open('book.txt',mode="r",encoding='utf-8'),key=lambda s:s.split()[1])))
#             print(A)
#             break
#         elif choice=='2':
#             A=(''.join(sorted(open('book.txt',mode="r",encoding='utf-8'),key=lambda s:s.split()[1])))
#             print(A)
#             break
#         else:
#             print("输入有误，请重新输入！")

#选择序号
def get_choice():
    key=input("请输入所选序号：")
    return key

def main():
    load()
    exit_name=True
    while exit_name:
        menu()
        key=get_choice()
        if key=='1':
            add_book()
            save()
        elif key=='2':
            del_book()
            save()
        elif key=='3':
            change_book()
            save()
        elif key=='4':
            find_all()
            save()
        # elif key=='5':
        #     sortbook()
        elif key=='6':
            exit_name=False
        else:
            print("请输入正确数值")

main()









