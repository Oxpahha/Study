import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        
    }

    static void semSixTaskOne_HashSet(){
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234); // already exist
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(123);
        System.out.println(set); // [null, 1, 1234, 12]

        for (var item: set){
            System.out.print(item+" "); // null 1 1234 12
        }

        set.clear();
        System.out.println();
        System.out.println(set); // []
    }
    static void semSixTaskTwo_MathSet(){
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a);
            u.addAll(b);
        var r = new HashSet<Integer>(a);
            r.retainAll(b);
        var s = new HashSet<Integer>(a);
            s.removeAll(b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(u);
        System.out.println(r);
        System.out.println(s);

        boolean res = a.addAll(b);
    }
    static void semSixTaskThree_Class(){
        Worker w1 = new Worker();
        w1.firstName = "NameOne";
        w1.lastName = "lastNameOne";
        w1.salary = 155;
        w1.id = 10;

        Worker w2 = new Worker();
        w2.firstName = "NameTwo";
        w2.lastName = "lastNameOTwo";
        w2.salary = 153;
        w2.id = 11;

        Worker w3 = new Worker();
        w3.firstName = "NameOne";
        w3.salary = 155;
        w3.id = 12;

        Worker w4 = new Worker();
        w4.firstName = "NameOne";
        w4.lastName = "lastNameOne";
        w4.salary = 155;
        w4.id = 10;

        var workers = new HashSet<Worker>(Arrays.asList(w1,w1,w3));

        System.out.println(w3);

        System.out.println(w1);
        System.out.println(w4);
        System.out.println(w1.equals(w4));
        System.out.println(w1 == w4);
        System.out.println(workers.contains(w4));

        System.out.println(w4.showNameSalary());
    }

}