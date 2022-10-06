// Написать программу, которая рекурсивным методом переводит числа из
//  десятичной системы счисления в двоичную
// 2 -> 10
// 11 -> 1011
// 16 -> 10000

int num = InputIntNumber();
Console.Write($"Число {num} в двоичной системе - ");
ConvertToBin(num);

void ConvertToBin(int num, string bin = "")
{
    if (num > 0)
    {
        if (num % 2 == 1)
            bin += "1";
        else
            bin += "0";
        ConvertToBin(num / 2);
    }
    Console.Write(bin);
}

int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите число: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        return number;
    }
}