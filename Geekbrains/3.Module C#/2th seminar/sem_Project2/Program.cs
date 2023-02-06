//Напишите пр-му которая выводит случайное трехзначное число
// и удаляет вторую цифру из этого числа

int num = new Random().Next(100, 999);

Console.WriteLine(num);

int frsNum = num / 100;
int secNum = num / 10 % 10;
int thrNum = num % 10;

Console.WriteLine(frsNum + "" + thrNum);
