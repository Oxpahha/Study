# Вам нужно решить задачи с помощью лямбд, filter, map, zip, enumerate, list comprehension
import random, math
# 1- Определить, позицию второго вхождения строки в списке либо сообщить, что её нет.
# Примеры
# список: ["qwe", "asd", "zxc", "qwe", "ertqwe"], ищем: "qwe", ответ: 3
# список: ["йцу", "фыв", "ячс", "цук", "йцукен", "йцу"], ищем: "йцу", ответ: 5
# список: ["йцу", "фыв", "ячс", "цук", "йцукен"], ищем: "йцу", ответ: -1
# список: ["123", "234", 123, "567"], ищем: "123", ответ: -1
# список: [], ищем: "123", ответ: -1

n_str, find_str = ["qwe", "asd", "zxc", "qwe", "ertqwe"], "qwe"
if (n_str.count(find_str) >= 2):
    print(list(filter(lambda x: x[1] == find_str, enumerate(n_str)))[1][0])
else: print(-1)


# 2- Найти произведение пар чисел в списке. Парой считаем первый и последний элемент, второй и предпоследний и т.д.

def enter_rndlist_size ():
    n_list = [(random.randint(1,21)) for i in range(int(input('Размер списка: ')))]
    return n_list

n_list = enter_rndlist_size()
print(n_list)

normal_list = [(n_list[i]*n_list[(-1-i)]) for i in range(math.ceil(len(n_list)/2))]
print(normal_list)
# не понимаю смысла использования лямбд, мапов итд в данном контексте
lambda_map_list = list(map(lambda i: n_list[i]*n_list[(-1-i)], [i for i in range(math.ceil(len(n_list)/2))]))
print(lambda_map_list)


# 3-Сформировать список из N членов последовательности.
# Для N = 5: 1, -3, 9, -27, 81 и т.д.

print(list((-3)**i for i in range(int(input('N: ')))))
# все еще не понимаю смысла использования лямбд, мапов итд в данном контексте
print(list(map(lambda i: (-3)**i, [i for i in range(int(input('N: ')))])))


# 4 - Дан список URL различных сайтов. Нужно составить список доменных имен сайтов.

url_list = ['https://gb.ru/lessons/284811/homework', 'https://github.com/Oxpahha', 'https://www.linkedin.com/in/aleksandr-zaichenko-oxpahha/']
url_list = [i for i in map(lambda i: i.lstrip('https://').lstrip('www.'), url_list)]
print(list(map(lambda i: i[:i.find('/')] ,url_list)))

# 5 - Есть список случайных чисел в промежутке от 1 до 100, количеством 200. Создайте список кортежей, первый элемент которого - индекс элемента, а второй - сам элемент, при условии, что они не совпадают.
# [1,1,1,1] -> [(0,1),(1,1),(2,1),(3,1)] -> [(0,1),(2,1),(3,1)]

n_list = [random.randint(0,100) for i in range(200)]
print(list(filter((lambda i: i[0]!=i[1]), enumerate(n_list))))

# 6 - Из списка выше оставьте только те пары, где сумма кортежа кратна 5
# Пример
# [(10,25),(3,4),(4,1)] => [(10,25),(4,1)]

n_list = [random.randint(0,100) for i in range(200)]
n_list = list(filter((lambda i: i[0]!=i[1]), enumerate(n_list)))
print(list(filter(lambda i: i[0]+i[1]==5, n_list)))