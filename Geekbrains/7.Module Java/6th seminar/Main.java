import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    static void semSixTaskFour(){
        /*
        1. Реализуйте 1 из вариантов класса Cat из предыдущего задания,
         можно использовать не все придуманные поля и методы. Создайте несколько
         экземпляров этого класса, выведите их в консоль.
        2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat,
         выводилась его кличка, цвет и возраст (или другие параметры на ваше усмотрение).
         */
        Cat cat = new Cat();
        cat.name = "John";
        cat.age = 5;
        cat.ownerName = "Colan Brod";

        Cat cat1 = new Cat();
        cat1.name = "John";
        cat1.age = 5;
        cat1.ownerName = "Colan Brod";

        System.out.println(cat1.equals(cat));

        Cat cat2 = new Cat();
        cat2.name = "Gerd";
        cat2.age = 1;
        cat2.ownerName = "Frank Brod";

        Set<Cat> cats = new HashSet<>();
        cats.add(cat);
        cats.add(cat1);
        System.out.println(cats);
    }
    static void semSixTaskThree(){
        /*
        1. Продумайте структуру класса Кот.
           Какие поля и методы будут актуальны для приложения, которое является
            а) информационной системой ветеринарной клиники
            б) архивом выставки котов
            в) информационной системой Театра кошек Ю. Д. Куклачёва
            Можно записать в текстовом виде, необязательно реализовывать в java.
         */

        Cat cat = new Cat();
        cat.name = "John";
        System.out.println(cat.name);
        cat.sayMaw();

        Cat cat1 = new Cat();
        cat1.name = "Bob";
        System.out.println(cat1.name);
        System.out.println(cat1.getName());

    }
    static void semSixTaskTwo(){
        /*
        1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
        2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент
            уникальных значений в данном массиве и верните его в виде числа с плавающей запятой.
        Для вычисления процента используйте формулу:
            процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
         */

        Integer[] ar = new Integer[20];
        fillRnd(ar,0,25);
        precentOfUni(ar);
    }
    static void precentOfUni(Integer[] array){
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        double unNum = hashSet.size() *100.0 /  array.length;
        System.out.println("Unic number in array: "+unNum +"%");
    }
    static void fillRnd(Integer[] array,int from,int to){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(from, to);
        }
//        System.out.println(Arrays.toString(array));
    }
    static void semSixTaskOne() {
//        1. Создайте HashSet, заполните его следующими числами:
//        {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
//        2. Создайте LinkedHashSet, заполните его следующими числами:
//        {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
//        3. Создайте TreeSet, заполните его следующими числами:
//        {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.

//        Integer[] array = new Integer[]{1, 2, 3, 2, 4, 5, 6, 3};
        Integer[] array = new Integer[]{5, 2, 3, 2, 4, 1, 6, 3};
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(array));
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(array));
        TreeSet<Integer> treeMap = new TreeSet<>(Arrays.asList(array));

        System.out.println(hashSet);
        System.out.println(linkedHashSet);
        System.out.println(treeMap);
    }
}