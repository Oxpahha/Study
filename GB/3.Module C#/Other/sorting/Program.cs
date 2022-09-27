// сортировка
// 6 8 3 2 1 4 5 7
// 1 8 3 2 6 4 5 7
// 1 2 3 8 6 4 5 7
// итд

int[] arr = { 1, 5, 4, 3, 2, 6, 7, 1, 1 };

void PrintArray(int[] array)
{
    int count = array.Length;

    for (int i = 0; i < count; i++)
    {
        Console.Write($"{array[i]} ");
    }
    Console.WriteLine();
}

void SelectionSort(int[] array)
{
    for (int i = 0; i < array.Length -1; i++)
    {
        int maxPos = i;

        for (int j = i + 1; j < array.Length; j++)   // ищем эл-т 
        {
            if(array[j] > array[maxPos]) maxPos = j;
        }

        int temp = array[i];                         // свап
        array[i] = array[maxPos];
        array[maxPos] = temp;
    }
}


PrintArray(arr);
SelectionSort(arr);

PrintArray(arr);
