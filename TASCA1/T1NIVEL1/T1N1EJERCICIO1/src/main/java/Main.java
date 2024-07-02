public class Main {

    public static void main (String[] args){

        Group group = new Group();

        InstrumentWind wind = new InstrumentWind("Saxophone", 200);
        InstrumentString string = new InstrumentString("Guitar", 100);
        InstrumentString string2 = new InstrumentString("Bass", 89.99);
        InstrumentPercusion percusion = new InstrumentPercusion("Drums", 500);

        group.introInstrument(wind);
        group.introInstrument(string);
        group.introInstrument(string2);
        group.introInstrument(percusion);

        System.out.println(group);

    }
}
