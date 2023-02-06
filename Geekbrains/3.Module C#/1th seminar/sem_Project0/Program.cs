Console.Clear();
//body
Console.Write("Enter the number: ");
string input = Console.ReadLine();
int num = int.Parse(input);
//squre
int sqr = num * num;
int sqr2 = (int)Math.Pow(num, 2);
//print
Console.WriteLine(sqr);
Console.WriteLine(sqr2);