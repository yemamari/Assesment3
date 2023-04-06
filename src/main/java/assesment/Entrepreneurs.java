package assesment;

public  class Entrepreneurs extends Person{
private double revenue;
private double expenses;


    public Entrepreneurs(String name,double revenue,double expenses) {
        super(name);
        this.expenses = expenses;
        this.revenue = revenue;
    }

    @Override
    public void printPay() {
        System.out.println(revenue - expenses);
    }

    @Override
    public String toString() {
        return "Entrepreneurs{name is " + this. getName() +
                "revenue= is " + revenue +
                ", expenses= are " + expenses +
                '}';
    }
}
