import java.util.Scanner;

public class terminal {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s!", name);
        System.out.println();
        System.out.printf("int x: ");
        int x = iScanner.nextInt();
        System.out.printf("double y: ");
        boolean flag = iScanner.hasNextDouble();
        System.out.printf("double %b\n", flag);
        if (flag) {
            double y = iScanner.nextDouble();
            System.out.printf("%d + %f = %f", x, y, x+y);
            iScanner.close();
        } else {
            System.out.printf("%s, double with ',' not '.'", name);
        }
    }
}
