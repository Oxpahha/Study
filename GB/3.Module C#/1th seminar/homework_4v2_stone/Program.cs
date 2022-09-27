Console.Write("Введите a ");
int a = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Введите b ");
int b = int.Parse(Console.ReadLine() ?? "0");
Console.Write("Введите c ");
int c = int.Parse(Console.ReadLine() ?? "0");

int numberMax = int.MinValue;

numberMax = numberMax > a ? numberMax : a; // что можно прочесть как
//if (numberMax > a)
//    numberMax = numberMax;
//else
//    numberMax = a;

numberMax = numberMax > b ? numberMax : b;
numberMax = numberMax > c ? numberMax : c;

Console.WriteLine($"Максимальное число будет {numberMax}");
