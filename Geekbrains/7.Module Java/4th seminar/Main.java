
public class Main {
    public static void main(String[] args) {

    }

    static void lecFourTaskOne_List() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(linkedList);

        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        System.out.println(queue);
        queue.remove();
        System.out.println(queue);

        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque.getFirst());
        System.out.println(deque);
        System.out.println(deque.peekLast());
        System.out.println(deque);
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static void lecFourTaskTwo() {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

        // var exp = "20 30 - 10 *".split(" "); // (20-30)*10
        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3

        // var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        int res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < exp.length; i++) {

            if (isDigit(exp[i])) {
                st.push(Integer.parseInt(exp[i]));
            } else {
                switch (exp[i]) {
                    case "+":
                        res = st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "-":
                        res = -st.pop() + st.pop();
                        st.push(res);
                        break;
                    case "*":
                        res = st.pop() * st.pop();
                        st.push(res);
                        break;
                    case "/":
                        res = st.pop() / st.pop();
                        st.push(res);
                        break;
                    default:
                        break;
                }
            }
        }
        System.out.printf("%d\n", st.pop());
    }

    static void semFourTaskOne() {
        /*
         * 1. Замерьте время за которое в ArrayList добавятся 10_000 эл-тов
         * 2. Замерьте время за которое в LinkedList добавятся 10_000 эл-тов
         * 3. Сравните их между собой
         */
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        LinkedList<Integer> list4 = new LinkedList<>();

        var timer1 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list1.add(5);
        }
        System.out.println("ArrayList: " + (System.currentTimeMillis() - timer1));
        var timer2 = System.currentTimeMillis();
        for (int i = 0; i < 1_000_000; i++) {
            list2.add(5);
        }
        System.out.println("LinkedList: " + (System.currentTimeMillis() - timer2));
        var timer3 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list3.add(0, 5);
        }
        System.out.println("ArrayList at index 0: " + (System.currentTimeMillis() - timer3));
        var timer4 = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            list4.add(0, 5);
        }
        System.out.println("LinkedList at index 0: " + (System.currentTimeMillis() - timer4));

    }

    static void semFourTaskTwo() {
        /*
         * Реализовать консольное приложение, которое:
         * Принимает от пользователя строку вида text~num
         * Нужно рассплитить строку по ~, сохранить text в связаный список на позицию
         * num.
         * Если введено print~num, выводит строку из позиции num в связанном списке и
         * удаляет ее из него.
         */
        Scanner scanner = new Scanner(System.in);
        boolean work = true;
        LinkedList<String> linkedList = new LinkedList<>();
        while (work) {
            System.out.println("Enter line: ");
            // String line = scanner.nextLine();
            // String[] lines = line.split("~");
            String[] lines = scanner.nextLine().split("~");
            if (lines[0].equals("end")) {
                work = false;
                break;
            }
            if (!valid(linkedList, lines)) {
                continue;
            }
            if (lines[0].equals("print")) {
                String word = linkedList.get(Integer.parseInt(lines[1]));
                linkedList.remove(Integer.parseInt(lines[1]));
                System.out.println(word);
            } else {
                linkedList.add(Integer.parseInt(lines[1]), lines[0]);
            }
        }
        System.out.println("Bye!");

    }

    static boolean valid(LinkedList<String> linkedList, String[] lines) {
        if (!lines[1].matches("[0-9]+")) {
            System.out.println("Неверный ввод");
            return false;
        }
        int index = Integer.parseInt(lines[1]);
        if (index > linkedList.size()) {
            System.out.println("Неверный ввод");
            return false;
        }
        return true;
    }

    static void semFourTaskThree() {
        /*
         * Реализовать консольное приложение, которое:
         * Принимает от пользователя и запоминает строки.
         * Если введено print, выводит строки так, чтобы последняя введенная была
         * первой в списке, а первая - последеней.
         * Если введено revert, удаляет предедущую введенную строку из памяти.
         */
        Scanner scanner = new Scanner(System.in);
        LinkedList<String> linkedList = new LinkedList<>();
        while (true) {
            System.out.println("Enter line: ");
            String line = scanner.nextLine();
            if (line.equals("end")) {
                break;
            }
            if (line.equals("print")) {
                // выводит строки так, чтобы последняя введенная была первой в списке, а первая
                // - последеней.
                ListIterator<String> iterator = linkedList.listIterator();
                while (iterator.hasNext()) {
                    // String string = iterator.next();
                }
                while (iterator.hasPrevious()) {
                    String string = iterator.previous();
                    System.out.println(string);
                }
            }
            if (line.equals("revert")) {
                // удаляет предедущую введенную строку из памяти.
                System.out.println("Line \"" + (linkedList.get(linkedList.size() - 1)) + "\" was deleted");
                linkedList.remove(linkedList.size() - 1);
            } else {
                linkedList.add(line);
            }
        }
        System.out.println("Bye!");
    }

    static void semFourIterator() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(2);
        list.add(2);

        int sum = 0;
        for (Integer integer : list) {
            list.remove(integer);
            sum += integer;
        }
        ListIterator<Integer> iterator = list.listIterator();
        while (iterator.hasNext()) {
            Integer integer = iterator.next();
            iterator.remove();
            sum += integer;
        }

    }

    static void semFourTaskFour() {
        /*
         * Написать метод, который принимает массив эл-тов, помещает их в стэк
         * и выводит в консоль содержимое стэка. А так же помещает их в очередь и
         * выводит содержимое.
         */
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);

        ArrayDeque<Integer> queue = new ArrayDeque<>(array.length);
        for (int i = 0; i < array.length; i++) {
            queue.add(array[i]);
        }
        System.out.println(queue);
        System.out.println(queue.pop());
        System.out.println(queue);

        Queue<Integer> queue2 = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            queue2.add(array[i]);
        }
        System.out.println(queue2);
        System.out.println(queue2.poll());
        System.out.println(queue2);
    }

    static void semFourTaskFive() {
        /*
         * Реализовать стек с помощью массива.
         * Создать новый класс и свою реализацию методов.
         * size(),empty(),push(),peek(),pop()
         */

        MyStack myStack = new MyStack();
        System.out.println(myStack.size());
        for (int i = 1; i <= 10; i++) {
            myStack.push(i);
        }
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack);

    }
}