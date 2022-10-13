// Задача 59: Задайте двумерный массив из целых чисел. Напишите программу, 
// которая удалит строку и столбец, на пересечении которых расположен наименьший элемент массива.
// Например, задан массив:
// 1 4 7 2
// 5 9 2 3
// 8 4 2 4
// 5 2 6 7
// Наименьший элемент - 1, на выходе получим
// следующий массив:
// 9 4 2
// 2 2 6
// 3 4 7

Console.Write("Ведите кол-во строк: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];

FillArray(array);
PrintArray(array);
Console.WriteLine();
PrintArray(CutColRowWithLowestElem(array));


int[,] CutColRowWithLowestElem(int[,] matrixArray)
{
    int min = int.MaxValue;
    int minJ = int.MaxValue;
    int minI = int.MaxValue;

    int[,] newArray = new int[matrixArray.GetLength(0) - 1, matrixArray.GetLength(1) - 1];
    int[] array = new int[matrixArray.GetLength(0) - 1];

    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            if (matrixArray[i, j] < min)
            {
                min = matrixArray[i, j];
                minJ = j;
                minI = i;
            }
        }
    }

    int l = 0;
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        int k = 0;
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            if (j != minJ)
            { 
                array[k] = matrixArray[i, j];
                if(l < newArray.GetLength(0))
                newArray[l, k] = array[k];
                k++;
            }
        }
        l++;
        if (i == minI)
            l--;
    }
    return newArray;
}

void FillArray(int[,] matrixArray)
{
    Random rnd = new Random();
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            matrixArray[i, j] = rnd.Next(1, 100);
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