// Напишите программу которая принимает на вход координаты Х и Y которые != 0,
// и выдает номер четверти плоскости в которой находится точка.

void Rnd()
{
Random random = new Random();
int x = random.Next(-10,10);
int y = random.Next(-10,10);
Coords(x,y);
}

void Coords(int x, int y)
{
if (x > 0 && y > 0)
    Console.WriteLine("1");
else if (x < 0 && y < 0)
    Console.WriteLine("3");
else if (x < 0 && y > 0)
    Console.WriteLine("2");
else if (x > 0 && y < 0)
    Console.WriteLine("4");
else 
    Console.WriteLine("0");
}


Rnd();