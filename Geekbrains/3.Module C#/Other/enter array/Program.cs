string input = Console.ReadLine() ?? "0"; 
int[] array = ParseToArray(input);

int[] ParseToArray(string str)
{
    string[] stringArray = str.Split(",");
    int[] result = new int[stringArray.Length];
    int length = stringArray.Length;

    for (int i = 0; i < length; i++)
    {
        result[i] = int.Parse(stringArray[i]);
    }
    return result;
}