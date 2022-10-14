int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите число N больше двух: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        while (number > 2)
            return number;
    }
}