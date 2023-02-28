import java.util.*;

public class HomeWork {
    public static void main(String[] args) {

    }
    
    static void semFiveTaskOneHW(){
        /*
        Реализуйте структуру телефонной книги с помощью HashMap, учитывая,
        что 1 человек может иметь несколько телефонов.
         */

        Map <String,String> map = new HashMap<>();
        boolean work = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome.\n" +
                "To show phonebook all entries type: Phones\n" +
                "For specific Name type: Phones Name\n" +
                "To Exit type: Exit\n" +
                "To add new entry type: Name Number\n" +
                "Example: Misha 88005553535");
        while (work) {
            System.out.println("Enter:");
            String[] newEntry = scanner.nextLine().split(" ");
            if (newEntry.length==1){
                if (newEntry[0].equals("Exit")){
                    work = false;
                    System.out.println("Bye!");
                    continue;
                } else if (newEntry[0].equals("Phones")){
                    System.out.println(map.keySet());
                    continue;
                } else {
                    System.out.println("Huh?");
                    continue;
                }
            }
            if (newEntry[0].equals("Phones")){
                System.out.printf("Numbers for %s:\n",newEntry[1]);
                System.out.println(map.get(newEntry[1]));
                continue;
            }
            if (!isDigit(newEntry[1])){
                System.out.println("Looks like u add wrong number!");
                continue;
            }
            if (!map.containsKey(newEntry[0])){
                map.put(newEntry[0],newEntry[1]);
                System.out.println("Added new entry.");
            } else {
                String addNumber = map.get(newEntry[0])+(",")+(newEntry[1]);
                map.put(newEntry[0],addNumber);
                System.out.printf("Added new number for %s.\n",newEntry[0]);
            }
        }
    }
    static void semFive(){ //TaskTwoHW
        /*
        Пусть дан список сотрудников:
            Иван Иванов
            Светлана Петрова
            Кристина Белова
            Анна Мусина
            Анна Крутова
            Иван Юрин
            Петр Лыков
            Павел Чернов
            Петр Чернышов
            Мария Федорова
            Марина Светлова
            Мария Савина
            Мария Рыкова
            Марина Лугова
            Анна Владимирова
            Иван Мечников
            Петр Петин
            Иван Ежов
        Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений.
        Отсортировать по убыванию популярности.
         */
        String str = "Иван Иванов\n" +
                     "Светлана Петрова\n" +
                     "Кристина Белова\n" +
                     "Анна Мусина\n" +
                     "Анна Крутова\n" +
                     "Иван Юрин\n" +
                     "Петр Лыков\n" +
                     "Павел Чернов\n" +
                     "Петр Чернышов\n" +
                     "Мария Федорова\n" +
                     "Марина Светлова\n" +
                     "Мария Савина\n" +
                     "Мария Рыкова\n" +
                     "Марина Лугова\n" +
                     "Анна Владимирова\n" +
                     "Иван Мечников\n" +
                     "Петр Петин\n" +
                     "Иван Ежов";


        String[] name = str.replace("\n"," ").split(" ");

        Map<String, Integer> hash = new HashMap<>();
        for (int i = 0; i < name.length; i+=2) {
            if (!hash.containsKey(name[i])) {
                hash.put(name[i],1);
            } else {
                hash.replace(name[i],hash.get(name[i])+1);
            }
        }
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });
        for (Map.Entry<String, Integer> entry: hash.entrySet()) {
            if (treeMap.containsKey(entry.getValue())){
                treeMap.get(entry.getValue()).add(entry.getKey());
            }
            else {
                ArrayList<String> list = new ArrayList<>();
                list.add(entry.getKey());
                treeMap.put(entry.getValue(), list);
            }
        }
        System.out.println(treeMap);

    }


    static void semFiveTaskThreeHW(){
        /*
        Реализовать алгоритм пирамидальной сортировки (HeapSort).
         */

        ArrayList<Integer> arrayList = new ArrayList<>();
        fillRnd(arrayList,0,15);
        int len = arrayList.size();
        int max = Math.max(0, (len / 2) - 1);

        for (int i = max; i >= 0; i--) {
            heap(arrayList, len, i);
        }
        for (int i = len - 1; i >= 0; i--) {
            swap(arrayList, 0, i);
            heap(arrayList, i, 0);
        }
        System.out.println(arrayList);

    }
    static void fillRnd(ArrayList<Integer> list,int from,int to){
        Random random = new Random();
        for (int i = 0; i < random.nextInt (from,to); i++) {
            list.add(random.nextInt(from,to));
        }
        System.out.println(list);
    }

    static void heap(ArrayList<Integer> arrayList, int n, int i) {
        boolean flag = true;
        while (flag) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int temp = i;

            if (right < n && arrayList.get(right) > arrayList.get(temp)) {
                temp = right;
            }
            if (left < n && arrayList.get(left) > arrayList.get(temp)) {
                temp = left;
            }
            if (temp != i) {
                swap(arrayList, temp, i);
                i = temp;
            }
            else {
                flag = false;
            }
        }
    }

    static void swap(ArrayList<Integer> arr, int i, int j) {
        int tmp = arr.get(i);
        arr.set(i, arr.get(j));
        arr.set(j, tmp);
    }
}
    
