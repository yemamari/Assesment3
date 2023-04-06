package assesment;

public class SalariedEmployee extends Employees {
private double salary;

    public SalariedEmployee(String name, double salary) {
        super(name);
        this.salary = salary;
    }

    @Override
    public void printBadge() {
        System.out.println("SalariedEmployee : " + this.getName());
        System.out.println("EmployeeID : " + this.getEmployeeId());
    }

    @Override
    public void printPay() {
        System.out.println(salary);
    }
}
