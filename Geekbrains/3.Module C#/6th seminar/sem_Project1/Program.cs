// Задаете число А. Выдает сумму чисел от 1 до А.
// рекурсия

Console.Clear();

int num = int.Parse(Console.ReadLine() ?? "1");

Console.WriteLine(RecSum(num));



int RecSum(int number)
{
    if (number > 1)
    {
        return number + RecSum(--number); // (number -1)
    }
    else
        return number;

}

// int RecSum(int number)
// {
//     if (number > 1)
//     {
//         number--;
//         int sum = RecSum(number);
//         return sum + number + 1;
//     }
//     else
//         return number;
// }