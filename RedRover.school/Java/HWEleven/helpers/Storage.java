package helpers;

import org.redrover.Employee;
import org.redrover.Manager;

public class Storage {
    public static Object one;
    public static Object two;
    public static Object three;
    public static Employee[] empArray;
    public static Manager[] managerArray;

    public static void clearEmpTest() {
        Storage.one = null;
        Storage.two = null;
        Storage.three = null;
        Storage.empArray = null;
        Storage.managerArray = null;
    }

}
