import java.io.*;

public class SerializeDeserialize {
    public static void serializeCat(Cat cat) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("cat.dat"))) {

            oos.writeObject(cat);

        } catch (Exception e) {
            System.err.println();
            ;
        }
    }

    public static void deserializeCat() {

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cat.dat"))) {

            Cat cat = (Cat) ois.readObject();

            System.out.println(cat.toString());

        } catch (Exception e) {
            System.err.println();

        }
    }
}
