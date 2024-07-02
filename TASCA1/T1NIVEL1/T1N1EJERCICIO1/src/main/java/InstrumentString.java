public class InstrumentString extends Instrument{

    public InstrumentString(String name, double price) {
        super(name, price);
    }

    static {
        System.out.println("All string instruments initialized.");
    }
    {
        System.out.println("String instrument ready.");
    }

    @Override
    public String play() {
        return "A string instrument is playing.";
    }

}
