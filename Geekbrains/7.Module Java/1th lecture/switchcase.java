import java.util.Scanner;

public class switchcase {
    public static void main(String[] args) {
        System.out.println("enter int: ");
        Scanner iScanner = new Scanner(System.in);
        boolean flag = iScanner.hasNextInt();
        if (flag) {
            int mounth = iScanner.nextInt();
            String text = "";
            switch (mounth) {
                case 1:
                    text = "Jan";
                    break;
                case 2:
                    text = "Feb";
                    break;
                case 3:
                case 4:
                case 5:
                case 6:
                    text = "Another";
                    break;
                default:
                    text = "wrong";
                    break;
            }
            System.out.println(text);
            iScanner.close();
        } else {
            System.out.printf("Not int");
        }

    }
}
