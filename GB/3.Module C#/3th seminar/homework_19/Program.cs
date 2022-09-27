// Напишите программу, которая принимает на вход пятизначное число  
// и проверяет, является ли оно палиндромом.

int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите пятизначное число: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 9999 && number < 100000)
            return number;
    }
}

int num = InputIntNumber();

void Poli()
{
    string chars = num.ToString();
    if (chars[0] == chars[4] && chars[1] == chars[3])
    {
        Console.Write("Число является палиндромом");
    }
    else
    {
        Console.Write("Число не является палиндромом");
    }
}

Poli();


