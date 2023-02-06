// Двумерные массивы

// string[,] table = new string[2,5];

// String.Empty - инициализация строк
//           table[0,0] table[0,1] table[0,2] table[0,3] table[0,4]
//           table[1,0] table[1,1] table[1,2] table[1,3] table[1,4]

//                         первое число строки
// int[,] matrix = new int[5,8];   
//                             второе число столбцы


// string[,] table = new string[2,5];
// table[1,2] = "слово";

// for (int rows = 0; rows < 2; rows++)
// {
//     for (int columns = 0; columns < 5; columns++)
//     {
//         Console.WriteLine($"-{table[rows,columns]}-");
//     }
// }

int[,] matrix = new int[3, 4];
                                //   0 для строки
for (int i = 0; i < matrix.GetLength(0); i++) // for (int i = 0; i < 3; i++)
{                                   //   1 для столбца
    for (int j = 0; j < matrix.GetLength(1); j++) // for (int j = 0; j < 4; j++)
    {
        Console.Write($"{matrix[i, j]} ");
    }
    Console.WriteLine();
}

// 0 0 0 0 
// 0 0 0 0
// 0 0 0 0