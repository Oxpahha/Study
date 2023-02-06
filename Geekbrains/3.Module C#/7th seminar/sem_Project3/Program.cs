// Задайте двумерный массив. Найдите элементы, у которых оба индекса чётные
//  и замените эти элементы на их квадраты.



Console.Write("Ведите m: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите n: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];
FillArrayWithSqr(array);
PrintArray(array);

void FillArrayWithSqr(int[,] matrixArray)
{
    Random rnd = new Random();
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            matrixArray[i, j] = rnd.Next(1, 10);
            if (i > 0 && j > 0 && i % 2 == 0 && j % 2 == 0)
            {
                matrixArray[i, j] = (int)Math.Pow(matrixArray[i, j], 2);
            }
        }
    }
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