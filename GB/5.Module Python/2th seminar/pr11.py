# Напишите пр-му которая принимает на вход число N и выдает последовательность из N членов

# N=5 : 1, -3, 9, -27, 81

n_num = int(input('N: '))
for i in range(n_num-1):
    print((-3)**i, end=', ')
print((-3)**(n_num-1))

#

num = int(input('N: '))
res = 1
for i in range(1, num+1):
    print (res,end=' ')
    res*= -3