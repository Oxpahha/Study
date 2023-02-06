
//System.Console.WriteLine(Factorial(3)); //1*2*3 = 6


for (int i = 1; i < 40; i++) //Stack overflow.
{
    Console.WriteLine($"{i}! = {Factorial(i)}");
}


double Factorial(int n)
{
    // 1! = 1
    // 0! = 1
    if (n == 1)
        return 1;
    else
        return n * Factorial(n - 1);
}