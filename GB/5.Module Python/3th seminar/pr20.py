# Задайте список. Напишите программу, которая определит, присутствует ли в заданном списке строк некое число.
# ['gfh5', 'gfh2', '67', 'jy32', '3put'] - ищем 32 - находим по индексу 3


n_list= [(input(f'Задайте элемент {i+1} списка: ')) for i in range(int(input('Размер списка: ')))]
want_to_find = input('Хочу найти: ')
for j in range(len(n_list)):
    if n_list[j] == want_to_find:
        print(f'Объект был найден по индексу {j}')
        check = 1
    else: check = 0
if (check==0): print('Объект не был найден')

##

n_list= ['gfh5', 'gfh2', '67', 'jy32', '3put']
want_to_find = input('Хочу найти: ')
check = 0
for j in range(len(n_list)):
    n_object = n_list[j].find(want_to_find)
    if n_object != -1:
        print(f'Объект был найден по индексу {j}')
        check = 1
if (check==0): print('Объект не был найден')