//  Задайте массив. Напишите программу, которая определяет, присутствует ли заданное число в массиве.
// 4; массив [6, 7, 19, 345, -3] -> нет
// -3; массив [6, 7, 19, 345, -3] -> да

int num = InputIntNumber();
int[] array = StaticArray();

PrintArray(array);

//NumFinder(num, array);
if (NumFinder(num, array))
    Console.WriteLine("да");
else
    Console.WriteLine("нет");

int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите число: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        return number;
    }
}

int[] StaticArray()
{
    int[] array = { 6, 7, 19, 345, -3 };
    return array;
}

// void NumFinder(int num, int[] array)
// {
//     for (int i = 0; i < array.Length; i++)
//     {
//         if (array[i] == num)
//         {
//              Console.WriteLine("да");
//              break;
//         }
//         else if (i == array.Length-1)
//         {
//             Console.WriteLine("нет");
//         }
//     }
// }

bool NumFinder(int num, int[] array)
{
    for (int i = 0; i < array.Length; i++)
    {
        if (array[i] == num)
             return true; 
    }
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
