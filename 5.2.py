import random
s = ["a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w",
     "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T",
     "U", "V", "W", "X", "Y", "Z"]
num = 0
choose_resault = []
while num<15:
  random_num=random.choice(s)
  if random_num not in choose_resault:
      choose_resault.append(random_num)
      num += 1
print(choose_resault)

# for i in range(15):
#     print(random.choice(s), end="")