import time
import os


TS_info = []


def print_menu():
  print("---------------------------")
  print("      唐诗欣赏系统 V1.0")
  print(" 1:添加唐诗")
  print(" 2:删除唐诗")
  print(" 3:修改唐诗")
  print(" 4:查询唐诗")
  print(" 5:显示所有唐诗")
  print(" 6:保存数据")
  print(" 7:退出系统")
  print("---------------------------")

def add_info():
    global TS_info

    add_name = input("请输入唐诗名字：")
    add_neirong = input("请输入唐诗内容：")
    add_zuozhe = input("请输入作者：")
    add_fanyi = input("请输入翻译：")


    for info in TS_info:
         if info['name'] == add_name:
            print("此唐诗已经存在，请重新输入")
            return

    info = {}
    info["name"] = add_name
    info["neirong"] = add_neirong
    info["zuozhe"] = add_zuozhe
    info["fanyi"] = add_fanyi
    TS_info.append(info)
    print("添加成功,按6保存后按5查看")

def del_info():
     global TS_info
     del_id = int(input("请输入要删除的序号："))
     if 0 <= del_id < len(TS_info):
         del_flag = input("确定删除？yes or no:")
         if del_flag == 'yes':
             del TS_info[del_id]
             print("删除成功，按6保存后按5查看")
     else:
         print("输入序号有误，请重新输入")


def modify_info():

     global TS_info
     modify_id = int(input("请输入要修改的序号："))
     if 0 <= modify_id < len(TS_info):
         print("你要修改的信息是：")
         print("name:%s,neirong:%s,zuozhe:%s,fanyi:%s" %
               (TS_info[modify_id]["name"],TS_info[modify_id]["neirong"], TS_info[modify_id]["zuozhe"], TS_info[modify_id]["fanyi"]))
         mod_info = input("您要修改的信息是：")
         TS_info[modify_id][mod_info] = input("请输入新的%s:" % mod_info)
         print("修改成功，按6保存后按5查看")
     else:
         print("输入序号有误：请重新输入")

def query_info():
     query_name = input("请输入要查询的唐诗名字：")
     for info in TS_info:
         if info["name"] == query_name:
             print("查询到的信息如下")
             print("内容:%s,作者:%s,内容:%s,翻译:%s" % (info["name"], info["neirong"],info["zuozhe"], info["fanyi"]))
             break
         else:
             print("没有您要找的信息")

def show_all():
     print("序号\t\t名字\t\t内容\t\t作者\t\t翻译")
     i = 0
     for info in TS_info:
         print("%d\t\t%s\t\t%s\t\t%s\t\t%s" % (i, info['name'],info['neirong'], info['zuozhe'], info['fanyi']))
         i += 1

def sava_data():
     f = open("info.txt", 'w')
     f.write(str(TS_info))
     f.close()

def load_data():
     global TS_info
     f = open("info.txt")
     content = f.read()
     TS_info = eval(content)
     f.close()

def main():
     load_data()
     while True:
         print_menu()
         num=input("请输入要进行的操作（数字）:")
         if num == '1':
             add_info()
         elif num == '2':
             del_info()
         elif num == '3':
             modify_info()
         elif num == '4':
             query_info()
         elif num == '5':
             show_all()
         elif num == '6':
             sava_data()
         elif num == '7':
             exit_flag = input("确定要退出吗？yes or no")
             if exit_flag == 'yes':
                 break
         else:
             print("请输入正确的操作序号：")


main()