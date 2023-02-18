public class HomeWork {
    public static void main(String[] args) {
        
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
    static void semTwoTaskOneHW() {
        /*
        1. Реализуйте алгоритм сортировки пузырьком числового массива,
           результат после каждой итерации запишите в лог-файл.
        */

        int[] arrNum = {4, 2, 7, 3, 2, 8, 6, 4, 0, 3, 5, 1, 5};

        int temp = -1;
        for (int i = 0; i < arrNum.length; i++) {
            for (int j = 0; j < arrNum.length; j++) {
                if (arrNum[i] < arrNum[j]) {
                    temp = arrNum[i];
                    arrNum[i] = arrNum[j];
                    arrNum[j] = temp;
                }
            }
            wrtTxt(Arrays.toString(arrNum), "semTwoTaskOneHW.txt");
        }
    }
    static void semTwoTaskTwoHW() {
        /*
        2. К калькулятору из предыдущего дз добавить логирование.
        */

        String path = "semTwoTaskTwoHW.txt";
        double firstNumber = -1;
        int secondNumber = -1;
        String operator = "";
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите выражение. Например: 2 + 2\n");
            firstNumber = scanner.nextDouble();
            wrtTxt("First input: " + firstNumber, path);
            operator = scanner.next();
            wrtTxt("Operator input: " + operator, path);
            secondNumber = scanner.nextInt();
            wrtTxt("Second input: " + secondNumber, path);
        } catch (Exception e) {
            wrtTxt(Arrays.toString(new Exception[]{e}), path);
        }
        if (firstNumber != -1 && secondNumber != -1) {
            try {
                System.out.printf("%1$.0f %3$s %2$d = ", firstNumber, secondNumber, operator);
                switch (operator) {
                    case "+" -> {
                        double res = firstNumber + secondNumber;
                        System.out.println(res);
                        wrtTxt("Result: " + res, path);
                    }
                    case "-" -> {
                        double res = firstNumber - secondNumber;
                        System.out.println(res);
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
                        System.out.println(res);
                        wrtTxt("Result: " + res, path);
                    }
                    default -> {
                        wrtTxt("Result: Неверный оператор " + operator, path);
                        System.out.println("Неверный оператор");
                    }
                }
            } catch (Exception e){
                wrtTxt(Arrays.toString(new Exception[]{e}), path);
            }
        } else {
            System.out.println("Введенные переменные или оператор неверны.");
            wrtTxt("Введенные переменные или оператор неверны.", path);
        }
    }

}
