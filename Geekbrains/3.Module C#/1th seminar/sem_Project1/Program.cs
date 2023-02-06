Console.Clear();
Console.WriteLine("Первое число является квадратом второго? Введи два числа: ");

string[] arr= Console.ReadLine().Split();
 
int num1 = int.Parse(arr[0]);
int num2 = int.Parse(arr[1]);

if (num1 == num2 * num2)
{
    Console.WriteLine("Да");
}
else
{
    Console.WriteLine("Нет");
}
