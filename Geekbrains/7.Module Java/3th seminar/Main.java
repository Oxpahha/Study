
public class Main {
    public static void main(String[] args) {

    }

    static void letsParseJson() {
        String json = "{[{\"Фамилия\":\"Пушкин\",\"Оценка\":\"2\",\"Предмет\":\"Стрельба\"}," +
                "{\"Фамилия\":\"Колотушкин\",\"Оценка\":\"5\",\"Предмет\":\"Математика\"}," +
                "{\"Фамилия\":\"Шматко\",\"Оценка\":\"3\",\"Предмет\":\"Склады\"}]}";

        json = json.substring(3, json.length() - 3);
        String[] students = json.split("},\\{");

        System.out.println(Arrays.toString(students));

        for (int i = 0; i < students.length; i++) {
            String[] data = students[i].split(",");
            System.out.println(Arrays.toString(data));
            for (int j = 0; j < data.length; j++) {

            }
        }
        // magic//
        Map<String, String> map = new HashMap<>();
        map.put("k", "v");

    }
    static void semThree() {
        LinkedList<Integer> list1 = new LinkedList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        // semThreeSumW(list1); // обработает
        // semThreeSumW(list2); //

        semThreeSum(list1);
        semThreeSum(list2);

        int num = 5;
        semThreeTest(num);
        System.out.println(num);

        List<Integer> list3 = new ArrayList<>();
        semThreeSum(list3);
        System.out.println(list3);
    }
    static void semThreeSumW(LinkedList<Integer> linkedList) {
    }
    static void semThreeSum(List<Integer> list) { // передается ссылка
        list.add(5);
    }
    static void semThreeTest(int a) { // создается новый объект
        a += 5;
    }
    static void semThreeTaskOne() {
        /*
         * `
         * Задание 1:
         * Даны строки, сравнить их с помощью == и equals() класса Object
         */
        String s1 = "hello";
        String s2 = "hello";
        String s3 = s1;
        String s4 = "h" + "e" + "l" + "l" + "o";
        String s5 = new String("hello");
        String s6 = new String(new char[] { 'h', 'e', 'l', 'l', 'o' });

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s1 == s5);
        System.out.println(s1 == s6);
        System.out.println();
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equals(s6));
    }
    static void semThreeTaskTwo() {
        /*
         * `
         * Задание 2:
         * Заполнить список 10 случайными числами.
         * Отсортировать список методом sort() и вывести его на экран.
         */
        int number = 10;
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list.add(random.nextInt(100));
        }

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);

        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            list2.add(random.nextInt(100));
        }

        System.out.println(list2);

        Collections.sort(list2, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        System.out.println(list2);

    }
    static void semThreeTaskThree() {
        /*
         * Задание 3:
         * Создать список типа ArrayList.
         * Поместить в него как строки так и целые числа.
         * Пройтись по списку, найти и удалить целые числа.
         */
        List list = new ArrayList();
        list.add(123);
        list.add(345);
        list.add("Its number!");
        list.add("Prapor");
        list.add(41);
        list.add("ARRRRR");

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);
    }
    static void semThreeTaskFour() {
        /*
         * Задание 4:
         * Каталог товаров в виде думерного списка. List<ArrayList<String>>, так что на
         * 0й позиции каждого внутреннего списка содержится название жанра, а на
         * остальных
         * названия книг. Напишите метод заполнения данной структуры.
         */
        List<List<String>> list = new ArrayList<>();
        addBook(list, "Детектив", "Шерлук Гномс");
        addBook(list, "Детектив", "Пупаро");
        addBook(list, "Роман", "Чебуроссия");

        System.out.println(list);
    }
    static void addBook(List<List<String>> booklist, String genre, String bookName) {
        for (int i = 0; i < booklist.size(); i++) {
            if (booklist.get(i).get(0).equals(genre)) {
                booklist.get(i).add(bookName);
                return;
            }
        }
        List<String> list1 = new ArrayList<>();
        list1.add(genre);
        list1.add(bookName);

        booklist.add(list1);
    }

}