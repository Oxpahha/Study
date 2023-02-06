// Напишите программу, которая принимает на вход
// трёхзначное число и на выходе показывает вторую цифру этого числа.


int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите трёхзначное число: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 99 && number < 1000)
        return number;
    }
}
int num = InputIntNumber();

int frsNum = num / 100;
int secNum = num / 10 % 10;
int thrNum = num % 10;

Console.WriteLine("Это цифра " + secNum);