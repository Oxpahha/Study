public class Manager extends Employee {
    private int workerCount;
    private int employeeRate = 3;

    public int getNumberOfSubordinates() {
        return workerCount;
    }
    public void setNumberOfSubordinates(int workerCount) {
        this.workerCount = workerCount;
    }

    public int getWorkerCount() {
        return workerCount;
    }

    public void setWorkerCount(int workerCount) {
        this.workerCount = workerCount;
    }

    @Override
    public double getSalary(int days) {
        return ((getBaseSalary()+getSalaryManager())*days);
    }

    public double getSalaryManager() {
        if(workerCount!=0){
            return (getBaseSalary()/100*employeeRate)*workerCount;
        }
        return getBaseSalary();
    }

}