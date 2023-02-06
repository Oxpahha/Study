void Task22()
{
    Random random = new Random();
    int x = random.Next(1, 50);
    SqrTableUntilX(x);
}

void SqrTableUntilX(int x)
{
    int num = 1;
    while (num <= x)
    {
        Console.Write(Math.Pow(num, 2) + " ");
        num++;
    }
}

Task22();