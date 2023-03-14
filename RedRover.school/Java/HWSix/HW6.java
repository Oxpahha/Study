public class HW6 {
    public static void main(String[] args) {
        TaskExtra();
    }

    static void TaskOne() {
//    Задача №1
//
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести сумму всех значений массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; // 59
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
    static void TaskTwo() {
//    Задача №2
//
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести максимальное значение массива.
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; // 12
        int maxElement = array[0];
        for (int i : array) {
            if (i > maxElement) {
                maxElement = i;
            }
        }
        System.out.println(maxElement);
    }
    static void TaskThree() {
//            Задача №3
//
//    Дан массив:
//    int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};
//    необходимо вывести минимальное значение массива.

        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6}; // 2
        int minElement = array[0];
        for (int i : array) {
            if (i < minElement) {
                minElement = i;
            }
        }
        System.out.println(minElement);
    }
    static void TaskFour() {
//            Задача №4
//
//    Дан массив:
//    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//    необходимо вывести среднее арифметическое всех значений массива.

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // 5
        double sum = 0;
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum / array.length);
    }
    static void TaskFive() {
//            Задача №5
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//    необходимо вывести сумму элементов массива.
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}; // 24
        int sum = 0;
        for (int[] i : array) {
            for (int j : i) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
    static void TaskSix() {
//            Задача №6
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}; // 9
//    необходимо вывести максимальное значение массива.
        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
        int maxNumber = array[0][0];
        for (int[] i : array) {
            for (int j : i) {
                if (j > maxNumber) {
                    maxNumber = j;
                }
            }
        }
        System.out.println(maxNumber);

    }
    static void TaskSeven() {
//            Задача №7
//
//    Дан массив:
//    int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};
//    необходимо вывести количество элементов в массиве.

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}}; // 15
        int count1 = 0; 
        for (int[] i : array) {
            for (int j : i) {
                count1++; 
            }
        }
        System.out.println(count1);

        // Или

        int count2 = 0;
        for (int[] i : array) {
                count2+= i.length; 
            }
        System.out.println(count2);    

    }
    static void TaskEight() {
//    Задача №8
//
//    Дана строка:
//    String s = “Перестановочный алгоритм быстрого действия”;
//    необходимо вывести все буквы “о” из этой строки.
//    Для указанной строки ответ будет “ооооо” (или в столбик)
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'о') {
                System.out.print(s.charAt(i));
            }
        }
    }
    static void TaskNine() {
//    Задача №9
//
//    Дана строка:
//    String s = “Перевыборы выбранного президента”;
//    необходимо подсчитать количество букв “е” в строке.
//    Для указанной строки ответ будет 4.

        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е') {
                count++;
            }
        }
        System.out.println(count);
    }
    static void TaskTen() {
//    Задача №10
//
//    Дана строка:
//    String s = “Посмотрите как Рите нравится ритм”;
//    необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
//    Для указанной строки ответ будет 6, 15, 29.
        String s = "Посмотрите как Рите нравится ритм";
        String word = "рит";
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (!(s.toLowerCase().charAt(i) == word.charAt(j))) {
                continue;
            } else {
                for (int k = 1; k < word.length(); k++) {
                    if (!(s.toLowerCase().charAt(i+k) == word.charAt(j+k))) {
                        break;
                    }
                    if (k == word.length()-1){
                        System.out.print(i + " ");
                        i += 2;
                    }
                }
            }
        }
        // 
        System.out.println();

        // Или

        String s1 = "Посмотрите как Рите нравится ритм";
        String word1 = "рит";

        s1 = s1.toLowerCase();
        int index = s1.indexOf(word);

        while(index != -1){
            System.out.print(index + " ");
            index = s1.indexOf(word,index+1);
        }
    }

    static void TaskExtra() {
//    Экстра задача
//
//    Дан массив:
//    String[][] array = {{“Привет”, “всем”, “кто”}, {“изучает”, “язык”, “программирования”}, {“java”}};
//        необходимо подсчитать количество строк в массиве, которые не содержат буквы “е”.
        String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count = 0;
        char ch = 'е';
        boolean flag = true;
        for (String[] i : array) {
            for (String j : i) {
                for (int k = 0; k < j.length(); k++) {
                    if (j.charAt(k) == ch) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    count++;
                }
                flag = true;
            }
        }
        System.out.println(count);

        // или

        String[][] array1 = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
        int count1 = 0;
        char ch1 = 'е';

        for (String[] i : array1) {
            for (String j : i) {
                if (j.indexOf(ch1) == -1) {
                    count1++;
                }
            }       
        }
        System.out.println(count1);
    }
}