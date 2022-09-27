// Цикл принимает на вход два числа (А и В) и возводит А в натуральную степерь В.
// 3, 5 -> 243 (3^5)
// 2, 4 -> 16 (2^4)

//double a = InputNumber();
//int b = Math.Abs(Convert.ToInt32(InputNumber()));

Console.Write("Введите число: ");
double a = Double.Parse(Console.ReadLine() ?? "0");
Console.Write("Введите число: ");
int b = Int32.Parse(Console.ReadLine() ?? "0");

Console.WriteLine(Power(a, b));

double Power(double x, int y)
{
    //double pow = Math.Pow(x, y);
    double pow = x;
    for(int i = 1; i < y; i++)
    {
        pow *= x;
    }
    return pow;
}

//double InputNumber()
// {
//     while (true)
//     {
//         try
//         {
//         Console.Write("Введите число: ");
//         double number = Double.Parse(Console.ReadLine() ?? "0");
//             return number;
//         }
//         catch
//         {
//             Console.WriteLine("Пожалуйста введите число.");
//         }
//         Console.WriteLine("");
//     }
// }