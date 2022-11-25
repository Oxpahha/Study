# Напишите программу в которой пользователь будет задавать две строки, а программа - определять количество вхождений одной строки в другой.

fir_string = input('Первая строка: ')
sec_string = input('Вторая строка: ')
print("В одной из строк ", fir_string.count(sec_string) or sec_string.count(fir_string), " повторений другой")

##

str1 = input('long: ')
str2 = input('short: ')
count = 0
for i in range(len(str1) - len(str2) +1):
    if str1[i:i+len(str2)] == str2:
        count += 1
print(count)        

##

str1 = input('long: ')
str2 = input('short: ')
i = 0
count = 0
while count <len(str1):
    if str1[i:i+len(str2)] == str2:
        count += 1
        i+= len(str2)
    else: i += 1
print(count)
