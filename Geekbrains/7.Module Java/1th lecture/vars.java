public class vars {
    public static void main(String[] args) {
        String a;
        a = "Oh, ";

        String b = "hi Mark";

        String c = "";
        c += "!";

        char ch = '{';
        char ch_2 = 123;

        short number = 1;
        int number_2 = 123456789;
        float e = 12.37f;
        double pi = 3.1415;

        var number_3 = 321;

        System.out.println(a+b+c);
        System.out.println(ch);
        System.out.println(ch_2);
        System.out.println(number);
        System.out.println(number_2);
        System.out.println(e);
        System.out.println(pi);

        String str = "qwe1";
        boolean b_false = str.length() >= 5  && str.charAt(4) == '1';
        // boolean b_error  = str.length() >= 5  & str.charAt(4) == '1'; 

        System.out.println(b_false);
        System.out.println(b.charAt(number));
        System.out.println(getType(number_3));  
    }
    static String getType(Object o){
        return o.getClass().getSimpleName();
    }
}
