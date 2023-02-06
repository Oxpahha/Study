//Задача 2: Напишите программу, которая на вход принимает два числа 
//и выдаёт, какое число большее, а какое меньшее.
//a = 5; b = 7 -> max = 7 min = 5
//a = 2 b = 10 -> max = 10 min = 2
//a = -9 b = -3 -> max = -3 min = -9

Console.Clear();

Console.WriteLine("Введите два числа через проблел: ");

string[] arr = Console.ReadLine().Split();

int num0 = int.Parse(arr[0]);
int num1 = int.Parse(arr[1]);

if(num0 > num1)
{
    Console.Write($"max = {num0} min = {num1}");
}
else
{
    Console.Write($"max = {num1} min = {num0}");
}