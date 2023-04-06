package assesment;

public abstract class Employees extends Person{
private int employeeId;
private static int uniqueId = 0;


    public Employees(String name) {
        super(name);
        employeeId = ++ uniqueId;
    }

    public int getEmployeeId() {
        return this.employeeId;
    }

    public abstract void printBadge();




}
