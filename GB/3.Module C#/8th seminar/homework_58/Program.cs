//  Задайте две матрицы. Напишите программу, которая будет находить произведение двух матриц.
// Например, даны 2 матрицы:
// 2 4 | 3 4
// 3 2 | 3 3
// Результирующая матрица будет:
// 18 20
// 15 18


Console.Write("Ведите кол-во строк первой матрицы: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн первой матрицы: ");
int n = int.Parse(Console.ReadLine() ?? "0");

Console.Write("Ведите кол-во строк второй матрицы: ");
int a = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн второй матрицы: ");
int b = int.Parse(Console.ReadLine() ?? "0");

if (n != a || m != b)
    Console.Write("Невозможно найти произведение двух матриц.");
else
{
    int[,] firstArray = new int[m, n];
    int[,] secondArray = new int[a, b];

    FillArray(firstArray);
    FillArray(secondArray);
    PrintArray(firstArray);
    Console.WriteLine();
    PrintArray(secondArray);
    Console.WriteLine();

    if (m > a)
        PrintArray(MatrixMult(firstArray, secondArray));
    else
        PrintArray(MatrixMult(secondArray,firstArray));
}

int[,] MatrixMult(int[,] matrixArrayOne, int[,] matrixArrayTwo)
{
    int[,] thirdArray = new int[matrixArrayTwo.GetLength(1), matrixArrayOne.GetLength(0)];

    for (int i = 0; i < matrixArrayTwo.GetLength(1); i++)
    {
        for (int j = 0; j < matrixArrayOne.GetLength(0); j++)
        {
            int sum = 0;
            for (int k = 0; k < matrixArrayOne.GetLength(1); k++)
            {
                sum = sum + matrixArrayOne[i, k] * matrixArrayTwo[k, j];
                thirdArray[i, j] = sum;
            }
        }
    }
    return thirdArray;
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