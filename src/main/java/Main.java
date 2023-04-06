import assesment.Entrepreneurs;
import assesment.HourlyEmployees;
import assesment.SalariedEmployee;

public class Main {
    public static void main(String[] args) {
        HourlyEmployees hourlyEmployees = new HourlyEmployees("Yema", 25.00, 50.00);
        SalariedEmployee salariedEmployee = new SalariedEmployee("Yema",300000 );
        Entrepreneurs entrepreneurs = new Entrepreneurs("Mariama",400000, 20.00);
        hourlyEmployees.printPay();
        salariedEmployee.printPay();
        System.out.println(entrepreneurs.toString());
        }



    }

