// Программу которая по заданому номеру четверти,
// показывает диапозон возможных координат точек этой четверти (x, y)

void Coords()
{
Random random = new Random();
int x = random.Next(1,4);
Range(x);
}

void Range(int x)
{
if (x == 1)
    Console.WriteLine("x > 0, y > 0");
else if (x == 2)
    Console.WriteLine("x < 0, y > 0");
else if (x == 3)
    Console.WriteLine("x < 0, y < 0");
else if (x == 4)
    Console.WriteLine("x > 0, y < 0");
}


Coords();