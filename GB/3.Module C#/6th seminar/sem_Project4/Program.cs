// Напишите программу, которая принимает на вход 2 числа, количество строк
// и количество столбцо, создаёт матрицу данного размера и заполняет 
// нулями или единицами в случайном порядке и выводит в консоль.

int[,] array = new int[InputIntNumber(),InputIntNumber()];
FillArray(array);
PrintArray(array);

int InputIntNumber()
{
    while (true)
    {
        Console.Write("Ведите число: ");
        int number = int.Parse(Console.ReadLine() ?? "0");
        return number;
    }
}

void FillArray(int[,] matrixArray)
{
    int rows = matrixArray.GetLength(0);
    int columns = matrixArray.GetLength(1);
    Random rnd = new Random();

    for (int i = 0; i < rows; i++)
    {
        for (int j = 0; j < columns; j++)
        {
            matrixArray[i, j] = rnd.Next(0, 2);
        }
    }
}

void PrintArray(int[,] matrixArray)
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