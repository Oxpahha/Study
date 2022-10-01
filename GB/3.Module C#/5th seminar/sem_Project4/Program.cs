
Console.Clear();

int[] arrayOne = ParseToArray(InputStr());

PrintArray(Swapper(arrayOne));


int[] Swapper(int[] array)
{
    int length = array.Length;

    if (length % 2 == 0)
    {
        for (int i = 0; i < length && i < length/2 ; i++)
        {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
    else if (length % 2 != 0)
    {
        for (int i = 0; i < length && i < length/2 + 1; i++)
        {
            int temp = array[i];
            array[i] = array[length - 1 - i];
            array[length - 1 - i] = temp;
        }
    }
    return array;
}

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