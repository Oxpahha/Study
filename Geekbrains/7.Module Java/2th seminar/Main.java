import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
        semTwoTaskFour();

    }

    static void semTwoTaskOne() {
        /* Задание №1
           Дано четное число N (>0) и символы с1 и с2.
           Написать метод, который вернет строку N, которая состоит из чередующихся символов с1 и с2, начиная с с1.
           Пример: с1с2с1...с2 (всего N символов)
         */

        System.out.println(frog(10, 'H', 'a'));
    }
    static String frog( int n, char c1, char c2) {
        if (n%2 != 0 || n <= 0){
            return "N не подходит под условия задачи";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n/2; i++) {
            stringBuilder.append(c1);
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }
    static void semTwoTaskTwo() {
        /* Задание №2
           Написать метод, который сжимает строку.
           Пример ввода: aaaabbbcdd
           Пример вывода: a4b3cd2
         */
        String task = "aaaabbbcddrr";
        System.out.println(shrink(task));

    }
    static String shrink (String str) {
        StringBuilder stringBuilder = new StringBuilder();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i-1)){
                count++;
            } else {
                stringBuilder.append(str.charAt(i-1));
                if (count != 1) {
                    stringBuilder.append(count);
                }
                count = 1;
            }
        }
        stringBuilder.append(str.charAt(str.length()-1));
        if (count != 1) {
            stringBuilder.append(count);
        }
        return stringBuilder.toString();
    }
    static void semTwoTaskThree() {
        /* Задание №3
           Написать метод, который проверяет является ли строка полиндромом.
           Пример ввода: aabbcсbbaa
           Пример вывода: Является полиндромом
         */
        String taskThree = "aabbcacbbaa";
        System.out.println(checkPol(taskThree));

    }
    static String checkPol(String str){
        for (int i = 0, j = str.length()-1; i < str.length(); i++, j--) {
            if (str.charAt(i) != str.charAt(j)){
                return "Не является";
            }
        }
        return "Является";
    }
    static void semTwoTaskFour() {
        /* Задание №4
           Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
           который запишет эту строку в простой текстовый файл, обработайте исключения.
         */
        int cycle = 100;
        String taskFour = "TEST";
        String path = "TwoTaskFour.txt";
        cycCreate(taskFour, cycle);
        wrtTxt(cycCreate(taskFour, cycle), path);

    }
    static String cycCreate(String str, int n){
        return String.valueOf(str).repeat(Math.max(0, n));
    }
    static void wrtTxt(String str, String filePath){

        Logger logger = Logger.getAnonymousLogger();
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        FileHandler fileHandler = null;

        logger.log(Level.INFO, "Записываю в файл");
        try {
            fileHandler = new FileHandler("taskFourLogger.txt");
            fileHandler.setFormatter(simpleFormatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
        logger.addHandler(fileHandler);

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(str);
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }
    static String readFileP(String filePath){
        File file = new File(filePath);
        StringBuilder stringBuilder = new StringBuilder();
        try (Scanner scanner = new Scanner(file)){
            while (scanner.hasNext()){
                stringBuilder.append(scanner.nextLine());
                stringBuilder.append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return stringBuilder.toString();
    }

}