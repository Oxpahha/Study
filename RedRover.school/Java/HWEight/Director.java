public class Director extends Manager{
    private int employeeRate = 9;

    @Override
    public double getSalary(int days) {
        return ((getBaseSalary()+getSalaryDirector())*days);
    }

    public double getSalaryDirector() {
        if(getWorkerCount()!=0){
            return (getBaseSalary()/100*employeeRate)*getWorkerCount();
        }
        return getBaseSalary();
    }
}
