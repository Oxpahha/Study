public class Employee  {
    private Name name;
    private Gender gender;
    private int age;
    private double salary;

    public void setName(String firstName, String secondName) {
        this.name = new Name(firstName,secondName);
    }
    public void setGender(int type) {
        this.gender = new Gender(type);
    }
    String getName(){
        return name.getFullName();
    }
    String getFullName(){
        return (gender.getGender() + name.getFullName());
    }
    Boolean isSameName(Employee employee){
        return employee.name.equals(name);
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
    public Gender getGender() {
        return gender;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setBaseSalary(double salary){
        this.salary = salary;
    }
    public double getBaseSalary(){
      return this.salary;
    }

    public double getSalary(int days) {
        return salary*days;
    }
    public String getFullInfo(){
        return ("Name: " + name.getFullName() + ", Age: " + age);
    }


}
