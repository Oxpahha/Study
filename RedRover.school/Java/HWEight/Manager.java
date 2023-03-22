public class Manager extends BaseManager {


    @Override
    public double getSalary(int days) {
        return ((getBaseSalary()+getSalaryManager())*days);
    }

    public double getSalaryManager() {
        if(getWorkerCount()!=0){
            return (getBaseSalary()/100*3)*getWorkerCount();
        }
        return getBaseSalary();
    }

}