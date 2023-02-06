// Напишите программу, которая выводит третью цифру заданного числа или сообщает, что третьей цифры нет.
Console.Clear();
int InputIntNumber()
{
    while (true)
    {
        try
        {
            Console.Write("Ведите целое число: ");
            int number = int.Parse(Console.ReadLine() ?? "0");
            return number;
        }
        catch
        {
            Console.WriteLine("Ошибка, введите целое число!");
        }
    }
}

int num = InputIntNumber();
int length = num.ToString().Length;
while (length > 3)
{
    num = num / 10;
    length --;
}

int frsNum = num / 100;
int secNum = num / 10 % 10;
int thrNum = num % 10;

if (frsNum == 0)
{
    if (secNum == 0)
        Console.WriteLine("Второй и третьей цифры нет");
    else
        Console.WriteLine("Третьей цифры нет");
}
else
    Console.WriteLine("Третья цифра заданного числа: " + thrNum);


