public class Salary {
    int sum=0;

    int getSum(Employee[] employeeArray){
        for (Employee employee: employeeArray) {
            sum+=employee.salary;
        }
        return sum;
    }
}
