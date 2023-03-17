public class HW7 {
    public static void main(String[] args) {
        HW();
    }
    static void HW() {
//    Задача №1
//    Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName,
//    метод возвращает имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.

//    Задача №2
//    Необходимо создать класс Employee с полями как у Person (из предыдущего задания) и поле зарплата.
//    Класс должен иметь метод isSameName(Employee employee) который возвращает true, если у сотрудника у
//    которого был вызван метод и сотрудника который был передан как параметр, одинаковое имя.

//    Задача №3
//    Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray),
//    метод должен возвращать сумму зарплат всех сотрудников из массива переданного
//    в качестве аргумента вызова метода.

        Employee john = new Employee();
        Name name = new Name();
        Gender gender = new Gender();

        name.firstName = "John";
        name.lastName = "Doe";
        gender.type = 1;

        john.name = name;
        john.gender = gender;
        john.salary = 15000;
        System.out.println(john.getName());
        System.out.println(john.getSalary());

        Employee jane = new Employee();
        name = new Name();
        gender = new Gender();

        name.firstName = "Jane";
        name.lastName = "Doe";
        gender.type = 0;

        jane.name = name;
        jane.gender = gender;
        jane.salary = 30000;
        System.out.println(jane.getName());
        System.out.println(jane.getSalary());

        System.out.println(john.isSameName(john));
        System.out.println(john.isSameName(jane));

        Employee[] employees = {john,jane};
        Salary salary = new Salary();
        System.out.println(salary.getSum(employees));

    }
}
