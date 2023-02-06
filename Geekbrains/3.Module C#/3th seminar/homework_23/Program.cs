//Напишите программу, которая принимает на вход число (N) и выдаёт таблицу кубов чисел от 1 до N.

void Task23()
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
        Console.Write(Math.Pow(num, 3) + " ");
        num++;
    }
}

Task23();