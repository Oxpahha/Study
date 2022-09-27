Console.Clear();

Console.WriteLine("Введите трехзначное число: ");

string insert = Console.ReadLine();
int num = int.Parse(insert);
//int num = Math.Abs(int.Parse(insert));

if(num > 99 & num < 1000)
{
    Console.WriteLine("Думаю последняя цифра в числе " + num + " -> " + num%10 );
} 
else
{    
    Console.Write("Неверное число"); 
}