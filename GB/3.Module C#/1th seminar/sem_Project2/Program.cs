static string WeekDay(int day)
{
    if (day == 1)
    {
        return ("Понедельник ");
    }
    else
    {
        if (day == 2)
        {
            return ("Вторник ");
        }
        else
        {
            if (day == 3)
            {
                return ("Среда ");
            }
            else
            {
                if (day == 4)
                {
                    return ("Четверг ");
                }
                else
                {
                    if (day == 5)
                    {
                        return ("Пятница ");
                    }
                    else
                    {
                        if (day == 6)
                        {
                            return ("Суббота ");
                        }
                        else
                        {
                            if (day == 7)
                            {
                                return ("Воскресенье ");
                            }
                            else
                            {
                                return ("Хрень ");
                            }
                        }
                    }
                }
            }
        }
    }
}


Console.WriteLine("Проверим все ли дни недели на месте: ");

string[] arr = Console.ReadLine().Split();

int num0 = int.Parse(arr[0]);
int num1 = int.Parse(arr[1]);
int num2 = int.Parse(arr[2]);
int num3 = int.Parse(arr[3]);
int num4 = int.Parse(arr[4]);
int num5 = int.Parse(arr[5]);
int num6 = int.Parse(arr[6]);

Console.WriteLine("Ну и что ты ввел?");
Console.Write(WeekDay(num0) + WeekDay(num1) + WeekDay(num2) + WeekDay(num3) + WeekDay(num4) + WeekDay(num5) + WeekDay(num6));
