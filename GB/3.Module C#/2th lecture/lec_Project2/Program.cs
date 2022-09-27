int Max(int arg1, int arg2, int arg3)
{
    int result = arg1;
    if (arg2 > result) result = arg2;
    if (arg3 > result) result = arg3;
    return result;
}

//int a1 = 1, a2 = 2, a3 = 3, a4 = 11, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 = 9;

int[] array = { 1, 12, 3, 34, 5, -6, 7, 8, 9 };
//array[0] = 2;
//Console.WriteLine(array[0]);

int max = Max(Max(array[0], array[1], array[2]),
              Max(array[3], array[4], array[5]),
              Max(array[6], array[7], array[8]));



Console.WriteLine(max);

