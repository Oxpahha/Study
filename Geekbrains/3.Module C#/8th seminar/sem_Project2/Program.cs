// Задача 55: Задайте двумерный массив. Напишите программу, 
// которая заменяет строки на столбцы. В случае, если это невозможно,
// программа должна вывести сообщение для пользователя.

Console.Write("Ведите кол-во строк: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];

FillArray(array);
PrintArray(array);

if (n == m)
{
    RowsToColunmSwapper(array);
    Console.WriteLine();
    PrintArray(array);
}
else
    Console.WriteLine("Невозможно заменить.");

void RowsToColunmSwapper(int[,] matrixArray)
{
    for (int i = 0; i < matrixArray.GetLength(0) -1 ; i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            if (i < j)
            {
                int temp = matrixArray[i, j];
                matrixArray[i, j] = matrixArray[j, i];
                matrixArray[j, i] = temp;
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