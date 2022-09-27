// Напишите программу, которая принимает на вход цифру, обозначающую день 
// недели, и проверяет, является ли этот день выходным.


int InputIntNumber()
{
    while (true)
    {
        try
        {
            Console.Write("Введите день недели: ");
            int number = int.Parse(Console.ReadLine() ?? "0");
            return number;
        }
        catch
        {
            Console.WriteLine("Ошибка, введите целое число!");
        }
    }
}

Day:
int num = InputIntNumber();

if(num <= 7 && num >= 1)
{
    Console.Write("Введенный день недели ");
    if(num >= 6)
        Console.Write("выходной! Ура!");
    else
        Console.Write("трудовые будни! Грусть.");
}
else
{
   Console.WriteLine("В неделе всего 7 дней, дружок-пирожок, а ты что написал?"); 
   goto Day;    
}