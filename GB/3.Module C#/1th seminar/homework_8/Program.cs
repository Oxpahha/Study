//Напишите программу, которая на вход принимает число (N), 
//а на выходе показывает все чётные числа от 1 до N.
//5 -> 2, 4
//8 -> 2, 4, 6, 8

Console.Clear();

Console.WriteLine("Введите число N: ");

string insert = Console.ReadLine();
int num = int.Parse(insert);
int count = 2;

if (num < 1)
{
    Console.Write("Неверное число");
}
if (num == 1)
{
    Console.Write("Нет четных");
}

do
{
    if (count == num - 1)
    {
        if (count + 2 > num)
        {
            Console.Write(count + " ");
        }
    }
    else if (count < num)
    {
        Console.Write(count + ", ");
    }
    else if (count == num)
    {
        Console.Write(count + " ");
    }
    count = count + 2;
} while (count <= num);
