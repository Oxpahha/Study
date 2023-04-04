package helpers;

import org.redrover.Employee;
import org.redrover.Manager;
import org.redrover.Worker;

public class Generate {
    public static void generationEmpTestData(){
        Manager jake = new Manager();
        jake.setName("Jake","Broock");
        jake.setGender(1);
        jake.setBaseSalary(100);
        jake.setNumberOfSubordinates(12);
        Storage.one = jake;

        Manager john = new Manager();
        john.setName("John","Doe");
        john.setGender(1);
        john.setBaseSalary(100);
        john.setNumberOfSubordinates(15);
        Storage.two = john;

        Worker bill = new Worker();
        bill.setName("Billy","Kent");
        bill.setGender(2);
        bill.setBaseSalary(50);
        Storage.three = bill;

        Storage.empArray = new Employee[]{jake, john, bill};
        Storage.managerArray = new Manager[]{jake, john};
    }
}
