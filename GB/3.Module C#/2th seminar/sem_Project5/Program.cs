//Напишите пр-му которая принимает два числа и проверяет
// является ли одно квадратом другого.

int InputIntNumber()
{
    int count = 0;
    while (true)
    {
        if (count > 3)
            Console.WriteLine("Ты тупой? Целое число!");
        try
        {
            Console.Write("Ведите целое число: ");
            int number = int.Parse(Console.ReadLine() ?? "0");
            return number;
        }
        catch
        {
            Console.WriteLine("Ошибка, введите целое число!");
            count++;
        }
    }
}

Console.WriteLine("По очереди введите два целых числа, проверим является ли одно квадратом другого");
int a = InputIntNumber();
int b = InputIntNumber();

if (a == b * b)
    Console.WriteLine($"Число {a} является квадратом числа {b}");
if (b == a * a)
    Console.WriteLine($"Число {b} является квадратом числа {a}");
else
    Console.WriteLine($"Числа {a} и {b} не являются квадратом друг друга");



