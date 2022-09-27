//  Напишите программу, которая принимает на вход координаты двух
//  точек и находит расстояние между ними в 3D пространстве.

void Piff()
{
    Random random = new Random();
    double aX =  random.Next(1,50);
    double aY =  random.Next(1,50);
    double aZ =  random.Next(1,50);
    double bX =  random.Next(1,50);
    double bY =  random.Next(1,50);
    double bZ =  random.Next(1,50);


    // double aX =  3;
    // double aY =  6;
    // double aZ =  8;
    // double bX =  2;
    // double bY =  1;
    // double bZ = -7;

    // 15.84

    CoordRange(aX, aY, bX, bY, aZ, bZ);
}

void CoordRange(double aX, double aY, double bX, double bY, double aZ, double bZ)
{
    double range = Math.Sqrt(Math.Pow(aX - bX, 2) + Math.Pow(aY - bY, 2) + Math.Pow(aZ - bZ, 2));
    Console.WriteLine("расстояние между двумя точками " + (Math.Round(range, 2)));
}

Piff();