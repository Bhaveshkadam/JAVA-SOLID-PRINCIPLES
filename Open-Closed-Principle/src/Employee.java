abstract public class Employee {

    private int id;
    private String name;
    private String location;
    private boolean working;


    public Employee(int id, String name, String dept, boolean working) {
        this.id = id;
        this.name = name;
        this.location = dept;
        this.working = working;
    }

    public abstract void performDuties();

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + location + '\'' +
                ", working=" + working +
                '}';
    }
}
