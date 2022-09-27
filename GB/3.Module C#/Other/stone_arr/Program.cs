Console.Clear();

//Console.Write("Введите число: ");
//int number = int.Parse(Console.ReadLine() ?? "0");

//int[] array = new int[9];
int[,] array = new int[5, 2];

for (int i = 0; i < array.Length; i += 1)
{
    for (int j = 0; j < array.GetLength(1); j += 1)
    {
        array[i,j] = i + j;
        Console.Write(array[i,j] + " ");
    }
    Console.WriteLine();
}