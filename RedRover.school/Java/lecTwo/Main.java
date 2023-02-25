public class Main {
    public static void main(String[] args) {
        smile();

    }
    
    static void smile(){
        /*
        Вывести/напечатать смайлик (не :), а настоящий смайлик одним символом).
         */

        //U+1F642
        //0xD83D 0xDE42
        // \uD83D\uDE42\
       String smile = "\uD83D\uDE42";
                System.out.println(smile);
    }
}