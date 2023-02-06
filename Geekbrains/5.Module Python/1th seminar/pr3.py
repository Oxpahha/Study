# Напишите пр-му которая принимает на вход число N и выводит числа от -N до N

#  5 -> -5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5

n_num = int(input("N: "))
for i in range(-n_num, n_num):
    print(i, end=", ")
print(i+1)

##

n_num = int(input("N: "))
for i in range(n_num*2):
    print(-n_num+i, end=", ")
print(n_num+1)

##

n_num = int(input("N: "))
n_str = ''
for i in range(-n_num, n_num+1):
    n_str += n_str(i) + ', '
print(n_str[:-2])

##

n_num = int(input())
print(*list(range(-n_num, n_num+1)), sep=', ')
