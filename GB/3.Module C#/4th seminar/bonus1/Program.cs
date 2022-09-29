
double number = InputIntNumber();
Console.WriteLine(ToBin(number));
Poli(ToBin(number));


double InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите натуральное десятичное число число: ");
        double number = double.Parse(Console.ReadLine() ?? "0");
        while (number > 0)
            return number;
    }
}

string ToBin(double num)
{
    string str = "";
    while (num > 0)
    {
        str = String.Concat(Convert.ToString(num % 2), str);
        num = Math.Truncate(num / 2);
    }
    return str;
}

void Poli(string str)
{
    int length = str.Length;
    int count = 0;
    for (int i = 0; i < length && count != 0; i++)
    {
        if (str[i] != str[length -1 - i])
            count++;
    }
    if (count > 0)
            Console.Write("Число не является палиндромом");
        else
            Console.Write("Число является палиндромом");
}