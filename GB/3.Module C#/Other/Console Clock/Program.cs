
String[,] s0 ={
{"0000"},
{"0  0"},
{"0  0"},
{"0  0"},
{"0000"},};
String[,] s1 ={
{"   0"},
{"  00"},
{" 0 0"},
{"   0"},
{"   0"},};
String[,] s2 ={
{"0000"},
{"   0"},
{"0000"},
{"0   "},
{"0000"},
};
String[,] s3 ={
{"0000"},
{"   0"},
{"0000"},
{"   0"},
{"0000"},
};
String[,] s4 ={
{"0  0"},
{"0  0"},
{"0000"},
{"   0"},
{"   0"},
};
String[,] s5 ={
{"0000"},
{"0   "},
{"0000"},
{"   0"},
{"0000"},
};
String[,] s6 ={
{"0000"},
{"0   "},
{"0000"},
{"0  0"},
{"0000"},
};
String[,] s7 ={
{"0000"},
{"   0"},
{"  0 "},
{" 0  "},
{"0   "},
};
String[,] s8 ={
{"0000"},
{"0  0"},
{"0000"},
{"0  0"},
{"0000"},
};
String[,] s9 ={
{"0000"},
{"0  0"},
{"0000"},
{"   0"},
{"0000"},
};

DateTime dateTime = new DateTime();
dateTime = DateTime.Now;
int h1, h2, min1, min2, sec1, sec2;
String[,] mas1 = s0, mas2 = s0, mas3 = s0, mas4 = s0, mas5 = s0, mas6 = s0;

while (true)
{
    dateTime = DateTime.Now;
    h1 = dateTime.Hour / 10;
    h2 = dateTime.Hour % 10;
    min1 = dateTime.Minute / 10;
    min2 = dateTime.Minute % 10;
    sec1 = dateTime.Second / 10;
    sec2 = dateTime.Second % 10;
    for (int i = 0; i < 5; i++)
    {
        switch (h1)
        {
            case 0:
                mas1 = s0;
                break;
            case 1:
                mas1 = s1;
                break;
            case 2:
                mas1 = s2;
                break;
            case 3:
                mas1 = s3;
                break;
            case 4:
                mas1 = s4;
                break;
            case 5:
                mas1 = s5;
                break;
            case 6:
                mas1 = s6;
                break;
            case 7:
                mas1 = s7;
                break;
            case 8:
                mas1 = s8;
                break;
            case 9:
                mas1 = s9;
                break;
        }
        switch (h2)
        {
            case 0:
                mas2 = s0;
                break;
            case 1:
                mas2 = s1;
                break;
            case 2:
                mas2 = s2;
                break;
            case 3:
                mas2 = s3;
                break;
            case 4:
                mas2 = s4;
                break;
            case 5:
                mas2 = s5;
                break;
            case 6:
                mas2 = s6;
                break;
            case 7:
                mas2 = s7;
                break;
            case 8:
                mas2 = s8;
                break;
            case 9:
                mas2 = s9;
                break;
        }
        switch (min1)
        {
            case 0:
                mas3 = s0;
                break;
            case 1:
                mas3 = s1;
                break;
            case 2:
                mas3 = s2;
                break;
            case 3:
                mas3 = s3;
                break;
            case 4:
                mas3 = s4;
                break;
            case 5:
                mas3 = s5;
                break;
            case 6:
                mas3 = s6;
                break;
            case 7:
                mas3 = s7;
                break;
            case 8:
                mas3 = s8;
                break;
            case 9:
                mas3 = s9;
                break;
        }
        switch (min2)
        {
            case 0:
                mas4 = s0;
                break;
            case 1:
                mas4 = s1;
                break;
            case 2:
                mas4 = s2;
                break;
            case 3:
                mas4 = s3;
                break;
            case 4:
                mas4 = s4;
                break;
            case 5:
                mas4 = s5;
                break;
            case 6:
                mas4 = s6;
                break;
            case 7:
                mas4 = s7;
                break;
            case 8:
                mas4 = s8;
                break;
            case 9:
                mas4 = s9;
                break;
        }
        switch (sec1)
        {
            case 0:
                mas5 = s0;
                break;
            case 1:
                mas5 = s1;
                break;
            case 2:
                mas5 = s2;
                break;
            case 3:
                mas5 = s3;
                break;
            case 4:
                mas5 = s4;
                break;
            case 5:
                mas5 = s5;
                break;
            case 6:
                mas5 = s6;
                break;
            case 7:
                mas5 = s7;
                break;
            case 8:
                mas5 = s8;
                break;
            case 9:
                mas5 = s9;
                break;
        }
        switch (sec2)
        {
            case 0:
                mas6 = s0;
                break;
            case 1:
                mas6 = s1;
                break;
            case 2:
                mas6 = s2;
                break;
            case 3:
                mas6 = s3;
                break;
            case 4:
                mas6 = s4;
                break;
            case 5:
                mas6 = s5;
                break;
            case 6:
                mas6 = s6;
                break;
            case 7:
                mas6 = s7;
                break;
            case 8:
                mas6 = s8;
                break;
            case 9:
                mas6 = s9;
                break;
        }
        Console.Write(mas1[i, 0]);
        Console.Write("  ");
        Console.Write(mas2[i, 0]);
        Console.Write("  ");
        Console.Write("|");
        Console.Write("  ");
        Console.Write(mas3[i, 0]);
        Console.Write("  ");
        Console.Write(mas4[i, 0]);
        Console.Write("  ");
        Console.Write("|");
        Console.Write("  ");
        Console.Write(mas5[i, 0]);
        Console.Write("  ");
        Console.Write(mas6[i, 0]);
        Console.WriteLine();
    }
    Thread.Sleep(1000);
    Console.Clear();
}