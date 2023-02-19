import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.*;

public class Main {
    static void lecThree_object(){
        Object o = 1; GetType(o);
        o = 1.2; GetType(o);

        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2.4));
        System.out.println(Sum(1.4,2));
        System.out.println(Sum(1.3,2.4));
    }
    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
    static Object Sum(Object a, Object b){
        if (a instanceof Double && b instanceof  Double){
            return (Object) ((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object) ((Integer)a + (Integer) b);
        } else return 0;
    }
    static void lecThree_ArrayList(){
        ArrayList <Integer> list = new ArrayList<Integer>();
        list.add(2809);
        list.add(213);
        list.add(321);
        list.remove(1);
        ArrayList listTwo = new ArrayList();
        listTwo.add(32432);
        listTwo.add("asdsa");

        for (Object o : list){
            System.out.println(o);
        }
        for (Object o : listTwo){
            System.out.println(o);
        }

        ArrayList <Integer> list1 = new ArrayList<Integer>();
        ArrayList <Integer> list2 = new ArrayList<>();
        ArrayList <Integer> list3 = new ArrayList<>(10);
        ArrayList <Integer> list4 = new ArrayList<Integer>(list3);

    }
    static void lecThree_ArrayMethods(){
        int day =29;
        int month = 9;
        int  year = 1990;

        Integer[] date = {day, month, year};
        List<Integer> d = Arrays.asList(date);

        System.out.println(d);
    }
    static void lecThree_ArraysMethods(){
        StringBuilder day = new StringBuilder("29");
        StringBuilder month = new StringBuilder("6");
        StringBuilder year = new StringBuilder("1990");

        StringBuilder[] date = new StringBuilder[]{day, month, year};
        List<StringBuilder> d = Arrays.asList(date);

        System.out.println(d); // [29, 6, 1990]

        date[1] = new StringBuilder("11");
        System.out.println(d); // [29, 11, 1990]
    }
    static void lecThree_Iterator(){
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (int item : list){
            System.out.println(item);
        }
        Iterator<Integer> col = list.iterator();
        System.out.println();

        while (col.hasNext()){
            System.out.println(col.next());
        }
    }
}