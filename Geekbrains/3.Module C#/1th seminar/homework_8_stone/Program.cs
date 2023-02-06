Console.Clear();

Console.Write("Введите число: ");
int number = int.Parse(Console.ReadLine() ?? "0");
//int num = 2;                         Вариант решения 1

//while( num <= number)
//{
//    if(num%2 == 0)
//        Console.Write(num + " ");
//    num +=2;
//}

//for(int i=2; i <= number; i += 2)
//    Console.Write(i+ " ");

// int num = 2;                         Вариант решения 2
// string result = "";

// while( num <= number)
// {
//     if (num <= number-2)
//         result += num + ", ";
//     else result += num;
//     num += 2;
// }

// Console.Write(result);

int num = 2;
string result = "";

while( num <= number)
{
    if (num <= number-2)
        Console.Write(num + ", ");
    else Console.Write(num + " ");
    num += 2;
}
