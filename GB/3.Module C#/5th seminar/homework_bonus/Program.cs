// Найти в массиве самую длинную последовательность, состоящую из одинаковых элементов.
//  Вывести на экран количество элементов самой длиной последовательности, 
//  элемент самой последовательности и номер элемента, который является ее началом.
// Данная задача не вилияет на оценку
// Пример:
// [1 2 2 4 4 4 4 3 3 3] ->
// Count: 4
// Element: 4
// Position: 3

Console.Clear();

int[] arrayOne = new int[(InputIntNumber())];

FillArray(arrayOne);
PrintArray(arrayOne);
Sorting(arrayOne);
PrintArray(arrayOne);
SameElementCounter(arrayOne);



void SameElementCounter(int[] array)
{
    int length = array.Length;

    int maxCount = 0;
    int element = 0;
    int position = -1;

    int[] counts = new int[array.Max() + 1];
    for (int i = 0; i < length; i++)
        if (counts[array[i]] == 0)
        {
            for (int j = 0; j < length; j++)
                if (array[i] == array[j])
                    counts[array[i]]++;
            if (counts[array[i]] > maxCount)
            {
                maxCount = counts[array[i]];
                element = array[i];
            }
        }

    for (int i = 0; i < length && position == -1; i++)
    {
        if (array[i] == element)
             position = i +1; 
    }

    Console.WriteLine($"Count: {maxCount}");
    Console.WriteLine($"Element: {element}");
    Console.WriteLine($"Position: {position}");
}

int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите размер массива: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        return number;
    }
}

void Sorting(int[] array)
{
    int arLength = array.Length;
    for (int j = 0; j < arLength; j++)
    {
        for (int i = 0; i < arLength - 1; i++)
        {
            if (array[i] > array[i + 1])
            {
                int temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
    }
}

void FillArray(int[] array)
{
    int length = array.Length;
    Random rand = new Random();
    for (int i = 0; i < length; i++)
    {
        array[i] = rand.Next(0, 10);
    }
}

void PrintArray(int[] array)
{
    int length = array.Length;
    Console.Write("[");
    for (int i = 0; i < length; i++)
    {
        Console.Write(array[i]);
        if (i == length - 1)
            Console.WriteLine("]");
        else
            Console.Write(", ");
    }
}