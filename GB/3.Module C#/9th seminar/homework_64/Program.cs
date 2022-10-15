//  Задача 64: Задайте значение N. Напишите программу,
//  которая выведет все натуральные числа в промежутке от N до 1.
//  Выполнить с помощью рекурсии.

// N = 5 -> "5, 4, 3, 2, 1"
// N = 8 -> "8, 7, 6, 5, 4, 3, 2, 1"

Console.Clear();

int n = InputIntNumber();

Console.WriteLine(RecPrintToOne(n));

string RecPrintToOne(int numN)
{
    if (1 <= numN) return $"{numN} " + RecPrintToOne(numN - 1);
    else return String.Empty;
}

int InputIntNumber()
{
    while (true)
    {
        Console.Write($"Ведите число N: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 0)
            return number;
    }
}