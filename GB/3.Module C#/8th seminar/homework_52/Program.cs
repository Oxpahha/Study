// Задайте двумерный массив из целых чисел. Найдите среднее арифметическое элементов в каждом столбце.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// Среднее арифметическое каждого столбца: 4,6; 5,6; 3,6; 3.

Console.WriteLine("Ведите размер массива через Enter: ");
int row = InputIntNumber();
int col = InputIntNumber();
int[,] array = new int[row, col];
double[] colunms = new double[col];

FillArray(array);
PrintArray(array);
FindAverageInArrayColumns(array, colunms);

void FindAverageInArrayColumns(int[,] matrixArray, double[] cols)
{
    Console.Write("Среднее арифметическое каждого столбца: ");
    for (int i = 0, k = 0; i < matrixArray.GetLength(1); i++)
    {
        double sum = 0;
        for (int j = 0; j < matrixArray.GetLength(0); j++)
        {
            sum += matrixArray[j, i];
        }
        cols[k] = sum / matrixArray.GetLength(0);   
        Console.Write($"{Math.Round(cols[k], 1)} ");
        k++;
    }
}

int InputIntNumber()
{
    int number = int.Parse(Console.ReadLine() ?? "0");
    return number;
}

void FillArray(int[,] matrixArray)
{
    Random rand = new Random();

    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            matrixArray[i, j] = rand.Next(1, 10);
        }
    }
}

// void PrintArray(int[,] matrixArray)
// {
//     for (int i = 0; i < matrixArray.GetLength(0); i++)
//     {
//         for (int j = 0; j < matrixArray.GetLength(1); j++)
//         {
//             Console.Write($"{matrixArray[i, j]} ");
//         }
//         Console.WriteLine();
//     }
// }

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

