//  Напишите программу, которая найдёт точку пересечения двух прямых,
//   заданных уравнениями 
//   y = k1 * x + b1,
//    y = k2 * x + b2;
// значения b1, k1, b2 и k2 задаются пользователем.

// b1 = 2, k1 = 5, b2 = 4, k2 = 9 -> (-0,5; -0,5)

double[,] array = new Double[2, 2];
FillArray(array);
PrintArray(array);
CrossPoint(array);


void PrintArray(double[,] matrixArray)
{
    int rows = matrixArray.GetLength(0);
    int columns = matrixArray.GetLength(1);
    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"{matrixArray[i, j]} ");
        }
        Console.WriteLine();
    }
}

void FillArray(double[,] matrixArray)
{
    int rows = matrixArray.GetLength(0);
    int columns = matrixArray.GetLength(1);

    for (int i = 0; i < rows; i++)
    {
        Console.WriteLine($"Числа из ряда {i+1}.");
        for (int j = 0; j < columns; j++)
        {
            Console.Write($"Столбец {j+1}: ");
            matrixArray[i, j] = int.Parse(Console.ReadLine() ?? "0");
        }
    }
}

void CrossPoint(double[,] matrixArray)
{
    //        b1               b2
    // matrixArray[0,0] matrixArray[0,1] 
    // matrixArray[1,0] matrixArray[1,1] 
    //        k1               k2

    double x = (matrixArray[0, 1] - matrixArray[0, 0]) / (matrixArray[1, 0] - matrixArray[1, 1]);
    double yOne = Math.Round(matrixArray[1, 0] * x + matrixArray[0, 0], 2);
    double yTwo = Math.Round(matrixArray[1, 1] * x + matrixArray[0, 1], 2);

    // double x = (b2 - b1) / (k1 - k2);
    //     double yOne = k1 * x + b1;
    //     double yTwo = k2 * x + b2;

    Console.WriteLine($"Точка пересечения двух прямых: ({yOne}; {yTwo})");

}



// Console.WriteLine("Ведите b1: ");
// double b1 = int.Parse(Console.ReadLine() ?? "0");
// Console.WriteLine("Ведите k1: ");
// double k1 = int.Parse(Console.ReadLine() ?? "0");
// Console.WriteLine("Ведите b2: ");
// double b2 = int.Parse(Console.ReadLine() ?? "0");
// Console.WriteLine("Ведите k2: ");
// double k2 = int.Parse(Console.ReadLine() ?? "0");

// double x = (b2 - b1) / (k1 - k2);
// double yOne = k1 * x + b1;
// double yTwo = k2 * x + b2;

// Console.WriteLine($"Точка пересечения двух прямых: ({yOne}; {yTwo})");