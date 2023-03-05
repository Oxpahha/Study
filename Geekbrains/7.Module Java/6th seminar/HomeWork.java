import java.util.*;

/*
    1. Подумать над структурой класса Ноутбук для магазина техники
       выделить поля и методы. Реализовать в java.
    2. Создать множество ноутбуков.

    3. Написать метод, который будет запрашивать у пользователя
       критерий (или критерии) фильтрации и выведет ноутбуки,
       отвечающие фильтру. Критерии фильтрации можно хранить в Map.
       Например: Введите цифру, соответствующую необходимому критерию:
        1 - ОЗУ
        2 - Объем ЖД
        3 - Операционная система
        4 - Цвет

    1. Далее нужно запросить минимальные значения для указанных
       критериев - сохранить параметры фильтрации можно также в Map.
    2. Отфильтровать ноутбуки их первоначального множества и
       вывести проходящие по условиям.
     */
public class LastHW {
    public static void main(String[] args) {
        Set<Notebook> notebooks = new HashSet<Notebook>();

        for (int i = 0; i < 300; i++) {
            notebooks.add(noteGenerator());
        }

        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> query = new HashMap<>();
        Integer[] queryItem = new Integer[]{1,2,3,4,5,6};

        System.out.println("Hello there! I could help u to choose NoteBook!\n");

        for (int e: queryItem) {
            String temp;
            switch (e){
                case 1 : {
                    System.out.println("Do u want specific Company name?\n" +
                            "We cold offer u:" +
                            "\n  Sunsong\n  LD\n  Lenobo\n  Dhilips\n  Caser\n  Mak\n"+
                            "Type \"n\" for skip.");
                    temp = scanner.nextLine();
                    if (temp.equals("n")) {
                        query.put(e,"null");
                    } else {
                        query.put(e,temp);
                    }
                    continue;
                }
                case 2 : {
                    System.out.println("Do u want add upper price limit?\n" +
                            "Type \"n\" for skip.");
                    temp = scanner.nextLine();
                    if (temp.equals("n")) {
                        query.put(e,"null");
                    } else {
                        query.put(e,temp);
                    }
                    continue;
                }
                case 3 :{
                    System.out.println("Any preferred Ram capacity in Gb?\n" +
                            "Type \"n\" for skip.");
                    temp = scanner.nextLine();
                    if (temp.equals("n")) {
                        query.put(e,"null");
                    } else {
                        query.put(e,temp);
                    }
                    continue;
                }
                case 4 :{
                    System.out.println("Any preferred HDD capacity in Mb?\n" +
                            "Type \"n\" for skip.");
                    temp = scanner.nextLine();
                    if (temp.equals("n")) {
                        query.put(e,"null");
                    } else {
                        query.put(e,temp);
                    }
                    continue;
                }
                case 5 :{
                    System.out.println("Do u want specific Operational system?\n" +
                            "We cold offer u:" +
                            "\n  Doors\n  MakOS\n  Binux\n  For empty System type No\n"+
                            "Type \"n\" for skip.");
                    temp = scanner.nextLine();
                    if (temp.equals("n")) {
                        query.put(e,"null");
                    } else {
                        query.put(e,temp);
                    }
                    continue;
                }
                case 6 :{
                    System.out.println("Do u want specific Color?\n" +
                            "We cold offer u:" +
                            "\n  White\n  Black\n  Purple\n  Brown\n  Red\n  Green\n"+
                            "Type \"n\" for skip.");
                    temp = scanner.nextLine();
                    if (temp.equals("n")) {
                        query.put(e,"null");
                    } else {
                        query.put(e,temp);
                    }
                }
                continue;
            }
        }
        System.out.println("So we try to find for u:");
        query.forEach((key,value)-> {
            if (!value.equals("null")){
                switch (key){
                    case 1 : {
                        System.out.print(value+", ");
                        break;
                    }
                    case 2 : {
                        System.out.printf("lower then %srub, ", value);
                        break;
                    }
                    case 3 : {
                        System.out.printf("more then %sGb Ram, ", value);
                        break;
                    }
                    case 4 : {
                        System.out.printf("more then %sMb HDD, ", value);
                        break;
                    }
                    case 5 : {
                        System.out.printf("with %s Operational System, ", value);
                        break;
                    }
                    case 6 : {
                        System.out.printf("in %s color.", value);
                        break;
                    }
                }
            }
        });
        System.out.println("\n");
        for (Notebook element:notebooks) {
            if ((query.get(1).equals("null") || element.name.equals(query.get(1)))               &&
                (query.get(2).equals("null") || element.price <= Integer.parseInt(query.get(2))) &&
                (query.get(3).equals("null") || element.ram >= Integer.parseInt(query.get(3)))   &&
                (query.get(4).equals("null") || element.hdd >= Integer.parseInt(query.get(4)))   &&
                (query.get(5).equals("null") || element.opSys.equals(query.get(5)))              &&
                (query.get(6).equals("null") || element.color.equals(query.get(6))))             {
                    System.out.println(element);
            }
        }
    }

   public static Notebook noteGenerator(){
       Random random = new Random();
       Notebook notebook = new Notebook();

       String[] name  = new String[]{"Sunsong","LD","Lenobo","Dhilips","Caser","Mak"};
       int price      = random.nextInt(10_000,150_000);
       int[] ram      = new int[]{8,16,32};
       int[] hdd      = new int[]{512, 1000, 2000, 5000};
       String[] opSys = new String[]{"Doors","MakOS","Binux","No"};
       String[] color = new String[]{"White","Black","Purple","Brown","Red","Green"};

       notebook.name  = name[random.nextInt(0, name.length)];
       notebook.price = price;
       notebook.ram   = ram[random.nextInt(0, ram.length)];
       notebook.hdd   = hdd[random.nextInt(0, hdd.length)];
       notebook.opSys = opSys[random.nextInt(0, opSys.length)];
       notebook.color = color[random.nextInt(0, color.length)];

       return notebook;
    }

}
