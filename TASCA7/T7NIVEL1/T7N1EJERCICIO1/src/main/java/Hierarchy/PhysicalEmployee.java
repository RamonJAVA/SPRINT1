package Hierarchy;

public class PhysicalEmployee extends Employee{

    private static float gasPrice;

    public PhysicalEmployee(String name, String surname, float pricePerHour, float gasPrice) {
        super(name, surname, pricePerHour);
        this.gasPrice = gasPrice;
    }

    public static float getGasPrice() {
        return gasPrice;
    }

    @Override
    public float calculateSalary(float hoursWorked) {
        float salary;

        salary = (hoursWorked*getPricePerHour()+gasPrice);

        return salary;
    }
}
