Console.Write("Введите число: ");
int num = int.Parse(Console.ReadLine() ?? "0");

//if(num%2 == 0) 
//    Console.WriteLine($"Число {num} четное");
//else
//    Console.WriteLine($"Число {num} нечетное");


Console.WriteLine(num / 3 + " " + num % 3);
