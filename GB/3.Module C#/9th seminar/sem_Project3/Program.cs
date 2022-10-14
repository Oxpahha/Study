// Задан массив, в котором хранится двоичное представление числа.
// Нужно вывести его десятичное представление {0,1,1,1,1} -> 15


int[] binNum = { 0, 1, 1, 1, 1 };
PrintArray(binNum);

Array.Reverse(binNum);
PrintArray(binNum);
BinToInt(binNum);

void BinToInt(int[] BinArray)
{
    double result = 0;

    for (int i = 0; i < BinArray.Length; i++)
    {
        result += Math.Pow(2, i) * BinArray[i];
    }
    Console.WriteLine(result);
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