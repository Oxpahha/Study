string text = "Не следует, однако, забывать, что начало повседневной "
            + "работы по формированию позиции предопределяет высокую востребованность " 
            + "существующих финансовых и административных условий. Мы вынуждены " 
            + "отталкиваться от того, что сплочённость команды профессионалов обеспечивает " 
            + "широкому кругу (специалистов) участие в формировании анализа существующих " 
            + "паттернов поведения.";

// string s = "qwerty"
//             012345
// s[3]           r

string Replace(string text, char oldValue, char newValue)
{
    string result = String.Empty;
    int length  = text.Length;
    for (int i = 0; i < length; i++)
    {
        if(text[i] == oldValue) result = result + $"{newValue}";
        else result = result + $"{text[i]}";
    }
    return result;
}

string newText = Replace(text, ' ', '|');

Console.WriteLine(newText);
Console.WriteLine();

newText = Replace(newText, 'т', 'Т');
Console.WriteLine(newText);