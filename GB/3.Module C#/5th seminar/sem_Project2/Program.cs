// Напишите метод, который суммирует 2 массива. 
// Каждый элемент одного массива должен суммироваться с соответствующим элементом из второго массива. 
// Если длины массивов не равны, то должно появляться сообщение об ошибке
// [5, 18, 123, 6, 2] + [1, 2, 3, 6, 2] = [6, 20, 126, 12, 4]

Console.Clear();

int[] arrayOne = ParseToArray(InputStr());
int[] arrayTwo = ParseToArray(InputStr());

if (LengthCheck(arrayOne, arrayTwo))
    PrintArray(SumArray(arrayOne, arrayTwo));
else
    Console.Write("Длины массивов не равны.");

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

int[] SumArray(int[] firstArray, int[] secondArray)
{
    int length = firstArray.Length;
    int[] sum = new int[length];
    for (int i = 0; i < length; i++)
    {
        sum[i] = firstArray[i] + secondArray[i];
    }
    return sum;
}

bool LengthCheck(int[] firstArray, int[] secondArray)
{
    if (firstArray.Length == secondArray.Length)
        return true;
    else
        return false;
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