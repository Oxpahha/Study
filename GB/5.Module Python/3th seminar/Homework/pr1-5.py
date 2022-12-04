def enter_list ():
    n_list = [(input(f'Задайте {i+1}-й элемент списка: ')) for i in range(int(input('Размер списка: ')))]
    return n_list

# 1- Задайте список из нескольких чисел. Напишите программу, которая найдёт сумму элементов списка, стоящих на нечётной позиции.
# [2, 3, 5, 9, 3] -> на нечётных позициях элементы 3 и 9, ответ: 12

def odd_index_summary (input_list, summ = 0):
    leng = len(input_list)
    for j in range(1,leng,2):
        summ += int(input_list[j]) 
    return summ

print(odd_index_summary(enter_list()))


# 2-Напишите программу, которая найдёт произведение пар чисел списка. Парой считаем первый и последний элемент, второй и предпоследний и т.д.
# [2, 3, 4, 5, 6] => [12, 15, 16];
# [2, 3, 5, 6] => [12, 15]

def first_last_summary_cycle (input_list):
    output_list = []
    if len(input_list)%2==0:
        leng = round(len(input_list)/2)
    else: leng = round(len(input_list)/2)+1
    for i in range(0,leng):
        output_list.append(int(input_list[i])*int(input_list[-1-i]))
    return output_list

print(first_last_summary_cycle(enter_list()))


# 3-Задайте список из вещественных чисел. Напишите программу, которая найдёт разницу между максимальным и минимальным значением дробной части элементов.
# [1.1, 1.2, 3.1, 5.17, 10.02] => 0.18 или 18
# [4.07, 5.1, 8.2444, 6.9814] - 0.9114 или 9114

liste = [1.1, 1.2, 3.1, 5.17, 10.02]

def remove_ant(str_float_n):
    diff = float(str_float_n)-(float(str_float_n)//1)
    return diff

def min_max_fraс_diff(input_list):
    min_n = remove_ant(input_list[0])
    max_n = remove_ant(input_list[0])

    for i in range(1,len(input_list)):
        if remove_ant(input_list[i]) < min_n:
            min_n = remove_ant(input_list[i])
        if remove_ant(input_list[i]) > max_n:
            max_n = remove_ant(input_list[i])

    return(max_n-min_n)

print(min_max_fraс_diff(liste))

## Ненавижу питон за его работу с точкой. Не представляю какой костыль надо чтобы еще и счиать символы после точки.

m_list = liste
final_list = [round(i%1,2) for i in m_list if i%1 != 0]
print(max(final_list) - min(final_list))


# 4- Напишите программу, которая будет преобразовывать десятичное число в двоичное. Подумайте, как это можно решить с помощью рекурсии.
# Не использовать функцию bin
# 45 -> 101101
# 3 -> 11
# 2 -> 10

n_str = ""
n_input = int(input("Число: "))
while n_input != 0:
    n_str = str(n_input%2) + n_str
    n_input //=2
print(n_str)

# 5-Задайте число. Составьте список чисел Фибоначчи, в том числе для отрицательных индексов.
# для k = 8 список будет выглядеть так: [-21 ,13, -8, 5, −3, 2, −1, 1, 0, 1, 1, 2, 3, 5, 8, 13, 21]
# Решение оформлять в виде функций
# По возможности добавляйте docstring


def fibo(int_n):
    if int_n in [1, 2]:
        return 1
    else:
        return fibo(int_n-1) + fibo(int_n-2)

def neg_fibo(int_n):
    if int_n == 1:
        return 1
    elif int_n == 2:
        return -1
    else:
        first_num, sec_num = 1, -1
        for i in range(2, int_n):
            first_num, sec_num = sec_num, first_num - sec_num
        return sec_num

list = [0]
userNumber = int(input('Число: '))
for e in range(1, userNumber + 1):
    list.append(fibo(e))
    list.insert(0, neg_fibo(e))
print(list)