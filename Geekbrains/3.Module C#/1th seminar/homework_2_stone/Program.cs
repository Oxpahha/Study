int numOne = 0;
int numTwo = 0;

while (true)
{
    try
    {
        Console.Write("Введите первое число: ");
        numOne = int.Parse(Console.ReadLine() ?? "0");
        Console.Write("Введите второе число: ");
        numTwo = int.Parse(Console.ReadLine() ?? "0");
        break;
    }
    catch
    {
        Console.Write("Некорректное значение, введите число: ");
    }
}

if (numOne > numTwo)
    Console.Write("Число {0} больше {1}", numOne, numTwo);
else if (numOne == numTwo)
    Console.Write("Число {0} равно {1}", numOne, numTwo);
else Console.Write("Число {1} больше {0}", numOne,numTwo);    