import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {

        taskOne();

    }

    static void taskOne(){
    /*
    1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
                                     n! (произведение чисел от 1 до n).
    */
    int n;
    int sum = 1;
    int pr = 1;
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Enter n: ");
        n = Integer.parseInt(scanner.nextLine());
    }
    for (int i = 2; i <= n; i++) {
        sum+=i;
        pr*=i;
    }

    System.out.printf("Cумма чисел от 1 до %1$d равна %2$d\n" +
                      "Произведение чисел от 1 до %1$d равно %3$d", n, sum, pr);
    }
    static void taskTwo(){
        /*
        2. Вывести все простые числа от 1 до 1000
        */
        int n = 100;
        int count = 0;
        for (int i = 2; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i%j==0){
                    count++;
                }
            }
            if(count==2){
                System.out.printf("%1$d ",i);
            }
            count = 0;
        }
    }
    static void taskThree(){
        /*
        3. Реализовать простой калькулятор
        */
        double firstNumber;
        int secondNumber;
        String operator;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите выражение. Например: 2 + 2\n");
            firstNumber = scanner.nextDouble();
            operator = scanner.next();
            secondNumber = scanner.nextInt();
        }


        System.out.printf("%1$.0f %3$s %2$d = ",firstNumber,secondNumber,operator);
        switch (operator) {
            case "+" -> System.out.println(firstNumber + secondNumber);
            case "-" -> System.out.println(firstNumber - secondNumber);
            case "/" -> {
                String form = "%1$.0f";
                double res = firstNumber / secondNumber;
                if (res % 1 != 0) {
                    form = "%1$.2f";}
                System.out.printf(form, res);
            }
            case "*" -> System.out.println(firstNumber * secondNumber);
            default -> System.out.println("Не понимаю что ты хочешь.");
        }
    }

}
