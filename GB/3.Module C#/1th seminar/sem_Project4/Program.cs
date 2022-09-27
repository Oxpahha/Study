Console.Clear();

Console.WriteLine("Введите число N: ");

string insert = Console.ReadLine();
int num = int.Parse(insert);
int altNum = -num;

 Console.WriteLine("Выводим целые числа в промежутке от " + altNum + " до " + num );

do 
{
    if(altNum == num)
    {
        Console.Write(altNum + " ");
    }
    else
    {
        Console.Write(altNum + ", ");
    }
    altNum++;
} while (num >= altNum);
