public class array {
    public static void main(String[] args) {
        //Одномерные
        int[] arr = new int[10];
        System.out.println(arr.length);
        System.out.println(arr[3]);

        arr = new int[] {1,2,3,4,5};
        System.out.println(arr.length);
        System.out.println(arr[3]);
        System.out.println();
        //Многомерные
        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        System.out.println();

        int[][] arr3 = new int[3][5];
        for(int i = 0; i < arr3.length; i++) {
            for(int j = 0; j < arr3[i].length; j++) {
                System.out.printf("%d ", arr3[i][j]);
            }
            System.out.println();
        }
    }
}
