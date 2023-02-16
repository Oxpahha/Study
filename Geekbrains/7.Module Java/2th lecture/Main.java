import java.util.logging.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        
    }

    static void semTwo() {

        var timer = System.currentTimeMillis();

        String str = "";
        for (int i = 0; i < 100_000; i++) {
            str+="+";
        }
        System.out.println(System.currentTimeMillis() - timer );  // 1372ms

        timer = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
//            for (int i = 0; i < 1_000_000; i++) {
//            sb.append("+");
//        }
        sb.append("+".repeat(100_000));
        System.out.println(System.currentTimeMillis() - timer );  // 3ms

        String[] name = {"С","е","р","г","е","й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("",name)); // Сергей
        System.out.println(String.join("","С","е","р","г","е","й")); // Сергей
        System.out.println(String.join(",","С","е","р","г","е","й")); // С,е,р,г,е,й
    }
    static void logg() throws IOException {
        Logger logger = Logger.getLogger(Main.class.getName());

////      Log to console
//            ConsoleHandler ch = new ConsoleHandler();
//            logger.addHandler(ch);
////        Txt format
//            //SimpleFormatter sFormat = new SimpleFormatter();
//            //ch.setFormatter(sFormat);
////        XML format
//             XMLFormatter xml = new XMLFormatter();
//             ch.setFormatter(xml);

//      Log to file
            FileHandler fh = new FileHandler("log.xml");
            logger.addHandler(fh);
//        Txt format
            // SimpleFormatter sFormat = new SimpleFormatter();
            // fh.setFormatter(sFormat);
//        XML format
            XMLFormatter xml = new XMLFormatter();
            fh.setFormatter(xml);


        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Test warn log 1");
        logger.info("Test log 2");
    }


}
