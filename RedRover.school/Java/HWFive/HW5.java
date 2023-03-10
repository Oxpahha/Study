public class HW5 {
    public static void main(String[] args) {
        // Задачи на циклы, вывести следующие строки с соответствующим форматированием (как пирамиды):
        TaskThree();

    }
    static void TaskOne(){
        /*
                Задача №1

        0  1  2  3  4  5  6  7  8  9
        0  1  2  3  4  5  6  7  8
        0  1  2  3  4  5  6  7
        0  1  2  3  4  5  6
        0  1  2  3  4  5
        0  1  2  3  4
        0  1  2  3
        0  1  2
        0  1
        0

         */

        int len = 10;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len-i; j++) {
                System.out.printf("%d  ",j);
            }
            System.out.println();
        }
    }
    static void TaskTwo(){
        /*
                Задача №2

           0  1  2  3  4  5  6  7  8  9
              0  1  2  3  4  5  6  7  8
                 0  1  2  3  4  5  6  7
                    0  1  2  3  4  5  6
                       0  1  2  3  4  5
                          0  1  2  3  4
                             0  1  2  3
                                0  1  2
                                   0  1
                                      0
         */

        int len = 10;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (j-i>=0){
                    System.out.printf("%d  ",j-i);
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
    static void TaskThree(){
        /*
                Задача №3

    9 8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8 9
      8 7 6 5 4 3 2 1 0 1 2 3 4 5 6 7 8
        7 6 5 4 3 2 1 0 1 2 3 4 5 6 7
          6 5 4 3 2 1 0 1 2 3 4 5 6
            5 4 3 2 1 0 1 2 3 4 5
              4 3 2 1 0 1 2 3 4
                3 2 1 0 1 2 3
                  2 1 0 1 2
                    1 0 1
                      0

         */

        int len = 10;
        for (int i = 0; i < len; i++) {
            for (int k = 0; k < i; k++) {
                System.out.print("  ");
            }
            for (int j = len-1; j != -1; j--) {
                if (j-i>=0){
                    System.out.printf("%d ",j-i);
                }
            }
            for (int j = 1,k = 1; j < len; j++) {
                if (j-i>0){
                    System.out.printf("%d ",k++);
                }
            }
            System.out.println();
        }
    }

}
