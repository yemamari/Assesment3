package assesment;

public class HourlyEmployees extends Employees {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployees(String name,double hoursWorked,double hourlyRate) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public void printPay() {
        System.out.println(hourlyRate * hoursWorked);
    }


    @Override
    public void printBadge() {
        System.out.println("HourlyEmployee : " + this.getName());
        System.out.println("EmployeeID : "+ this.getEmployeeId());
    }
}










