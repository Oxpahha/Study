Console.WriteLine("Ведите m: ");
int m = int.Parse(Console.ReadLine() ?? "0");
Console.WriteLine("Ведите n: ");
int n = int.Parse(Console.ReadLine() ?? "0");
Console.WriteLine("Ведите z: ");
int z = int.Parse(Console.ReadLine() ?? "0");

int[,,] array = new int[m, n, z];
FillArray(array);
PrintArray(array);

void PrintArray(int[,,] matrixArray)
{
    for (int i = 0; i < matrixArray.GetLength(0); i++)
    {
        for (int j = 0; j < matrixArray.GetLength(1); j++)
        {
            for (int k = 0; k < matrixArray.GetLength(2); k++)
            {
                Console.Write($"{matrixArray[i, j, k]} ");
            }
            Console.WriteLine();        
        }
        Console.WriteLine();
    }
}

void FillArray(int[,,] matrixArray)
{
    int rows = matrixArray.GetLength(0);
    int columns = matrixArray.GetLength(1);
    int depth = matrixArray.GetLength(2);
    Random rnd = new Random();

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            for (int k = 0; k < depth; k++)
            {
                matrixArray[i, j, k] = rnd.Next(0, 2);
            }
        }
    }
}