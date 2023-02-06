// Задайте массив вещественных чисел. 
// Найдите разницу между максимальным и минимальным элементов массива.
// [3 7 22 2 78] -> 76

Console.Clear();

Console.Write("Размер массива: ");
int arrayLength = int.Parse(Console.ReadLine() ?? "0");
double[] arrayOne = new double[arrayLength];

FillArray(arrayOne);
PrintArray(arrayOne);
Console.Write(MaxMinDiff(arrayOne));


void FillArray(double[] array)
{
    Random rand = new Random();
    int length = array.Length;
    for (int i = 0; i < length; i++)
    {
        array[i] = Math.Round(Convert.ToDouble(rand.Next(0, 10)) + rand.NextDouble(), 2);
    }
}

double MaxMinDiff(double[] array)
{
    int min = 0;
    int max = 0;
    int length = array.Length;
    for (int i = 0; i < length; i++)
    {
        if (array[i] < array[min])
            min = i;
        if (array[i] > array[max])
            max = i;
    }
    return Math.Round(array[max]-array[min],2);
}

void PrintArray(double[] array)
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