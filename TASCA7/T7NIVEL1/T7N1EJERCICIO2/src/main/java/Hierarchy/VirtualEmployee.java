package Hierarchy;

public class VirtualEmployee extends Employee{

    private float internetPrice;
    private static float gasPrice;

    public VirtualEmployee(String name, String surname, float pricePerHour, float internetPrice) {
        super(name, surname, pricePerHour);
        this.internetPrice = internetPrice;
    }

    public float getInternetPrice() {
        return internetPrice;
    }

    @Override
    public float calculateSalary(float hoursWorked) {
        float salary;

        salary = (hoursWorked*getPricePerHour()+internetPrice);

        return salary;
    }

    @Deprecated
    public float salaryWithGas(float hoursWorked){
        float salary;

        salary = (hoursWorked*getPricePerHour()+gasPrice);

        return salary;
    }
}
