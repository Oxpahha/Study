// Задача 68: Напишите программу вычисления функции Аккермана с помощью рекурсии.
// Даны два неотрицательных числа m и n.
// m = 2, n = 3 -> A(m,n) = 9
// m = 3, n = 2 -> A(m,n) = 29


int m = InputIntNumber('m');
int n = InputIntNumber('n');

Console.WriteLine($"A(m,n) = {AckermanFunc(m, n)}");


int AckermanFunc(int numM, int numN)
{
    if (numM == 0)
    {
        return numN + 1;
    }
    if (numM > 0 && numN == 0)
    {
        return AckermanFunc(numM - 1, 1);
    }
    if (numM > 0 && numN > 0)
    {
        return AckermanFunc(numM - 1, AckermanFunc(numM, numN - 1));
    }
    return AckermanFunc(numN, numM);
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