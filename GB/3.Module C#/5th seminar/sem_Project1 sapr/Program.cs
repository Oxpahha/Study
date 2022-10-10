int size = 12;
int[] numbers = new int[size];
FillArray(numbers);
PrintArray(numbers);
Console.WriteLine(GetPositiveSumm(numbers)); 
Console.WriteLine(GetNegativeSumm(numbers)); 

int GetPositiveSumm(int[] array)
{
    int sum = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] > 0)
        sum += array[i];
    }
    return sum;
}

int GetNegativeSumm(int[] array)
{
    int sum = 0;
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] < 0)
        sum += array[i];
    }
    return sum;
}

void FillArray(int[] array)
{
    Random random = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        array[i] = random.Next(-9,10);
    }
}

void PrintArray(int[] array)
{
    Console.WriteLine("Вывод массива: "); 
    Random random = new Random();
    for (int i = 0; i < array.Length; i++)
    {
        Console.Write(array[i]+ "  "); 
    }
    Console.WriteLine(); 
}