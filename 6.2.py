x=["13915556234", "13025621456", "15325645124", "15202362459"]
e = 0;
for j in range(0,len(x)):
  if len(x[j])!=11:
    print("不是手机号")
    exit()
  if x[j][0]=='1' and x[j][1]=='3':
     if x[j][2] in ['4','5','6','7','8','9']:
        e=1;
  elif x[j][0]=='1' and x[j][1]=='5':
     if x[j][2] in ['0','1','2','8','9']:
        e=1;
  if(e==1):
    print('%s是手机号'%x[j])
  else:
    print('%s不是手机号'%x[j])
  e=0