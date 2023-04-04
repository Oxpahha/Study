package org.redrover;

//        HW11
//        Создать новый Java + Maven проект
//        Добавить dependency для TestNG
//        Скопировать или создать заново код из предыдущей домашней работы (8.2) в src/main/java ветку.
//        создать тесты для методов класса EmployeeUtils

import helpers.Generate;
import helpers.Storage;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EmpTest {

    // Генерация тестовых данных.
    @BeforeTest
    public void generateData(){
        Generate.generationEmpTestData();
    }

    // Тесты
    @Test
    public void testFindEmployee(){
        Assert.assertEquals(EmpUtilities.findEmployee(Storage.empArray, "Jake Broock"), Storage.one);
    }
    @Test
    public void testFindEmployeeForNamePart(){
        Assert.assertEquals(EmpUtilities.findEmployeeForNamePart(Storage.empArray, "Billy"),Storage.three);
    }
    @Test
    public void testCalculateAllSalary(){
        Assert.assertEquals(EmpUtilities.calculateAllSalary(Storage.empArray, 10), 3310.0);
    }
    @Test
    void testFindLowestSalary(){
        Assert.assertEquals(EmpUtilities.findLowestSalary(Storage.empArray, 10), 500.0);
    }
    @Test
    void testFindMaxSalary(){
        Assert.assertEquals(EmpUtilities.findMaxSalary(Storage.empArray,10),1450.0);
    }
    @Test
    void testFindMinBonusForManagers(){
        Assert.assertEquals(EmpUtilities.findMaxSubsForManagers(Storage.managerArray),15.0);
    }
    @Test
    void testFindMaxBonusForManagers(){
        Assert.assertEquals(EmpUtilities.findMaxBonusForManagers(Storage.managerArray),45.0);
    }
    @Test
    void testFindMaxSubsForManagers(){
        Assert.assertEquals(EmpUtilities.findMaxSubsForManagers(Storage.managerArray),15);
    }

    @AfterTest
    public void clearData(){
        Storage.clearEmpTest();
    }
}
