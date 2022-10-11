// Задача 53: Задайте двумерный массив. Напишите программу, 
// которая поменяет местами первую и последнюю строку массива.
// сделал на столбец, мхех

Console.Write("Ведите кол-во строк: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Ведите кол-во колонн: ");
int n = int.Parse(Console.ReadLine() ?? "0");

int[,] array = new int[m, n];

FillArray(array);
PrintArray(array);
FirstToLastSwapper(array);
Console.WriteLine();
PrintArray(array);

void FirstToLastSwapper(int[,] matrixArray)
{
    int temp = 0;
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            if (j == 0)
            {
                temp = matrixArray[i,j];
            }
            if (j == matrixArray.GetLength(1)-1)
            {
                matrixArray[i,0] = matrixArray[i,j];
                matrixArray[i,j] = temp;
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