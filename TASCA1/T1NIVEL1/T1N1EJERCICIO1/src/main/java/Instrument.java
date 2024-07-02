public abstract class Instrument {
    private final String name;
    private final double price;

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

    public abstract String play();

    @Override
    public String toString() {
        return "Instrument{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
