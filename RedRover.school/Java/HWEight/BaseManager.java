public class BaseManager extends Employee{
    private int workerCount;


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
}
