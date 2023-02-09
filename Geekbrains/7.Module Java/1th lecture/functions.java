public class functions {
    static void sayHello() {
        System.out.println("Hello!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1)
            return 1;
        return n * factor(n - 1);
    }

    static void tern(int a, int b) {
        int min = a < b ? a : b;
        System.out.println(min);
    }


    public static void main(String[] args) {
        sayHello();
        System.out.println(sum(1, 3));
        System.out.println(factor(5));
        tern(1, 2);

    }
}
