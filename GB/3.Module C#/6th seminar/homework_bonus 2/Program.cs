// Написать программу, которая принимает от пользователя положительные числа
//  и считает среднее значение этих чисел.
// Ввод числе осуществляется до тех пор, пока пользовател не введёт -1.
//  Ввод чисел и расчёт должен происходит в рекурсии
// 1 2 3 4 -1 -> 2,5

Console.Clear();

string list = "";

Console.Write($"Cреднее значение введенных чисел: {Sum(StringToIntArray(Filling(list)), 0, 0)}");

double Sum(int[] array, int i, double sum)
{
    if (i < array.Length)
    {
        i++;
        
        return sum = Sum(array, i, sum) + array[i-1] ;
    }
    return sum / array.Length;
}

string Filling(string number, string num = "")
{
    Console.Write("Введите число: ");
    num = Console.ReadLine() ?? "0";
    if (num == "-1")
    {
        return number.Trim(',');
    }
    else
    {
        number += num + ",";
        return Filling(number);
    }
}

int[] StringToIntArray(string str)
{
    string[] stArr = str.Split(',');
    int[] array = new int[stArr.Length];
    for (int i = 0; i < stArr.Length; i++)
    {
        array[i] = Convert.ToInt32(stArr[i]);
    }
    return array;
}

