

void Piff()
{
Random random = new Random();
double fstX =  random.Next(1,50);
double fstY =  random.Next(1,50);
double secX =  random.Next(1,50);
double secY =  random.Next(1,50);
CoordRange(fstX, fstY, secX, secY);
}

void CoordRange(double fstX, double fstY, double secX, double secY)
{
double range = Math.Sqrt(Math.Pow(fstX - secX, 2) + Math.Pow(fstY - secY, 2));
Console.WriteLine("расстояние между двумя точками " +(Math.Round(range, 2)));
}

Piff();