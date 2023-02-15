import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        taskFive();

    }

    static void taskOne() {
        /*
        Задание №1
        Написать программу, которая запросит пользователя ввести <Имя> в консоли.
        Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
         */

        System.out.println("Name?");
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            name = scanner.nextLine();
        }
        System.out.printf("Hello, %s", name);
    }
    static void taskOnePlus() {
        /*
        Задание №1+
        В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
        "Доброе утро, <Имя>!", если время от 05:00 до 11:59
        "Добрый день, <Имя>!", если время от 12:00 до 17:59;
        "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
        "Доброй ночи, <Имя>!", если время от 23:00 до 4:59
        */

        LocalTime localTime = LocalTime.now();
        int hour = localTime.getHour();
        System.out.println("Name?");
        String name;
        try (Scanner scanner = new Scanner(System.in)) {
            name = scanner.nextLine();
        }
        if (hour >= 5 && hour < 12) {
            System.out.printf("Доброе утро, %s!", name);
        } else if (hour >= 12 && hour < 18) {
            System.out.printf("Доброе день, %s!", name);
        } else if (hour >= 18 && hour < 23) {
            System.out.printf("Доброе вечер, %s!", name);
        } else {
            System.out.printf("Доброе день, %s!", name);
        }
    }
    static void taskTwo() {
        /*
        Задание №2
        Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
        */
//        int[] arri = new int[] {1,1,0,1,1,1};
        int[] arri = new int[10];
        int num = 1;
        fillRandomArray(arri);
        int count = 0;
        int maxCount = 0;


//        for (int i = 0; i < arri.length; i++)
//            if (arri[i] == num) {
//                count++;

        for (int j : arri)
            if (j == num) {
                count++;
            } else {
                // maxCount = count > maxCount ? count : maxCount;
                maxCount = numbersDif(maxCount, count);
                count = 0;
            }
        // maxCount = count > maxCount ? count : maxCount;    
        maxCount = numbersDif(maxCount,count);
        System.out.printf("Максимальное количество подряд идущих %d равно %d",num,maxCount);
    }
    static void fillRandomArray(int[] arr) {
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(2);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int numbersDif(int a, int b){
        if (a < b) {
            a = b;
        }
        return a;
    }
    static void taskThree() {
        /*
        Задание №3
        Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
         */
        int val = 3;
        int[] nums = {3,2,2,3};
        int[] result = new int[nums.length];
        Arrays.fill(result, val);

        for (int i = 0, j = 0; i < nums.length; i++) {
            if (nums[i] != val){
                result[j] = nums[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    static void taskThreeAnother() {
        /*
        Задание №3
        Дан массив nums = [3,2,2,3] и число val = 3.
        Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива.
        Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.
         */
        short val = 3;
        int[] nums = { 3, 2, 2, 3, 1, 9, 6 };
        int[] sorting = new int[nums.length];
        short j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                sorting[j] = nums[i];
                j++;
            }
        }
        for (int k = j; k < sorting.length; k++) {
            sorting[k] = val;
        }
        nums = sorting;
        System.out.println(Arrays.toString(nums));
        
    }
    static void taskFour() {
        /*
        Задание №4
        Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
        Если общего префикса нет, вернуть пустую строку ""
         */

    }
    static void taskFive() {
        /*
        Задание №5
        Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
         */
        String str = "Добро пожаловать на курс по Java";
        System.out.println(str);
        String[] strArr = str.split(" ");
        String res = "";
        for (int i = strArr.length-1; i >= 0; i--) {
            res += strArr[i] + " ";
        }
        System.out.println(res);
    }
}

