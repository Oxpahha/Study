// Напишите программу замена элементов массива: положительные элементы 
// замените на соответствующие отрицательные, и наоборот.
// [-4, -8, 8, 2] -> [4, 8, -8, -2]

int[] array = StaticArray();

PrintArray(array);
MirrorArray(array);
PrintArray(array);

int[] StaticArray()
{
    int[] array = { -4, -8, 8, 2 };
    return array;
}

void MirrorArray(int[] array)
{
    for (int i = 0; i < array.Length - 1; i++)
    {
        array[i] = -array[i];
    }
}

void PrintArray(int[] array)
{
    int count = array.Length;
    Console.Write("[");
    for (int i = 0; i < count; i++)
    {
        Console.Write(array[i]);
        if (i == count - 1)
            Console.WriteLine("]");
        else
            Console.Write(", ");
    }
}
