Console.Clear();

Console.WriteLine("Введите размер массива: ");
int arrayLength = int.Parse(Console.ReadLine() ?? "0");
int[] array = new int[arrayLength];

FillArray(array);
PrintArray(array);

void FillArray(int[] array)
{
    Random rand = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rand.Next(0, 2);
    }
}

void PrintArray(int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write($"{array[i]} ");
    }

}