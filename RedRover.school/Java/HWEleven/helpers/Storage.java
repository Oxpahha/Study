package helpers;

import org.redrover.Employee;
import org.redrover.Manager;
import org.redrover.Worker;

public class Storage {

    public static Manager jake;
    public static Manager john;
    public static Worker bill;
    public static Employee[] empArray;
    public static Manager[] managerArray;

    public static void generationEmpTestData(){
        Manager one = new Manager();
        one.setName("Jake","Broock");
        one.setGender(1);
        one.setBaseSalary(100);
        one.setNumberOfSubordinates(12);
        jake = one;

        Manager two = new Manager();
        two.setName("John","Doe");
        two.setGender(1);
        two.setBaseSalary(100);
        two.setNumberOfSubordinates(15);
        john = two;

        Worker three = new Worker();
        three.setName("Billy","Kent");
        three.setGender(2);
        three.setBaseSalary(50);
        bill = three;

        empArray = new Employee[]{jake, john, bill};
        managerArray = new Manager[]{jake, john};
    }
}
