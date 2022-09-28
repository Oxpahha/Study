//  Напишите программу, которая задаёт массив из 8 элементов и выводит их на экран.
// 1, 2, 5, 7, 19 -> [1, 2, 5, 7, 19]
// 6, 1, 33       -> [6, 1, 33]
// Ограничения:
// - Должна быть отдельная функция, которая создаёт массив и отдельная функция вывода
// - Внутри функций (кроме функции вывода) НЕЛЬЗЯ использовать класс Console. 
//   Только в основном блоке кода или в функции вывода

// Console.WriteLine("Введите размер массива: ");
// int arrayLength = int.Parse(Console.ReadLine() ?? "0");
int arrayLength = 8;
int[] array = new int[arrayLength];

FillArray(array);
PrintArray(array);
Sorting(array);
PrintArray(array);

void Sorting(int[] array)
{
    int arLength = array.Length;
    int temp = 0;
    for (int j = 0; j < arLength; j++)
    {
        for (int i = 0; i < arLength - 1; i++)
        {
            if (Math.Abs(array[i]) > Math.Abs(array[i + 1]))
            {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}


void FillArray(int[] array)
{
    Random rand = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = rand.Next(int.MinValue, int.MaxValue);
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