// Задача 66: Задайте значения M и N. Напишите программу, 
// которая найдёт сумму натуральных элементов в промежутке от M до N.
// Рекурсивно

// M = 1; N = 15 -> 120
// M = 4; N = 8. -> 30

int m = InputIntNumber('M');
int n = InputIntNumber('N');

Console.WriteLine(RecSumOfNumsBetween(m, n));


int RecSumOfNumsBetween(int numM, int numN)
{
    if (numM <= numN)
    {
        if (numM - numN == 0)
            return numM;
        else
            return numM + RecSumOfNumsBetween(numM + 1, numN);
    }
    else
    {
        if (numN - numM == 0)
            return numN;
        else
            return numN + RecSumOfNumsBetween(numN + 1, numM);
    }
}

int InputIntNumber(char ch = ' ')
{
    while (true)
    {
        Console.Write($"Ведите число {ch}: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 0)
            return number;
    }
}