// Напишите программу, которая принимает на вход число и выдаёт сумму цифр в числе.
// 452 -> 11
// 82 -> 10
// 9012 -> 12
// Ограничения:
// - Должна быть отдельная функция, которая возвразает результат суммы цифр
// - Внутри функций НЕЛЬЗЯ использовать класс Console. Только в основном блоке кода

Console.Write("Введите число: ");
string num = Console.ReadLine() ?? "0";
Console.WriteLine(Sum(num));

int Sum(string a)
{
    int leng = a.Length;
    int sum = 0;
    for (int i = 0; i < leng; i++)
    {
        int n = Convert.ToInt32(Char.GetNumericValue(a[i]));
        sum = sum + n;
    }
    return sum;
}
