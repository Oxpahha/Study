
TheGame();



void TheGame(int levelCount = 1)
{
  int origRow = 0;
  int origCol = 0;
  int[,] labirint = Initialise(10 + levelCount, 20 + levelCount);
  string player = "@";
  int rowsLab = labirint.GetLength(0);    // количество строк
  int columnsLab = labirint.GetLength(1); //количество столбцов
  Console.Clear();
  do
  {
    CreateLabLabel(labirint, 1, 1);
  } while (!FindWay(labirint));


  PrintLab(labirint);
  Console.SetCursorPosition(labirint.GetLength(1) + 1, labirint.GetLength(0) / 2);
  System.Console.WriteLine($"Вы играете в лабиринт. Ваш уровень {levelCount}");
  Console.SetCursorPosition(labirint.GetLength(1) + 1, labirint.GetLength(0) / 2 + 1);
  System.Console.WriteLine("Чтобы выйти из игры, нажмите Esc.");
  Console.CursorVisible = false;
  ShowCursor(1, 1);

  int left = Console.CursorLeft;
  int top = Console.CursorTop;
  ConsoleKeyInfo cki;

  do
  {
    cki = Console.ReadKey();

    int curretnTop = top;
    int curretnLeft = left;

    if (cki.Key == ConsoleKey.UpArrow)
    {
      curretnTop--;
      if (CanMove(left, curretnTop, labirint)) top--;
    }
    else if (cki.Key == ConsoleKey.DownArrow)
    {
      curretnTop++;
      if (CanMove(left, curretnTop, labirint)) top++;
    }
    else if (cki.Key == ConsoleKey.LeftArrow)
    {
      curretnLeft--;
      if (CanMove(curretnLeft, top, labirint)) left--;
    }
    else if (cki.Key == ConsoleKey.RightArrow)
    {
      curretnLeft++;
      if (CanMove(curretnLeft, top, labirint)) left++;
    }

    Console.Clear();
    PrintLab(labirint);
    Console.SetCursorPosition(labirint.GetLength(1) + 1, labirint.GetLength(0) / 2);
    System.Console.WriteLine($"Вы играете в лабиринт. Ваш уровень {levelCount}");
    Console.SetCursorPosition(labirint.GetLength(1) + 1, labirint.GetLength(0) / 2 + 1);
    System.Console.WriteLine("Чтобы выйти из игры, нажмите Esc.");
    Tuple<int, int> coursor = ShowCursor(left, top);
    left = coursor.Item1;
    top = coursor.Item2;

    //нашел выход
    if (labirint[top, left] == 4)
    {
      Console.SetCursorPosition(labirint.GetLength(1) + 1, labirint.GetLength(0) / 2);
      System.Console.WriteLine("   Поздравляю, Вы вышли из лабиринта!  ");
      Console.SetCursorPosition(labirint.GetLength(1) + 1, labirint.GetLength(0) / 2 + 1);
      System.Console.WriteLine("Чтобы перейти на новый уровень  - нажмите Enter.");
    }

  } while (cki.Key != ConsoleKey.Escape & !(labirint[top, left] == 4 & cki.Key == ConsoleKey.Enter));

  if (labirint[top, left] == 4 && cki.Key == ConsoleKey.Enter) TheGame(++levelCount);

  WriteAt("All done!", 0, rowsLab + 1);
  Console.WriteLine();

  void WriteAt(string s, int x, int y)
  {
    try
    {
      Console.SetCursorPosition(origCol + x, origRow + y);
      Console.Write(s);
    }
    catch (ArgumentOutOfRangeException e)
    {
      Console.Clear();
      Console.WriteLine(e.Message);
    }
  }

  bool CanMove(int left, int top, int[,] array)
  {
    if (!IsOutOfBounds(top, left, labirint))
    {
      if (array[top, left] != 3) return true;
    }
    return false;
  }

  Tuple<int, int> ShowCursor(int left, int top)
  {
    //перемещение курсора по кругу
    if (left < origCol + 1)
    {
      left = origCol + columnsLab;
    }
    if (top < origRow + 1)
    {
      top = origRow + rowsLab;
    }
    if (left > origCol + columnsLab)
    {
      left = origCol + 1;
    }
    if (top > origRow + rowsLab + 1)
    {
      top = origRow + 1;
    }

    Console.SetCursorPosition(left, top);
    Console.Write(player);


    return Tuple.Create(left, top);
  }

  void PrintMassive2(int[,] array)
  {
    Console.Write("[");
    int rows = array.GetUpperBound(0) + 1;    // количество строк
    int columns = array.Length / rows;        // количество столбцов
                                              // или так
                                              // int columns = numbers.GetUpperBound(1) + 1;

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
      {
        Console.Write($"{array[i, j]} ");
      }
      Console.WriteLine();
    }
    Console.Write("]");
  }

  int[,] Initialise(int rows, int columns)
  {

    var cells = new int[rows, columns];

    for (int i = 0; i < rows; i++)
    {
      cells[i, 0] = 3;
      cells[i, columns - 1] = 3;

    }
    for (int i = 0; i < columns; i++)
    {
      cells[0, i] = 3;
      cells[rows - 1, i] = 3;

    }


    for (int i = 1; i < rows - 1; i++)
    {
      for (int j = 1; j < columns - 1; j++)
      {
        cells[i, j] = 0;
      }
    }
    return cells;
  }

  bool IsOutOfBounds(int x, int y, int[,] grid)
  {
    if (x < 0 || x > grid.GetLength(0) - 1)
      return true;

    if (y < 0 || y > grid.GetLength(1) - 1)
      return true;

    return false;
  }

  void PrintLab(int[,] level)
  {
    int rows = level.GetLength(0);
    int columns = level.GetLength(1);

    for (int i = 0; i < rows; i++)
    {
      for (int j = 0; j < columns; j++)
      {
        if (level[i, j] == 2) System.Console.Write(" ");
        else if (level[i, j] == 4) System.Console.Write("A");
        else if (level[i, j] == 3) System.Console.Write("#");
        else if (level[i, j] == 0) System.Console.Write(" ");
      }
      System.Console.WriteLine();
    }
    System.Console.WriteLine();
  }

  void CreateLabLabel(int[,] level, int currentX, int currentY)
  {
    List<string> list = (new string[] { "top", "left", "right", "bottom" }).ToList();
    string direction = list[new Random().Next(list.Count)];
    int nextX = 0;
    int nextY = 0;

    foreach (var item in list)
    {
      if (level[currentX, currentY] != 0) continue;
      level[currentX, currentY] = 2;

      switch (direction)
      {
        case "top":
          nextX = currentX - 1;
          nextY = currentY;
          break;
        case "left":
          nextX = currentX;
          nextY = currentY - 1;
          break;
        case "right":
          nextX = currentX;
          nextY = currentY + 1;
          break;
        case "bottom":
          nextX = currentX + 1;
          nextY = currentY;
          break;
      }

      if (IsOutOfBounds(nextX, nextY, level)) continue;

      if (level[nextX, nextY] != 0) continue;

      else { level[nextX, nextY] = 3; continue; }
    }
    direction = list[new Random().Next(list.Count)];

    foreach (var item in list)
    {

      switch (item)
      {
        case "top":
          nextX = currentX - 1;
          nextY = currentY;
          break;
        case "left":
          nextX = currentX;
          nextY = currentY - 1;
          break;
        case "right":
          nextX = currentX;
          nextY = currentY + 1;
          break;
        case "bottom":
          nextX = currentX + 1;
          nextY = currentY;
          break;
      }

      if (IsOutOfBounds(nextX, nextY, level)) continue;

      if (level[nextX, nextY] != 0) continue;

      CreateLabLabel(level, nextX, nextY);

    }

  }




  bool FindWay(int[,] array, int row = 0, int column = 0)
  {

    int[,] arrayCopy = new int[array.GetLength(0), array.GetLength(1)];

    for (int i = 0; i < array.GetLength(0); i++)
    {
      for (int j = 0; j < array.GetLength(1); j++)
      {
        arrayCopy[i, j] = array[i, j];
      }
    }

    (row, column) = FindIndex(arrayCopy);

    if (row != 0)
    {
      array[row, column] = 4;
      return true;
    }
    else return false;

    (int, int) FindIndex(int[,] arrayCopy, int row = 1, int column = 1)
    {


      // System.Console.WriteLine(arrayCopy[row, column] + "!!!!");
      // System.Console.WriteLine($"row column {row} {column}");

      if (row >= arrayCopy.GetLength(0) - 6 && column == arrayCopy.GetLength(1) - 1)
      {
        arrayCopy[row, column] = 6;
        return (row, column);
      }
      if (row == arrayCopy.GetLength(0) - 1 && column >= arrayCopy.GetLength(1) - 6)
      {
        arrayCopy[row, column] = 6;
        return (row, column);
      }

      if (row > arrayCopy.GetLength(0) - 1 || column > arrayCopy.GetLength(1) - 1) return (0, 0);

      if (arrayCopy[row, column] == 4) return (0, 0);
      if (arrayCopy[row, column] == 3) return (0, 0);

      if (arrayCopy[row, column] == 2)
      {
        // System.Console.WriteLine(arrayCopy[row, column] + " =======");
        arrayCopy[row, column] = 4;
        FindIndex(arrayCopy, ++row, column);
        FindIndex(arrayCopy, row, ++column);
        FindIndex(arrayCopy, --row, column);
        FindIndex(arrayCopy, row, --column);

      }

      for (int i = 0; i < arrayCopy.GetLength(0); i++)
      {
        for (int j = 0; j < arrayCopy.GetLength(1); j++)
        {
          if (arrayCopy[i, j] == 6)
          {
            return (i, j);
          }
        }
      }
      return (0, 0);
    }

  }

  //3- стена
  //2-проход
  //1-вход 
  //4-выход
}