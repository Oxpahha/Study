public class Les7 {
    public static void main(String[] args) {
        Worker worker = new Worker();
        worker.setName("John Doe");
        worker.setAge(54);
        worker.setSalary(10_000);

        System.out.println(worker.getName());
        System.out.println(worker.getSalary());
    }
}
