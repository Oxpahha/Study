package helpers;

import org.redrover.Employee;
import org.redrover.Manager;
import org.redrover.Worker;

public class Generate {
    public static void generationEmpTestData(){
        Manager one = new Manager();
        one.setName("Jake","Broock");
        one.setGender(1);
        one.setBaseSalary(100);
        one.setNumberOfSubordinates(12);
        Storage.jake = one;

        Manager two = new Manager();
        two.setName("John","Doe");
        two.setGender(1);
        two.setBaseSalary(100);
        two.setNumberOfSubordinates(15);
        Storage.john = two;

        Worker three = new Worker();
        three.setName("Billy","Kent");
        three.setGender(2);
        three.setBaseSalary(50);
        Storage.bill = three;

        Storage.empArray = new Employee[]{one, two, three};
        Storage.managerArray = new Manager[]{one, two};
    }
}
