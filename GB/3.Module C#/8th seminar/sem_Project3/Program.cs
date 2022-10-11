// Задача 57: Составить частотный словарь элементов двумерного массива.
// Частотный словарь содержит информацию о том, сколько раз встречается элемент входных данных.



Console.Write("Ведите кол-во строк: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];

FillArray(array);
PrintArray(array);
Console.WriteLine();
ElementCounter(array);


void ElementCounter(int[,] matrixArray)
{
    for (int k = 0; k < matrixArray.GetLength(0); k++)
    {
        for (int l = 0; l < matrixArray.GetLength(1); l++)
        {
            int temp = matrixArray[k, l];
            int count = 0;
            if (temp != 0)
            {
                for (int i = 0; i < matrixArray.GetLength(0); i++)
                {
                    for (int j = 0; j < matrixArray.GetLength(1); j++)
                    {
                        if (temp == matrixArray[i, j])
                        {
                            count++;
                            matrixArray[i, j] = 0;
                        }
                    }
                }
                Console.WriteLine($"В массиве {temp} встречается {count} раз");
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