Console.Clear();
Console.WriteLine("День недели?: ");
string num = Console.ReadLine();
int day = int.Parse(num);
switch (day)
{
    case 1 :
        Console.WriteLine("Понедельник");
        break;
    case 2 :
        Console.WriteLine("Вторник");
        break;
    case 3 :
        Console.WriteLine("Среда");
        break;
    case 4 :
        Console.WriteLine("Четверг");
        break;
    case 5 :
        Console.WriteLine("Пятница");
        break;
    case 6 :
        Console.WriteLine("Суббота");
        break;
    case 7 :
        Console.WriteLine("Воскресенье");
        break;
    case <0 :
        Console.WriteLine("Хрень");
        break;
    case >7 :
        Console.WriteLine("Хрень");
    break;
}