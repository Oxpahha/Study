public class HomeWork {
    public static void main(String[] args) {

    }

    static int Randommo(int from, int to) {
        Random random = new Random();
        return random.nextInt(from, to);
    }
    static void semThreeTaskOneHW() {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < Randommo(8, 9); i++) {
            list.add(Randommo(1, 10));
        }

        System.out.println(list);
        list = sortMerge(list);
        System.out.println(list);
    }
    public static ArrayList<Integer> sortMerge(ArrayList<Integer> list) {
        if (list.size() == 1) {
            return list;
        } else {
            int half = list.size() / 2;
            ArrayList<Integer> list1 = new ArrayList<>(half);
            ArrayList<Integer> list2 = new ArrayList<>(list.size() - half);
            for (int i = 0; i < half; i++) {
                list1.add(list.get(i));
            }

            for (int i = half; i < list.size(); i++) {
                list2.add(list.get(i));
            }

            sortMerge(list1);
            sortMerge(list2);
            merge(list1, list2, list);
        }
        return list;
    }
    public static void merge(ArrayList<Integer> list1, ArrayList<Integer> list2, ArrayList<Integer> arrList) {
        int border1 = 0;
        int border2 = 0;

        for (int i = 0; i < arrList.size(); i++) {
            if (border1 == list1.size()) {
                arrList.set(i, list2.get(border2));
                border2++;
            } else if (border2 == list2.size()) {
                arrList.set(i, list1.get(border1));
                border1++;
            } else if (list1.get(border1) <= list2.get(border2)) {
                arrList.set(i, list1.get(border1));
                border1++;
            } else if (list1.get(border1) >= list2.get(border2)) {
                arrList.set(i, list2.get(border2));
                border2++;
            }
        }
    }
    static void semThreeTaskOTwoHW() {
        /*
         * 2. Пусть дан произвольный список целых чисел, удалить из него четные числа
         */

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < Randommo(5, 25); i++) {
            list.add(Randommo(1, 20));
        }
        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }
        System.out.println(list);

    }
    static void semThreeTaskTheeHW() {
        /*
         * 3. Задан целочисленный список ArrayList.
         * Найти минимальное, максимальное и среднее из этого списка.
         */
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < Randommo(5, 25); i++) {
            list.add(Randommo(1, 20));
        }
        System.out.println(list);
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        sum = sum / list.size();

        System.out.printf("Минимальное: %1$d Максимальное: %2$d Среднее: %3$.2f" +
                "", Collections.min(list), Collections.max(list), sum);
    }
}