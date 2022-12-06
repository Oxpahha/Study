# Задайте два числа. Напишите программу, которая найдет НОК (наименьшее общее кратное) этих двух чисел. НОК - наименьшее общее кратное, которое делится и на первое, и на второе число.

def find_nod(first_num, second_num):
    while first_num!=0 and second_num!=0:
        if first_num > second_num:
            first_num %= second_num
        else: second_num %= first_num
    return first_num+second_num

def find_nok(first_num, second_num,nod):
    return first_num*second_num/nod

a_num, b_num = map(int, input('Введите числа через пробел: ').split())

print(find_nok(a_num,b_num,find_nod(a_num,b_num)))