# 1-Напишите программу, удаляющую из текста все слова, содержащие заданную строку.
# Пример:
# Пугать ты галок пугай => заданная строка "галок" => Пугать ты пугай
# Пугать ты галок пугай => заданная строка "пуг" => Пугать ты галок

n_str = input("Введите текст: ")
find_str = input("Заданная строка: \n")
m_str = [i for i in n_str.split() if find_str not in i]
print(" ".join(m_str))

# 2-Создайте программу для игры с конфетами человек против человека.
# Условие задачи: На столе лежит 2021(или сколько вы скажете) конфета. Играют два игрока делая ход друг после друга. Первый ход определяется жеребьёвкой. За один ход можно забрать не более чем 28(или сколько вы зададите в начале) конфет. Все конфеты оппонента достаются сделавшему последний ход. Сделайте эту игру.
# a) Добавьте игру против бота
# b) Подумайте как наделить бота ""интеллектом""
# Если делаете a и b - не нужно создавать отдельных файлов с полностью копированным кодом, лучше выделите в отдельные функции бота и умного бота.

from random import randint

def candy_picker(player, candy_pick):
    i = int(input(f"{player}, введите количество конфет, которое возьмете от 1 до {candy_pick}: "))
    while i < 1 or i > candy_pick:
        i = int(input(f"Конфет должно быть от 1 до {candy_pick}: "))
    return i

def step_printer(player_name, candy, candy_counter, candy_value):
    print(f"{player_name} взял {candy}шт, у него всего {candy_counter}шт конфет. На столе {candy_value} осталось конфет")

def player_pick(n_num):
    player = input('Кто будет играть?\nВведите имя Игрока или "Бот"\n')
    if player != 'Бот':
        return player
    else: return f'Бот{n_num}'

def last_candy_check(max_c,max_c_pick):
    if ((max_c%max_c_pick)-1) == 0:
        return 1
    else: return ((max_c%max_c_pick)-1)

player1 = player_pick(1)
player2 = player_pick(2)
player1_bank = 0 
player2_bank = 0
max_candy = int(input("Всего количество конфет на столе: "))
max_candy_pick = int(input("Сколько конфет можно взять за раз: "))
flag = randint(0,2)
if flag:
    print(f"Первый ходит {player1}")
else:
    print(f"Первый ходит {player2}")

while max_candy > max_candy_pick:
    if flag:
        if (player1 != 'Бот1'):                             # проверка на бота
            stash = candy_picker(player1, max_candy_pick)
        else: 
            if (max_candy < max_candy_pick*2):              # "умный" бот
                stash = last_candy_check(max_candy,max_candy_pick)
            else: stash = randint(1,max_candy_pick+1)  
        player1_bank += stash
        max_candy -= stash
        flag = False
        step_printer(player1, stash, player1_bank, max_candy)
    else:
        if (player2 != 'Бот2'):
            stash = candy_picker(player2, max_candy_pick)
        else: 
            if (max_candy < max_candy_pick*2):
                stash = last_candy_check(max_candy,max_candy_pick)
            else: stash = randint(1,max_candy_pick+1)   
        player2_bank += stash
        max_candy -= stash
        flag = True
        step_printer(player2, stash, player2_bank, max_candy)

if flag:
    print(f"Выиграл {player1}")
else:
    print(f"Выиграл {player2}")



# 3-Создайте программу для игры в ""Крестики-нолики"".


def print_board(board):
    print('-'*12)
    for i in range(3):
        print('|', board[0+i*3],'|', board[1+i*3], '|', board[2+i*3], '|')
        print('-'*12)

def n_choice(str_player):
    valid = False
    while not valid:
        player_index = input(f'Выберите поле для {str_player}: ')
        try:
            player_index =int(player_index)
        except:
            print('Нет такого поля')
            continue
        if player_index >= 1 and player_index <= 9:
            if(str(board[player_index-1]) not in 'XO'):
                board[player_index-1] = str_player
                valid = True
            else:
                print('Занято')
        else:
            print('Попробуй еще раз ')

def victory_check(board):
    victory = ((0,1,2),(3,4,5),(6,7,8),
               (0,3,6),(1,4,7),(2,5,8),
               (0,4,8),(2,4,6))
    for i in victory:
        if board[i[0]] == board[i[1]] == board[i[2]]:
            return board[i[0]]
    return False

board = list(range(1,10))
counter = 0
vic = False

while not vic:
    print_board(board)
    if counter == 9:
        print('Ничья)')
        break
    if counter % 2 == 0:
        n_choice('X')
    else:
        n_choice('O')
    counter +=1
    if counter > 4:
        win = victory_check(board)
        if win:
            print(win,'Победа')
            vic = True
            break
    print_board(board)
