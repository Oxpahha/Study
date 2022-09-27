// Найдите произведение пар чисел в одномерном массиве. 
// Парой считаем первый и последний элемент, второй и предпоследний и т.д. 
// Результат запишите в новом массиве.
// [1 2 3 4 5] -> 5 8 3
// [6 7 3 6] -> 36 21

Console.WriteLine("Введите размер массива: ");
int arrayLength = int.Parse(Console.ReadLine() ?? "0");
int[] array = new int[arrayLength];

FillArray(array);
PrintArray(array);
PrintArray((Swapper(array, arrayLength)));

int[] Swapper(int[] array, int arrayLength)
{
    int lastIndex = arrayLength;
    int[] newArray = new int[(arrayLength / 2 + 1)];
    for (int i = 0; i < arrayLength / 2; i++)
        newArray[i] = array[i] * array[lastIndex - 1 - i];
    if (newArray.Length % 2 != 0)
        newArray[arrayLength / 2] = array[arrayLength / 2];
    else
        Array.Resize(ref newArray, newArray.Length - 1);
    return newArray;
}

void FillArray(int[] array)
{
    Random rand = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rand.Next(0, 20);
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