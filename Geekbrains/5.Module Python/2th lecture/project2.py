
colors = ['red','green','blue\n']
path = 'GB/5.Module Python/2th lecture/file.txt'
data = open(path, 'w')
data.writelines(colors)
data.write('LINE 2\n')
data.write('LINE 3\n')
data.close()

##

path = 'GB/5.Module Python/2th lecture/file.txt'
with open(path, 'a') as data:
    data.write('new line 4\n')
    data.write('new line 5\n')

##

path = 'GB/5.Module Python/2th lecture/file.txt'
data = open(path, 'r')
for line in data:
    print(line, end='')
data.close()

##

import testfunc
print(testfunc.fname(1))


import testfunc as tf
print(tf.fname(1))

##
# Кортежи. Неизменяемые списки

a,b = 3,4                  # a = 3, b = 4
a = (3,...,4)              # a = (3, 4), a[0] = 3, a[-1] = 4
colors = ['red','green']   # -> ['red','green']
t = tuple(colors)          # t = ('red','green')

c = (3,4,5)  
for item in c:
    print(item, end=' ')   # 3 4 5

d = tuple(['red','green','blue'])
red,green,blue = d
print('r:{} g:{} b:{}'.format(red,green,blue)) # r:red g:green b:blue 


##
#Словари

dictio = {}
dictio = \
    {
        'up': "w",
        'down': "s",
        'left': "a",
        'right': "d",
    }
print(dictio)               # {'up':'w','down':'s','left':'a','right':'d'}

print(dictio['left'])       # a

for e in dictio.keys():
    print(e, end=" ")          # up down left right 

for f in dictio.values():
    print(f, end=" ")          # w a s d   

for g in dictio:
    print(g, end=" ")          # up down left right    

for h in dictio:
    print(dictio[h], end=" ")  # w a s d   

del dictio['left']

dictio['left'] = 'a'

for item in dictio:
    print('{}:{}'.format(item, dictio[item]), end='') # up:w down:s left:a right:d


##
#Множества

colors = {'red','green'}
print(colors)             # {'red','green'}

colors.add('red')
print(colors)             # {'red','green'}

colors.add('blue')
print(colors)             # {'red','green', 'blue'}

colors.remove('red')
print(colors)             # {'green', 'blue'}

colors.clear()       
print(colors)             # set()

i = {1,2,3,5,8}
j = {2,5,8,13,21}
k = i.copy()              # {1,2,3,5,8}
l = i.union(j)            # {1,2,3,5,8,13,21}
m = i.intersection(j)     # {8,2,5}
dl = i.difference(j)      # {1,3}
dr = j.difference(i)      # {13,21}

o = i \
    .union(j) \
    .difference(i.intersection(j))  # {1,21,3,13}

p = frozenset(i)  # неизменяемое

##
# Списки

list1 = [1,2,3,4,5]
list2 = list1

for e in list1:
    print(e,end=' ')   # 1 2 3 4 5

for e in list2:
    print(e,end=' ')   # 1 2 3 4 5

list1[0] = 123

for e in list1:
    print(e,end=' ')   # 123 2 3 4 5

for e in list2:
    print(e,end=' ')   # 123 2 3 4 5

list2[1] = 333

for e in list1:
    print(e,end=' ')   # 123 333 3 4 5

for e in list2:
    print(e,end=' ')   # 123 333 3 4 5

list3 = [1,2,3,4,5]

print(list3)           # [1,2,3,4,5]
print(list3.pop())     # 5
print(list3)           # [1,2,3,4]
print(list3.pop())     # 4
print(list3)           # [1,2,3]
print(list3.pop())     # 3
print(list3)           # [1,2]

list4 = [1,2,3,4,5]
print(list4)           # [1,2,3,4,5]
print(list4.pop(2))    # 3
print(list4)           # [1,2,4,5]

list4 = [1,2,4,5]
print(list4)           # [1,2,3,4,5]
print(list4.insert(2, 11))    
print(list4)           # [1,2,11,4,5]

list5 = [1,2,4,5]
print(list5)           # [1,2,3,4,5]
print(list5.append(11))    
print(list5)           # [1,2,4,5,11]