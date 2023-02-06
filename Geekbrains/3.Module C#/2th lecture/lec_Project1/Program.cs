int Max(int arg1,int arg2,int arg3)
{
    int result = arg1;
    if (arg2 > result) result = arg2;
    if (arg3 > result) result = arg3;
    return result;
}

int a1 = 1, a2 = 2, a3 = 3, a4 = 11, a5 = 5, a6 = 6, a7 = 7, a8 = 8, a9 = 9;

int max = Max(Max(a1,a2,a3),Max(a4,a5,a6),Max(a7,a8,a9));
Console.WriteLine(max);

