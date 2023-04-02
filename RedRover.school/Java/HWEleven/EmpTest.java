package org.redrover;
//        HW11
//        Создать новый Java + Maven проект
//        Добавить dependency для TestNG
//        Скопировать или создать заново код из предыдущей домашней работы (8.2) в src/main/java ветку.
//        создать тесты для методов класса EmployeeUtils

import org.testng.Assert;
import org.testng.annotations.Test;

public class EmpTest {

    // Генерация тестовых данных.
    private Manager jake,john;
    private Worker bill;
    private Employee[] empArray;
    private Manager[] managerArray;
    @Test
    public void generationTestData(){
        Manager jake = new Manager();
        jake.setName("Jake","Broock");
        jake.setGender(1);
        jake.setBaseSalary(100);
        jake.setNumberOfSubordinates(12);
        this.jake = jake;

        Manager john = new Manager();
        john.setName("John","Doe");
        john.setGender(1);
        john.setBaseSalary(100);
        john.setNumberOfSubordinates(15);
        this.john = john;

        Worker bill = new Worker();
        bill.setName("Billy","Kent");
        bill.setGender(2);
        bill.setBaseSalary(50);
        this.bill = bill;

        this.empArray = new Employee[]{jake, john, bill};
        this.managerArray = new Manager[]{jake, john};
    }

    // Тесты
    @Test
    public void testFindEmployee(){
        Assert.assertEquals(EmpUtilities.findEmployee(empArray, "Jake Broock"), jake);
    }
    @Test
    public void testFindEmployeeForNamePart(){
        Assert.assertEquals(EmpUtilities.findEmployeeForNamePart(empArray, "Billy"),bill);
    }
    @Test
    public void testCalculateAllSalary(){
        Assert.assertEquals(EmpUtilities.calculateAllSalary(empArray, 10), 3310.0);
    }
    @Test
    void testFindLowestSalary(){
        Assert.assertEquals(EmpUtilities.findLowestSalary(empArray, 10), 500.0);
    }
    @Test
    void testFindMaxSalary(){
        Assert.assertEquals(EmpUtilities.findMaxSalary(empArray,10),1450.0);
    }
    @Test
    void testFindMinBonusForManagers(){
        Assert.assertEquals(EmpUtilities.findMaxSubsForManagers(managerArray),15.0);
    }
    @Test
    void testFindMaxBonusForManagers(){
        Assert.assertEquals(EmpUtilities.findMaxBonusForManagers(managerArray),45.0);
    }
    @Test
    void testFindMaxSubsForManagers(){
        Assert.assertEquals(EmpUtilities.findMaxSubsForManagers(managerArray),15);
    }
}
