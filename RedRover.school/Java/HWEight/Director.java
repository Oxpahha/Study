public class Director extends BaseManager{

    @Override
    public double getSalary(int days) {
        return ((getBaseSalary()+getSalaryDirector())*days);
    }

    public double getSalaryDirector() {
        if(getWorkerCount()!=0){
            return (getBaseSalary()/100*9)*getWorkerCount();
        }
        return getBaseSalary();
    }
}
