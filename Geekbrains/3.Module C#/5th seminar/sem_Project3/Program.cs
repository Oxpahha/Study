//  Напишите метод, который объединяет 2 массива в 1. 
//  [5, 18, 123, 6, 2] + [1, 2, 3] = [5, 18, 123, 6, 2, 1, 2, 3]

Console.Clear();

int[] arrayOne = ParseToArray(InputStr());
int[] arrayTwo = ParseToArray(InputStr());

PrintArray(MergeArray(arrayOne, arrayTwo));

string InputStr()
{
    Console.Write("Введите числа массива через запятую: ");
    string input = Console.ReadLine() ?? "0";
    return input;
}

int[] ParseToArray(string str)
{
    //str = str.Trim();
    string[] stringArray = str.Split(",");
    int[] result = new int[stringArray.Length];
    int length = stringArray.Length;

    for (int i = 0; i < length; i++)
    {
        result[i] = int.Parse(stringArray[i]);
    }
    return result;
}

int[] MergeArray(int[] firstArray, int[] secondArray)
{
    int[] merge = new int[firstArray.Length + secondArray.Length];
    int length = merge.Length;
    int firleng = firstArray.Length;
    int secleng = secondArray.Length;

    for (int i = 0; i < length; i++)
    {
        for (int j = 0; j < firleng; j++, i++)
        {
            merge[i] = firstArray[j];
        }

        for (int k = 0; k < secleng; k++, i++)
        {
            merge[i] = secondArray[k];
        }
    }
    return merge;
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