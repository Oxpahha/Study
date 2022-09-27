//Напишите пр-му которая принимает число и проверяет
// кратно ли оно одновременно 7 и 23.

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

Console.WriteLine("Введите целое число, проверим кратно ли оно одновременно 7 и 23");
int a = InputIntNumber();
if(( a % 7 == 0) && ( a % 23 == 0))
    Console.WriteLine("Число кратно 7 и 23");
else
    Console.WriteLine("Число не кратно 7 и 23");
// int sub1 = a % 7 == 0 ? 1 : 0;
// int sub2 = a % 23 == 0 ? 1 : 0;
// string result = sub1 + sub2 == 2 ? "Да" : "Нет";

// Console.WriteLine(result);

