# типы данных 
# int float bool str list None

a = 123
print(type(a), a)
b = 1.23
print(type(b), b)
c = None
print(type(c), c)
c = 1234
print(type(c), c)
d = 'hello world'
print(type(d), d)

print(a,', ',b,', ',c)
print('{}, {}, {}'.format(a,b,c))
#                         0 1 2
print('{1}, {2}, {0}'.format(a,b,c))
print(f'{a}, {b}, {c}')

e = True
print(type(e), e)

f = []
print(type(f), f)
f = [1,2,'3',4,False]
print(f)

print('Enter g')
g = input()
print('Enter h')
h = input()
print(g,h, g+h)

print('Enter k')
k = int(input())
print('Enter l')
l = int(input())
print(k,l, k+l)

# Арифметические операции
# = - * / % // **

a = 3
b = 8
c = a+b
c = a-b
c = a*b
c = a/b
c = a//b  # целочисленное 
c = a%b   # остаток от деления
c = a**b  # возведение в степень
a = 2.5
c = round(a*b) # округление
c = round(a*b, 5) # округление до n знаков
a += 5 # сокращение операций присваивания 
print(a)
c = a+b
print(c)

# Логичекие операции
# > >= < <= == !=
# not, and, or  # не путать с & | ^
# is, is not, in, not in
# gen

# false = 0, true = 1

a = 1>4
a = 1<4 and 5>2
a = 1==4
a = 1!=4
a = 1<3<5<55
a = 1 > 2 or 4 < 6
print(a)

func = 1
T = 4
x = 2
print(func<T>(x))

a = [1,2,3,4]
print(a)
print(2 in a)

is_odd = a[0] % 2 == 0
print(is_odd)

is_odd = not [0] % 2
print(is_odd)

# Управляющие конструкции
# if, if-else while for

a = int(input('a = '))
b = int(input('b = '))
if a > b:
    print(a)
else:
    print(b)

user = input('Name: ')
if user == 'None':
    print('Huh')
elif user == 'Bruh':
    print('Yeah!')
else:
    print('Hi ',user)

original = 23
inverted = 0
while original != 0:
    inverted = inverted * 10 + (original % 10)
    original //= 10
print(inverted)

original = 23
inverted = 0
while original != 0:
    inverted = inverted * 10 + (original % 10)
    original //= 10
else:
    print('nice')
    print('one')
print(inverted)

for i in 1,2,3,4,5:
    print(i**2)

list = [1,2,3,4,5]
for i in list:
    print(i)

r = range(5)
for i in r:
    print(i)

for i in range(4,9):
    print(i)    

for i in range(4,9,2):
    print(i)   

for i in 'qwert yui':
    print(i) 

# Функции

def fname(x):
    if x == 1:
        return 'Целое'
    elif x == 2.3:
        return 23
    else:
        return

arg = 1
print(fname(arg))
print(type(fname(arg)))