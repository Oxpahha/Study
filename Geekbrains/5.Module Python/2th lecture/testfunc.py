def fname(x):
    if int(x) == x:
        return 'Целое'
    else:
        return 'Не целое'

##

def n_multiplier(symbol, count = 3):
    return symbol * count

# n_multiplier('!')    # !!!
# n_multiplier('!', 5) # !!!!!
# n_multiplier(2, 3)   # 6


##

def str_concatenatio(*param):
    res: str = ""
    for item in param:
        res += item
    return res

# str_concaten('a','b','c','d')   # abcd
# str_concaten('2','3','a')       # 23a
# str_concaten(1,2,3,4)           # TypeError: ...

##

def fib(n):
    if n in [1,2]:
        return 1
    else: return fib(n-1) + fib(n-2)

# list = []
# for e in range(1,10):
#     list.append(fib(e))
# print(list)             #1 1 2 3 5 8 13 21 34

##



