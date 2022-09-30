int arrayLength = int.Parse(Console.ReadLine() ?? "0");

int[] array = new int[arrayLength];

void FillArray(int[] array)
{
    Random rand = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rand.Next(0, 2);
    }
}

