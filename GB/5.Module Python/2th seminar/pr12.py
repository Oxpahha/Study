# Для натурального n создать словарь индекс-значение, состоящий из элементов последовательности 3n + 1.
# Для n =: {1: 4, 2: 7, 3: 10, 4: 13, 5: 16, 6: 19}

n_num = int(input("N: "))
d_range = {i : 3*i + 1 for i in range(1,n_num+1)}
print(f"Для {n_num} =: {d_range}")

##

d_range = {}
n_num = int(input("N: "))
for i in range(1,n_num+1):
    d_range[i]= 3*i+1
print(d_range)

##

n_num = int(input('N: '))
print(n_num,": {",end='')
for i in range(1, n_num):
    print(i,": ",(3*i)+1,", ",end='')
print(n_num,": ",(3*n_num)+1,"}")