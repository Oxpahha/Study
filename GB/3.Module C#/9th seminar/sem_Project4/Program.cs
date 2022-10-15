//   Заданы 2 массива: info и data. В массиве info хранятся двоичные представления
//   нескольких чисел (без разделителя). В массиве data хранится информация о 
//   количестве бит, которые занимают числа из массива info. Напишите программу, 
//   которая составит массив десятичных представлений чисел массива data с учётом 
//   информации из массива info.
//   входные данные: data = {0, 1, 1, 1, 1, 0, 0, 0, 1 }
//   info = {2, 3, 3, 1 }
//   выходные данные: 1, 7, 0, 1

int[] data = new int[] { 0, 1, 1, 1, 1, 0, 0, 0, 1 };
int[] info = new int[] { 2, 3, 3, 1 };

PrintArray(ConvertDataToDecArray(data, info));
// PrintArray(Function1(data, info));
System.Console.WriteLine();

int[] ConvertDataToDecArray(int[] dataArray, int[] infoArray)
{
    int count = 0;
    int[] result = new int[infoArray.Length];
    for (int i = 0; i < infoArray.Length; i++)
    {
        int[] bin = new int[infoArray[i]];
        for (int j = 0; j < infoArray[i]; j++)
        {
            bin[j] = dataArray[count];
            count++;
        }
        result[i] = BinToDec(bin);
    }
    return result;
}


int BinToDec(int[] array)
{
    Array.Reverse(array);
    int result = 0;
    for (int i = 0; i < array.Length; i++)
    {
        result = array[i] * Convert.ToInt32(Math.Pow(2, i)) + result;
    }
    return result;
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