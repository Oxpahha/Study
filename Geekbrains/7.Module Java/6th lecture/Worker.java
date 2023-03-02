import java.util.Objects;

public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id == worker.id
                && salary == worker.salary
                && firstName.equals(worker.firstName)
                && lastName.equals(worker.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, salary, firstName, lastName);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", salary=" + salary +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
    public String showNameSalary() {
        return "Worker{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
