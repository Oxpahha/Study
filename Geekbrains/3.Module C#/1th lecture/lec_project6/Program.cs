Console.Clear();

int ax = 25, ay = 1,
    bx = 1, by = 25,
    cx = 50, cy = 25;

Console.SetCursorPosition(ax,ay);
Console.WriteLine("#");
Console.SetCursorPosition(bx,by);
Console.WriteLine("#");
Console.SetCursorPosition(cx,cy);
Console.WriteLine("#");

int x = ax, y = ay;
int count = 0;

while(count < 1000)
{
    int num = new Random().Next(0,3);
    if (num == 0)
    {
        x = (x + ax)/2;
        y = (y + ay)/2;
    }
    if (num == 1)
    {
        x = (x + bx)/2;
        y = (y + by)/2;
    }
    if (num == 2)
    {
        x = (x + cx)/2;
        y = (y + cy)/2;
    }

    Console.SetCursorPosition(x,y);
    Console.WriteLine("#");
    count++;
}