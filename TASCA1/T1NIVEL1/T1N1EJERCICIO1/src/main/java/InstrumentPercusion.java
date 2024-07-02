public class InstrumentPercusion extends Instrument{

    public InstrumentPercusion(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("All percusion instruments initialized.");
    }
    {
        System.out.println("Percusion instrument ready.");
    }

    @Override
    public String play() {
        return "A percusion instrument is playing.";
    }

}
