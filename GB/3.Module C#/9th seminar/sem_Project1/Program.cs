// Задача 70: Напишите программу, которая печатает последовательность чисел,
//  где каждое следующее равно сумме двух предыдущих. 
//  На вход принимает 3 числа:  n1, n2 и N
//  где n1 n2 - первые числа последовательности
//  N – длина последовательности
//  3 и 4, N = 5 -> 3 4 7 11 18
//  6 и 10, N = 4 -> 6 10 16 26 

int a = InputIntNumber();
int b = InputIntNumber();
int n = InputIntNumber(true);
PrintSummTwoLastNumbers(a, b, n);

void PrintSummTwoLastNumbers(int firstNum, int secondNum, int counter)
{
    int temp = 0;

    Console.Write($"{firstNum} ");
    Console.Write($"{secondNum} ");

if (counter > 2)
    for (int i = 0; i < counter - 2; i++)
    {
        temp = firstNum + secondNum;
        firstNum = secondNum;
        secondNum = temp;
        Console.Write($"{temp} ");
    }
}

int InputIntNumber(bool x = false)
{
    if (x == false)
        Console.Write($"Ведите число: ");
    else
        Console.Write($"Ведите число N: ");

    int number = int.Parse(Console.ReadLine() ?? "0");

    return number;
}