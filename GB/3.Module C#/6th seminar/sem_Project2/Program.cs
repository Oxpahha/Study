// Напишите программу, которая принимает на вход число и выдаёт количество цифр в числе.
// Использовать рекурсию
// 456 -> 3
// 78 -> 2
// 89126 -> 5

// Console.WriteLine(NumCounter(InputIntNumber(), 0));

// int NumCounter(int num, int count)
// {
//     if (num / 10 == 0)
//     {
//        return count+1;
//     }
//     else 
//     {
//         return count + NumCounter(num / 10, count)+1;
//     }
// }

// int InputIntNumber()
// {
//     while (true)
//     {
//         Console.Write("Ведите число: ");
//         int number = int.Parse(Console.ReadLine() ?? "0");
//         return number;
//     }
// }

Console.Clear();
int number = int.Parse(Console.ReadLine());

Console.WriteLine(CountNumber(number));

int CountNumber(int num)
{
if (num / 10 < 1) return 1;

else return 1 + CountNumber(num/10);
}