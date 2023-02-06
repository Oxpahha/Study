# Задана натуральная степень n. Сформировать случайным образом список коэффициентов (значения от 0 до 100) многочлена и записать в файл многочлен степени n.
# Пример:
# - n=2 => 2*x² + 4*x + 5 = 0 или x² + 5 = 0 (коэф: []) или 10*x² = 0

# Уточнения:
# n - это степень икса первого элемента полинома
# при n =3 => 5*x*3 + 18*x**2 + 7*x + 19 = 0 - коэффициенты = [5,18,7,19]
# при n=2 => 2*x² + 4*x + 5 = 0(коэф: [2,4,5]) или x² + 5 = 0 (коэф: [1,0,5]) или 10*x²(коэф: [10,0,0]) = 0
# при n=10 => 56 * x*10 = 0

# коэффициенты - это числа перед элементами полинома.
# коэффициенты могут быть нулем, кроме первого

import random

def write_to_file(n_str, file):
    with open(file,'w',encoding='UTF8') as data:
        data.write(n_str)

def create_coefficient_list(n_int):
    n_list = [random.randint(0,101) for i in range(n_int+1)]
    return n_list
    
def create_formula_str(coef_list):
    n_list= coef_list[::-1]
    write = ''
    if len(n_list) > 0:
        for i in range(len(n_list)):
            if i != len(n_list) - 1 and n_list[i] != 0 and i != len(n_list) - 2:
                write += f'{n_list[i]}x^{len(n_list)-i-1}'
                if n_list[i+1] != 0:
                    write += ' + '
            elif i == len(n_list) - 2 and n_list[i] != 0:
                write += f'{n_list[i]}x'
                if n_list[i+1] != 0:
                    write += ' + '
            elif i == len(n_list) - 1 and n_list[i] != 0:
                write += f'{n_list[i]} = 0'
            elif i == len(n_list) - 1 and n_list[i] == 0:
                write += ' = 0'
    else: write = 'x = 0'            
    return write

path = 'GB/5.Module Python/5th seminar/file.txt'
int_degree = int(input("Задана натуральная степень n: "))
write_to_file(create_formula_str(create_coefficient_list(int_degree)),path)