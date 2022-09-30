Console.Clear();
Console.Write("Введите целые числа через запятую: ");

string input = Console.ReadLine() ?? "0"; //
int[] array = ParseToArray(input);

Console.WriteLine($"Positive Summ: {PosSum(array)}");
Console.WriteLine($"Negative Summ: {NegSum(array)}");



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

int PosSum(int[] array)
{
    int count = 0;
    int length = array.Length;
    for (int i = 0; i < length; i++)
    {
        if (array[i] > 0)
            count += array[i];
    }
    return count;
}

int NegSum(int[] array)
{
    int count = 0;
    int length = array.Length;
    for (int i = 0; i < length; i++)
    {
        if (array[i] < 0)
            count += array[i];
    }
    return count;
}