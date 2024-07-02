public class Car {
    private static final String brand = "Mercedes";
    private static String model;
    private final int power;

    public Car(String brand, String model, int power) {
        this.model = model;
        this.power = power;
    }

    public static String getBrand() {
        return brand;
    }

    public static String getModel() {
        return model;
    }

    public int getPower() {
        return power;
    }

    public static String brake() {
        return("The Car is braking.");
    }

    public String accelerate() {
        return("The car is accelerating.");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                "model=" + model +
                "power=" + power +
                '}';
    }
}
