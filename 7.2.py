import xlwt

xlw = xlwt.Workbook()
table1 = xlw.add_sheet('ex06.xlsx')

table1.write(0, 0, 'S09')
table1.write(0, 1, '女')
table1.write(0, 2, '89.2')
table1.write(0, 3, '88.4')
table1.write(0, 4, '86')
table1.write(0, 5, '87.9')

table1.write(1, 0, 'S10')
table1.write(1, 1, '女')
table1.write(1, 2, '90.5')
table1.write(1, 3, '86.3')
table1.write(1, 4, '87')
table1.write(1, 5, '87.9')

table1.write(2, 0, 'S11')
table1.write(2, 1, '男')
table1.write(2, 2, '88.7')
table1.write(2, 3, '89.4')
table1.write(2, 4, '89')
table1.write(2, 5, '89.0')
xlw.save('D:\ex06.xlsx')