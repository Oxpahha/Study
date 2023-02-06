// Console.Clear();

// Console.Write("Введите число: ");
// int a = int.Parse(Console.ReadLine() ?? "0");
// Console.Write("Введите число: ");
// int b = int.Parse(Console.ReadLine() ?? "0");

// void PrintArray(int[] array)
// {
//     for (int i = 0; i < array.Length; i += 1)
//         Console.Write(array[i] + " ");
//     Console.WriteLine();
// }

// int Summa(int a, int b) ИЛИ
// {
//     int summ = a + b;
//     return summ;
// }

// int Summa(int a, int b)
// {
//     return a + b;
// }

// void Error()
// {
//     Console.WriteLine("Ошибка");
// }


int InputIntNumber()
{
    int count = 0;
    while(true)
    {
        if (count > 3) 
            Console.WriteLine("Ты тупой? Целое число!");
        try
        {
            Console.Write("Ведите целое число: ");
            int number = int.Parse(Console.ReadLine() ?? "0");
            return number;
        }
        catch
        {
            Console.WriteLine("Ошибка, введите целое число!");
            count++;
        }
    }
}

int a = InputIntNumber();
int b = InputIntNumber();

Console.WriteLine (a+b);

// int sum = (Summa(a, b));
// Console.WriteLine(summ);
// Console.WriteLine(Summa(a, b));

// int[] array = new int[5];
// PrintArray(array);
// int[] array2 = { 1, 2, 3, 5, 6 };
// PrintArray(array2);