Console.Write("Введите целые числа через пробел: ");
string data = Console.ReadLine() ?? "0";

string[] datalList = (data.Split(" "));
//Console.WriteLine(data);
int[] intList = new int[datalList.Length];
//int sum = 0;

for (int i = 0; i < datalList.Length; i += 1)
{
    intList[i] = (Convert.ToInt32(datalList[i]));
    //Console.WriteLine(datalList[i]);
    //sum += intList[i];
}
//Console.WriteLine(sum);

int max = intList[0];
for (int i = 0; i < datalList.Length; i += 1)
{
    if (max < intList[i])
        max = intList[i];
}

Console.WriteLine($"Максимальное число из {data} будет {max}");
//Console.WriteLine("Максимальное число из {0} будет {1}", data, max);
//Console.WriteLine("Максимальное число из " + data + " будет " + max);