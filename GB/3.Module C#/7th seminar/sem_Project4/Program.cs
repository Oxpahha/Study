// Задайте двумерный массив. Найдите сумму элементов,
//  находящихся на главной диагонали 
//  (с равными индексами (0,0); (1;1) и т.д.)


Console.Write("Ведите m: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите n: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];

FillArray(array);
PrintArray(array);

void FillArray(int[,] matrixArray)
{
    Random rnd = new Random();
    int sum = 0;
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            matrixArray[i, j] = rnd.Next(1, 10);
            if (i == j)
            {
                sum += matrixArray[i, j];
            }
        }
    }
    Console.WriteLine($"Cумму элементов, находящихся на главной диагонали: {sum} ");
}

void PrintArray(int[,] matrixArray)
{
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            Console.Write($"{matrixArray[i, j]} ");
        }
        Console.WriteLine();
    }
}