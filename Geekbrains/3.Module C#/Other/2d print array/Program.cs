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