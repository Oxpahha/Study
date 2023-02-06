# 14 - Напишите программу, которая принимает на вход вещественное число и показывает сумму его цифр. Учтите, что числа могут быть отрицательными

# 67.82 -> 23
# (-0.56) -> 11

n_num = float(input('Вещественное число: '))
summ = 0
if(n_num<0):
    n_num= -n_num    
while(n_num!=int(n_num)):
    n_num = round(n_num*10, len(str(n_num))-1)
else: n_num=int(n_num)
while n_num!=0:
    summ += n_num%10
    n_num = n_num//10
print(summ)

##

n_str, summ = input('Вещественное число: '), 0
for i in range(len(n_str)):
    if (n_str[i] != ('.' or ',' or '-')):
        summ += int(n_str[i])   
print(summ)


# 15 - Напишите программу, которая принимает на вход число N и выдает набор произведений (набор - это список) чисел от 1 до N. Не используйте функцию math.factorial.
# - пусть N = 4, тогда [ 1, 2, 6, 24 ] #(1, 1*2, 1*2*3, 1*2*3*4)


n_list = []
fact = 1
for i in range(1, (int(input('N: ')))+1):
    n_list.append(fact)
    fact+=fact*i
print(n_list)


# 16 - Дан массив размера N. После каждого отрицательного элемента массива вставьте элемент с нулевым значением.
# - пусть N = 4, тогда [28, -46, 14, -14] => [28, -46, 0, 14, -14, 0]

import random

n_list = []
for i in range(1, (int(input('N: ')))+1):
    n_list.append(random.randint(-99, 100))
print(n_list,end=' => ')
for i in range(0, len(n_list)+1):
    if(n_list[i]<0):
        n_list.insert(i+1,0)
        i+=1
print(n_list)


# 17 - По кругу стоят n человек. Ведущий посчитал m человек по кругу, начиная с первого. При этом каждый из тех, кто участвовал в этом счете, получил по одной монете, остальные получили по две монеты. Далее человек, на котором остановился счет, отдает все свои монеты следующему по счету человеку, а сам выбывает из круга. До последнего человека в круге. Составьте алгоритм, который проводит эту игру. Если хотите делать паузы, то импортируйте библиотеку time и используйте оттуда функцию sleep. Определите номер этого человека и количество монет, которые оказались у него в конце игры. 
# P.S. рекомендации по выполнению 4-го задания. 1. представьте список людей в виде списка индексов: [0,1,2,3,4...]; 2. работайте одновременно со списком монет; 3. не надо писать сложных систем для "Процесс продолжается с места остановки". Достаточно использовать срезы: переместите оставшуюся часть списка вперед 4. после каждого выбывшего пусть работает input: хотите продолжать или выйти из цикла игры?

def money_dealer(ppl,mon, count):                
    for i in range(0, len(ppl)):
        if i < count:
            mon[i] += 1
        else: mon[i] += 2
    print('Игроки получили свои кровавые деньги.')    
    return mon

def anounce(ppl,mon):
    print(f'Игроки с номерами: {ppl} \nДеньги на руках:   {mon}')

def man_count(ppl):
    ppl_counter = -1
    while(ppl_counter<1 or ppl_counter>len(ppl)):
        try:
            ppl_counter = int(input('Считаем до: '))
            if(ppl_counter<1 or ppl_counter>len(ppl)):
                    print('Попробуй другое число')
        except:
            print('Это вообще не число')
    return ppl_counter


people_list = []
money_list = []

for i in range(0, (int(input('Безумцев в смертельной игре: ')))):
    people_list.append(i)
    money_list.append(0)

for i in range(0,len(people_list)-1):
    anounce(people_list,money_list)
    
    counter = man_count(people_list)

    money_list = money_dealer(people_list,money_list, counter)
    anounce(people_list,money_list)

    last_player_def = counter
    if(counter == len(people_list)):
        last_player_def = 0

    print(f'Игроку: {people_list[counter-1]} сегодня не везет.\n{money_list[counter-1]} единиц валюты достаются {people_list[last_player_def]} игроку')
    
    if(counter == len(people_list)):
        stack = money_list.pop(counter-1) + money_list.pop(last_player_def)
    else: stack = money_list.pop(last_player_def) + money_list.pop(counter-1)

    money_list.insert(last_player_def, stack)
    people_list.pop(counter-1)

    anounce(people_list,money_list)
    if(len(people_list) > 1):
        quit = input('Хотите продолжать или выйти из цикла игры?\n N - чтобы выйти:  ')
        if(quit=='N' or quit=='n'):
            print('Ты сбежал так и не узнав кто победил')
            break
    else: print(f'Победил игрок {people_list} унеся с собой монет в кол-ве {money_list} шт')
