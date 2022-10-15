int InputIntNumber(char ch = ' ')
{
    while (true)
    {
        Console.Write($"Ведите число {ch}: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 0)
            return number;
    }
}