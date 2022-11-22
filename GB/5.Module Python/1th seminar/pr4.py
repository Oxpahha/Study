# Напишите пр-му которая принимает на вход число дробь и 
# выводит первое число дробной части числа

# 6.78 -> 7
# 5 -> нет
# 0.34 -> 3

n_num = float(input("N: "))
if (n_num %1!=0):
    print(int(((n_num%1)*10)))
else: print("нет")

##

n_str = input()
if '.' in n_str:
    n_str = n_str.split('.')
    print(n_str[1][0])
else:
    print('нет')    

##

n_str = input()
if '.' in n_str:
    ind = n_str.index('.')
    print(n_num[ind+1])
else:
    print('нет')    

