import java.io.FileWriter;
import java.util.*;
import java.util.logging.*;

public class HomeWork {
    public static void main(String[] args) {
        semFourTaskTwoHW();
    }
    static void semFourTaskOneHW() {
        /*
        1. Пусть дан LinkedList с несколькими элементами.
        Реализуйте метод, который вернет “перевернутый” список.
        */
        Object[] array = new Object[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        LinkedList<Object> linkedList = new LinkedList<>();
        linkedList.addAll(Arrays.asList(array));
        System.out.println(linkedList);
        System.out.println(reversi(linkedList));

    }

    static LinkedList<Object> reversi(LinkedList<Object> linkedList) {
        LinkedList<Object> reversLL = new LinkedList<>();

        ListIterator<Object> iterator = linkedList.listIterator();
        while (iterator.hasNext()) {
            Object cell = iterator.next();
        }
        while (iterator.hasPrevious()) {
            Object cell = iterator.previous();
            reversLL.add(cell);
        }
//        System.out.println(reversLL);
        return reversLL;
    }

    static void semFourTaskTwoHW() {
        /*
        2. Реализуйте очередь с помощью LinkedList со следующими методами:
        enqueue() - помещает элемент в конец очереди,
        dequeue() - возвращает первый элемент из очереди и удаляет его,
        first() - возвращает первый элемент из очереди, не удаляя.
        */

        MyQueue myQueue = new MyQueue();
        for (int i = 1; i < 11; i++) {
            myQueue.enqueue(i);
        }
        System.out.println(myQueue.first());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.first());
    }

    static void semFourTaskThreeHW() {
        /*
        3. В калькулятор добавьте возможность отменить последнюю операцию.
        */
        String path = "semTwoTaskTwoHW.txt";
        double firstNumber = -1;
        int secondNumber = -1;
        String operator = "";

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите выражение. Введите back чтобы отменить последний ввод.");
            for (int i = 0; i < 4; i++) {
                switch (i) {
                    case 0:
                        System.out.println("Первый операнд:");
                        firstNumber = scanner.nextDouble();
                        wrtTxt("First input: " + firstNumber, path);
                        break;
                    case 1:
                        System.out.println("Оператор:");
                        operator = scanner.next();
                        if (operator.equals("back")){
                            i=-1;
                            break;
                        }
                        wrtTxt("Operator input: " + operator, path);
                        break;
                    case 2:
                        System.out.println("Второй операнд:");
                            String opr = scanner.next();
                            if (opr.equals("back")){
                                i=0;
                            } else {
                                try {
                                secondNumber = Integer.parseInt(opr);
                                wrtTxt("Second input: " + secondNumber, path);
                                } catch (Exception a){
                                    wrtTxt("Второй операнд: Неверный ввод" + operator, path);
                                }
                            }
                        break;
                    case 3:
                        if (firstNumber != -1 && secondNumber != -1) {
                            try {
                                System.out.printf("%1$.0f %3$s %2$d = ", firstNumber, secondNumber, operator);
                                switch (operator) {
                                    case "+" -> {
                                        double res = firstNumber + secondNumber;
                                        System.out.printf("%1$.0f", res);
                                        wrtTxt("Result: " + res, path);
                                    }
                                    case "-" -> {
                                        double res = firstNumber - secondNumber;
                                        System.out.printf("%1$.0f", res);
                                        wrtTxt("Result: " + res, path);
                                    }
                                    case "/" -> {
                                        String form = "%1$.0f";
                                        double res = firstNumber / secondNumber;
                                        if (res % 1 != 0) {
                                            form = "%1$.2f";
                                        }
                                        System.out.printf(form, res);
                                        wrtTxt("Result: " + res, path);
                                    }
                                    case "*" -> {
                                        double res = firstNumber * secondNumber;
                                        System.out.printf("%1$.0f", res);
                                        wrtTxt("Result: " + res, path);
                                    }
                                    default -> {
                                        wrtTxt("Result: Неверный оператор " + operator, path);
                                        System.out.println("Неверный оператор");
                                    }
                                }

                            } catch (Exception e) {
                                wrtTxt(Arrays.toString(new Exception[]{e}), path);
                            }
                        } else {
                            System.out.println("Введенные переменные или оператор неверны.");
                            wrtTxt("Введенные переменные или оператор неверны.", path);
                        }
                }
            }
        } catch (Exception e) {
            wrtTxt(Arrays.toString(new Exception[]{e}), path);
        }
    }
    static void wrtTxt(String str, String filePath) {

        Logger logger = Logger.getAnonymousLogger();

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(str);
            fileWriter.write("\n");
        } catch (Exception e) {
            logger.log(Level.WARNING, e.getMessage());
            e.printStackTrace();
        }
    }
}
    
