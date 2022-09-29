int InputIntNumber(int x)
{
    while (true)
    {
        Console.Write("Ведите пятизначное число: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 9999 && number < 100000)
            return number;
    }
}

