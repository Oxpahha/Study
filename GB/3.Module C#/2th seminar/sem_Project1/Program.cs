//Напишите прогрмамму которая выводит случайное число из 
//отрезка [10,99] и показывает наибольшую цифру числа.

//int num = new Random().Next(10, 100);
int num = 597;
Console.WriteLine(num);

// int numberMax = 0;
// int firstNum = num / 10;
// int secNum = num % 10;

int numberMax = 0;
int frsNum = num / 100;
int secNum = num / 10 % 10;
int thrNum = num % 10;

Console.WriteLine(frsNum + " " + secNum + " " + thrNum);

numberMax = frsNum > secNum ? frsNum : secNum; 
numberMax = numberMax > thrNum ? numberMax : thrNum;
Console.WriteLine(numberMax);