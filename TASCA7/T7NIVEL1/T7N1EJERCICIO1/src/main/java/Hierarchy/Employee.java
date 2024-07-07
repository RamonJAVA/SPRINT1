package Hierarchy;

public abstract class Employee {
    private String name;
    private String surname;
    private float pricePerHour;

    public Employee(String name, String surname, float pricePerHour) {
        this.name = name;
        this.surname = surname;
        this.pricePerHour = pricePerHour;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public float getPricePerHour() {
        return pricePerHour;
    }

    public abstract float calculateSalary(float hoursWorked);

    @Override
    public String toString() {
        return "Hierarchy.Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", pricePerHour=" + pricePerHour +
                '}';
    }
}
