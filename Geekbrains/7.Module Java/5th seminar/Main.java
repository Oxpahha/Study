import java.util.*;

public class Main {
    public static void main(String[] args) {

    }
    static void semFiveTaskOne() {
        /*
        Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
        123456 Иванов
        321456 Васильев
        234561 Петрова
        234432 Иванов
        654321 Петрова
        345678 Иванов
        Вывести данные по сотрудникам с фамилией Иванов.
         */
        Map<Integer, String> map = new HashMap<>();
        map.put(123456, "Иванов");
        map.put(321456, "Васильев");
        map.put(234561, "Петрова");
        map.put(234432, "Иванов");
        map.put(654321, "Петрова");
        map.put(345678, "Иванов");

        String sub = "Иванов";
        System.out.printf("For %s\n", sub);
        for (Map.Entry entry : map.entrySet()) {
            if (entry.getValue().equals(sub)) {
                System.out.println("Pass: " + entry.getKey());
            }

        }
    }
    static void semFiveTaskTwo() {
        /*
        Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфными и false, если нет.
        Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове,
        при этом повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранением порядка следования.
        (Например, add - egg изоморфны)
        буква может не меняться, а остаться такой же. (Например, note - code)
        Пример 1:
            Input: s = "foo", t = "bar"
            Output: false
        Пример 2:
            Input: s = "paper", t = "title"
            Output: true
         */
        Map<Character, Character> map = new HashMap<>();
        String inputOne = "foo";
        String inputTwo = "bar";
        Boolean flag = true;
        if (inputTwo.length() != inputOne.length()) {
            flag = false;
        }
        for (int i = 0; flag && i < inputOne.length(); i++) {
            if (!map.containsKey(inputOne.charAt(i))){
                map.put(inputOne.charAt(i),inputTwo.charAt(i));
            } else {
                if (inputTwo.charAt(i) != map.get(inputOne.charAt(i))){
                    flag = false;

//              for(Map.Entry entry: map.entrySet()){
//                  if (entry.getKey().equals(inputOne.charAt(i)) && !entry.getValue().equals(inputTwo.charAt(i))){
//                     flag = false;
//              }
                }
            }
        }
        System.out.println(flag);
    }
    static void semFiveTaskThree() {
        /*
        Написать программу, определяющую правильность расстановки скобок в выражении.
        Пример 1: a+(d*3) - истина
        Пример 2: [a+(1*3) - ложь
        Пример 3: [6+(3*3)] - истина
        Пример 4: {a}[+]{(d*3)} - истина
        Пример 5: <{a}+{(d*3)}> - истина
        Пример 6: {a+]}{(d*3)} - ложь
         */

        String op = "[6+(3*3)]";
        Boolean flag = true;
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> map = new HashMap<>();
            map.put(')','(');
            map.put(']','[');
            map.put('}','{');
            map.put('>','<');
            map.put('\'','\'');
            map.put('\"','\"');
        for (int i = 0; flag && i < op.length(); i++) {
            if (map.containsValue(op.charAt(i))){
                stack.push(op.charAt(i));
            }
            if (map.containsKey(op.charAt(i))){
                if(stack.isEmpty() || stack.pop()!=map.get(op.charAt(i))){
                    flag = false;
                }
            }
        }
        if (!stack.isEmpty()){
            flag = false;
        }
        System.out.println(flag);
    }
    static void semFiveTaskFour(){
        /*
        Взять набор строк, например:

        Мороз и солнце день чудесный
        Еще ты дремлешь друг прелестный
        Пора красавица проснись.

        Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
        Строки с одинаковой длиной не должны “потеряться”.
         */

        String str = "Мороз и солнце день чудесный\n" +
                     "Еще ты дремлешь друг прелестный\n" +
                     "Пора красавица проснись.";

        str = str.replace(".","");
        str = str.replace("\n"," ");
        String[] words = str.split(" ");
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                //return Integer.compare(o1,o2);
                if(o1 > o2){
                    return 1;
                }
                else if (o1 < o2){
                    return -1;
                } else {
                    return 0;
                }
                // ниче не делает,просто для примера
            }
            });
        for (String word : words) {
            if (!treeMap.containsKey(word.length())) {
                List<String> list = new ArrayList<>();
                list.add(word);
                treeMap.put(word.length(),list);
            } else {
                List<String> list = treeMap.get(word.length());
                list.add(word);
            }
        }
        System.out.println(treeMap);
    }
}