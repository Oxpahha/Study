# Напишите программу которая принимает на вход число N и проверяет кратно ли оно 5 и 10 или 15, но не 30

n_num = int(input("N: "))
if (n_num%5%10==0|n_num%15==0)&n_num%30!=0:
    print("да")
else: print("нет")