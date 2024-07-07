public class Main {
    public static void main(String[] args){

        PiValue piValue = () -> 3.141;
        double check = piValue.getPiValue();

        System.out.println(check);

    }
}
