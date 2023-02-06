void FillArray(int[] collection)
{
    int length = collection.Length;
    int index = 0;

    while (index < length)
    {
        collection[index] = new Random().Next(1,10);
        index++;
    }
}
void PrintArray(int[] collection2)
    {
        int count = collection2.Length;
        int pos = 0;
        while (pos < count)
        {
            Console.Write(collection2[pos] + " ");
            pos++;
        }
    }

int[] array = new int[10];

int IndexOf(int[] collection, int find)
{
    int count = collection.Length;
    int index = 0;
    int pos = -1;

    while (index < count)
    {
        if(collection[index] == find)
        {
            pos = index;
            break;
        }
        index++;
    }
    return pos;
}

FillArray(array);
PrintArray(array);
Console.WriteLine();

int pos = IndexOf(array, 4);
Console.WriteLine(pos);
