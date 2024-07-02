import java.util.ArrayList;

public class Group {
    private ArrayList<Instrument> instruments;

    public Group() {
        this.instruments = new ArrayList<>();
    }

    public void introInstrument(Instrument instrument){
        instruments.add(instrument);
    }

    @Override
    public String toString() {
        return "Group{" +
                "instruments=" + instruments +
                '}';
    }
}
