# без лямбды

def sum(x, y):
    return x+y


def mult(x, y):
    return x*y


def calc(op, a, b):
    return op(a, b)


print(calc(mult, 4, 5))

# лямбда, не понятно зачем вообще оно надо


def mult2(x, y): return x*y


print(calc(mult2, 4, 5))

print(calc(lambda x, y: x*y, 4, 5))

# List Comprehension
# [exp for item in iterable]
# [exp for item in iterable (if conditional)]

# обычно
list1 = []
for i in range(1, 21):
    if (i % 2 == 0):
        list1.append(i)
print(list1)

# Comprehension

list2 = [i for i in range(1, 21) if i % 2 == 0]
print(list2)

# Кортежи

list3 = [(i, i) for i in range(1, 21) if i % 2 == 0]
print(list3)

# обработка данных


def f(x):
    return x**3


list4 = [f(i) for i in range(1, 21) if i % 2 == 0]
print(list4)

list5 = [(i, f(i)) for i in range(1, 21) if i % 2 == 0]
print(list5)

###

path = 'GB/5.Module Python/3th lecture/file.txt'
file = open(path, 'r')
data = file.read() + ' '
file.close()

num = []

while data != '':
    spase_pos = data.index(' ')
    num.append(int(data[:spase_pos]))
    data = data[spase_pos+1:]

out = []
for e in num:
    if not e%2:
        out.append((e,e**2))
print(out)

#

def select(func,dat):
    return[func(x) for x in dat]

def where(func,dat):
    return [x for x in dat if func(x)]

data = '1 2 3 5 8 15 23 38'.split()
res = select(int,data)
res = where(lambda x: not x%2, res)
res = select(lambda x:(x,x**2), res)
print(res)

## Map

li = [x for x in range(1,20)]
li = list(map(lambda x: x+10, li))
print(li)

#

# data = list(map(int, input().split()))
# print(data)

#

data = list(map(int, '1 2 3 4'.split()))
for e in data:
    print(e,end=' ')
print()
for e in data:
    print(e,end=' ')
print()
#

def where(func,dat):
    return [x for x in dat if func(x)]

data = '1 2 3 5 8 15 23 38'.split()
res = map(int,data)
res = where(lambda x: not x%2, res)
res = list(map(lambda x:(x,x**2), res))
print(res)

### Filter

data = [x for x in range(10)]
res = list(filter(lambda x: not x%2, data))
print(res)

#

data = '1 2 3 5 8 15 23 38'.split()
res = map(int,data)
res = filter(lambda x: not x%2, res)
res = list(map(lambda x:(x,x**2), res))
print(res)

### Zip

users = ['user1','user2','user3','user4','user5']
ids = [4,5,9,14,7]
sal = [111,222,333]

data_n = list(zip(users,ids, sal))
print(data_n)

### enumerate

users = ['user1','user2','user3','user4','user5']

data_n = list(enumerate(users))
print(data_n)