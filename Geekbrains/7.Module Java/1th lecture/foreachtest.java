public class foreachtest {
    public static void main(String[] args) {
        int[] arr = new int[] {1,2,3,4,5,77};

        for (int item : arr) {
            System.out.println(item);    
        }
        System.out.println();
        for(int i = 0; i < arr.length; i++){
            arr[i] += 1;
        }
        for (int item : arr) {
            System.out.println(item);    
        }
    }
}
