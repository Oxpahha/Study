// Напишите программу, которая будет рекурсивно выводить каждый элемент массива в консоль

int[] array = new int[InputIntNumber()];
FillArray(array);
PrintArray(array);
RecElPrinter(array,0);

void RecElPrinter(int[] num, int i)
{
    if (i < num.Length)
    {
        Console.Write($"{num[i]} ");
        i++;
        RecElPrinter(num, i);
    }
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

void FillArray(int[] array)
{
    Random rand = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rand.Next(1, 10);
    }
}

void PrintArray(int[] array)
{
    int count = array.Length;
    Console.Write("[");
    for (int i = 0; i < count; i++)
    {
        Console.Write(array[i]);
        if (i == count - 1)
            Console.WriteLine("]");
        else
            Console.Write(", ");
    }
}