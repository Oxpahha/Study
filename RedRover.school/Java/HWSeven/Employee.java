public class Employee {
    Name name;
    Gender gender;
    int age;
    int salary;

    Boolean isSameName(Employee employee){
        return employee.name.equals(name);
    }
    String getName(){
        return (gender.getGender() + name.getFullName());
    }
    String getFullInfo(){
        return ("Name: " + name.getFullName() + ", Age: " + age);
    }
    String getSalary(){
        return ("$"+ salary);
    }
}
