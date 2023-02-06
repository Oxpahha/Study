//Напишите программу, которая принимает на вход три числа и выдаёт максимальное из этих чисел.

//2, 3, 7 -> 7
//44 5 78 -> 78
//22 3 9 -> 22

Console.Clear();

Console.WriteLine("Введите три числа через проблел: ");

string[] arr = Console.ReadLine().Split();

int num0 = int.Parse(arr[0]);
int num1 = int.Parse(arr[1]);
int num2 = int.Parse(arr[2]);

if(num0 > num1 & num0 > num2)
{
    Console.Write(num0);
}
if(num1 > num2 & num1 > num0)
{
    Console.Write(num1);
}
if(num2 > num1 & num2 > num0)
{
    Console.Write(num2);
}