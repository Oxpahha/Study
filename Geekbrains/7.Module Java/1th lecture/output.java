public class output {
    public static void main(String[] args) {
        int a = 1, b = 2;
        int c = a + b;
        String res = a + " + " + b + " = " + c;
        System.out.println(res);
        String res2 = String.format("%d + %d = %d",a,b,c);
        System.out.println(res2);
        System.out.printf("%d + %d = %d\n",a,b,c);

        float pi = 3.1415f;
        System.out.printf("%f\n",pi);
        System.out.printf("%.2f\n",pi);
        System.out.printf("%.3f\n",pi);
        System.out.printf("%e\n",pi);
        System.out.printf("%.2e\n",pi);
        System.out.printf("%.3e\n",pi);
    }
}
