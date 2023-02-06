//Напишите пр-му которая принимает 2 числа и выводит является ли второе кратным первому.

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

Console.WriteLine("По очереди введите два целых числа.");
int a = InputIntNumber();
int b = InputIntNumber();
string kratn = b % a == 0 ? "Второе число кратно первому" : "Второе число не кратно первому";

Console.WriteLine(kratn);

