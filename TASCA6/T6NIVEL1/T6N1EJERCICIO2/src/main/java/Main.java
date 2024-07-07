public class Main {
    public static void main(String[] args){
        String height = "5 feet";
        String city = "Bedrock";
        Person person = new Person ("Fred", "Flinstone", 44);

        GenericMethods.genericMethod(city, person, height);
    }
}
