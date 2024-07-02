public class InstrumentWind extends Instrument {

    public InstrumentWind(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("All wind instruments initialized.");
    }
    {
        System.out.println("Wind instrument ready.");
    }

    @Override
    public String play() {
        return "A wind instrument is playing.";
    }

}
