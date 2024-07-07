public class Main {
    public static void main(String[] args){

        ReversedString reversedString = rs -> (new StringBuilder(rs).reverse().toString());
        System.out.println(reversedString.reversed("was it a cat i saw"));
    }
}
