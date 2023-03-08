public class cont { 
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0) {
                    break;
                }
                System.out.println(j);
            }
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }

}
