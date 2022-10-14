// Задача 71: В некотором машинном алфавите имеются четыре буквы «а», «и», «с» и «в».
// Покажите все слова, состоящие из 2 букв, которые можно построить из букв этого алфавита.
// n = 2 -> аа, ии, сс, вв, аи, иа, ис, си, ас, са, ав, ва, ви, ив, св, вс

char[] alph = { 'а', 'и', 'с', 'в' };
char[] wordLength = new char[InputIntNumber()];
PrintWords(alph, wordLength);

void PrintWords(char[] charArray, char[] word, int length = 0)
{
    if (length == word.Length)
    {
        Console.Write($" {new String(word) }");
        return;
    }

    for (int i = 0; i < charArray.Length; i++)
    {
        word[length] = charArray[i];
        PrintWords(charArray, word, length + 1);
    }
}

int InputIntNumber()
{
    Console.Write($"Ведите число: ");
    int number = int.Parse(Console.ReadLine() ?? "0");
    return number;
}