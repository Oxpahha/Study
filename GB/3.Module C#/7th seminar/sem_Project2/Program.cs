// Задайте двумерный массив размера m на n, 
// каждый элемент в массиве находится по формуле:
//  Aₘₙ = m+n. 
//  Выведите полученный массив на экран.
// m = 3, n = 4.
// 0 1 2 3
// 1 2 3 4
// 2 3 4 5

Console.WriteLine("Ведите m: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.WriteLine("Ведите n: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];
FillArray(array);
PrintArray(array);

void FillArray(int[,] matrixArray)
{
    int[,] a = new int[m, n];

    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            matrixArray[i, j] = (i + j);
        }
    }
}

void PrintArray(int[,] matrixArray)
{
    int rows = matrixArray.GetLength(0);
    int columns = matrixArray.GetLength(1);
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"{matrixArray[i, j]} ");
        }
        Console.WriteLine();
    }
}