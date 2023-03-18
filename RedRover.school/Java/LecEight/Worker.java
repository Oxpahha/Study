public class Worker extends Person{
    private int salary;


    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return ((int)(salary+salary/(getAge()*0.1)));
    }


}
