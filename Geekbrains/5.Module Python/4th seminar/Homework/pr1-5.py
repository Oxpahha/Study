# 1 - Задайте натуральное число N. Напишите программу, которая составит список простых множителей числа N.
# N = 20 -> [2,5]
# N = 30 -> [2, 3, 5]

n_list = []
n_num = int(input("N: "))
simple = 2
n_list.append(simple) 
while simple <= n_num:
    if n_num % simple == 0:
        if simple != 2:
            n_list.append(simple)
        n_num //= simple
        simple = 2
    else: simple += 1
print(n_list)


# 2 - Задайте последовательность чисел. Напишите программу, которая выведет список неповторяющихся элементов исходной последовательности. Не использовать множества.
# Постарайтесь решить за одно условие
# [1,1,1,1,2,2,2,3,3,3,4] -> [1,2,3,4]

n_list = []
[n_list.append(i) for i in (list(map(int, input("Введите числа через запятую:\n").split(",")))) if i not in n_list]
print(n_list)

# 3 - В файле, содержащем фамилии студентов и их оценки, изменить на буквы в верхнем регистре тех студентов, которые имеют средний балл более «4».
# Нужно перезаписать файл.
# Пример:
# Ангела Меркель 5
# Энакин Скайуокер 5
# Фредди Меркури 3
# Александр Пушкин 4

# Программа выдаст:
# АНГЕЛА МЕРКЕЛЬ 5
# ЭНАКИН СКАЙУОКЕР 5
# Фредди Меркури 3
# Александр Пушкин 4

# Решения оформляйте в виде функций
# Используйте type hints и doctring


def return_line_str(file):
    data = open(file, 'r',encoding='UTF8')
    n_list = [] 
    for line in data:
        [n_list.append(line.rstrip())] 
    data.close()  
    return n_list

def line_upper(n_list):
    for i in range(0,len(n_list)):    
        if ('4' in n_list[i]) or ('5' in n_list[i]):
            n_list[i] = n_list[i].upper()
    return n_list         

def write_to_file(n_list,file):
    data = open(file,'w+',encoding='UTF8')
    for i in n_list:    
        data.write(f'{i}\n')
    data.close()

path = 'GB/5.Module Python/4th seminar/Homework/file.txt'
full_list = return_line_str(path)
print(write_to_file(line_upper(full_list),path))
