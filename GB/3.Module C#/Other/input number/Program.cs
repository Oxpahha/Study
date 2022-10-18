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

        Console.WriteLine("Введите два числа через пробел: длина и ширина стола");
        string line = Console.ReadLine();
        string[] splitString = line.Split(' ');

        double length = Convert.ToDouble(splitString[0]); // длина
        double width = Convert.ToDouble(splitString[1]); // ширина