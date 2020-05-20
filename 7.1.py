f = open('./Py7-1.txt', "w")
f.writelines("秦时明月汉时关,\n")
f.writelines("秦时明月汉时关。\n")
f.writelines("但使龙城飞将在，\n")
f.writelines("不教胡马度阴山。\n")

f = open('./Py7-1.txt', "r+")
flist = f.readlines()
flist[1]='万里长征人未还。\n'

f=open("./Py7-1.txt",'r+')
f.writelines(flist)

f=open("D:\Py7-1.txt",'r+')
print(f.read())
f.close()