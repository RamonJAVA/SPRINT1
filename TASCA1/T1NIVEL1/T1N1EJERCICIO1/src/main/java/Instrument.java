public abstract class Instrument {
    private String name;
    private double price;

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    static {
        System.out.println("All instruments initialized");
    }
    {
        System.out.println("Instrument ready");
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
