public class Main {
    public static void main(String[] args){

        Cat cat = new Cat("Garfield", "Orange");

        SerializeDeserialize.serializeCat(cat);
        SerializeDeserialize.deserializeCat();

    }
}
