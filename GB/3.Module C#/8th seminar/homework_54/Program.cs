// Задайте двумерный массив. Напишите программу, которая упорядочит по убыванию
//  элементы каждой строки двумерного массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// В итоге получается вот такой массив:
// 7 4 2 1
// 9 5 3 2
// 8 4 4 2

Console.Write("Ведите кол-во строк: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];

FillArray(array);
PrintArray(array);

SortMatrixArray(array);
Console.WriteLine();
PrintArray(array);


void SortMatrixArray(int[,] matrixArray)
{
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        int[] array = new int[matrixArray.GetLength(0)];
        int k = 0;
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            array[k] = matrixArray[i, j];
            k++;
            if (j == matrixArray.GetLength(1) - 1)
            {
                for (int l = 0; l < array.Length; l++)
                {
                    for (int m = l + 1; m < array.Length; m++)
                    {
                        if (array[l] < array[m])
                        {
                            int t = array[l];
                            array[l] = array[m];
                            array[m] = t;
                        }
                    }
                }

                for (int y = 0; y < matrixArray.GetLength(1); y++)
                {
                    int b = 0;
                    for (int e = 0; e < matrixArray.GetLength(1); e++)
                    {
                        matrixArray[i, e] = array[b];
                        b++;
                    }
                }
            }
        }
    }
}

void FillArray(int[,] matrixArray)
{
    Random rnd = new Random();
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            matrixArray[i, j] = rnd.Next(1, 10);
        }
    }
}

void PrintArray(int[,] matrixArray)
{
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        Console.Write("[ ");
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            Console.Write(matrixArray[i, j] + " ");
        }
        Console.Write("]");
        Console.WriteLine();
    }
}