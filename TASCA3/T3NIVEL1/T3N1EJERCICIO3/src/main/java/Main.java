import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        String name;
        int points = 0;

        ReaderWriter.reader();
        name = getName();
        points = game();
        ReaderWriter.writer(name, points);
    }

    public static String getName() {
        String name;
        System.out.println("What's your name?");
        name = scan.nextLine();
        System.out.println("Let's test your knowledge.\n");
        return name;
    }

    public static Integer game() {
        String capitalCheck;
        int points = 0, rounds = 10;
        boolean check;

        for(int i = 0; i < rounds; i++) {
            String countryCheck = ReaderWriter.randomCountry();
            System.out.println("Capital of " + countryCheck + "?");
            capitalCheck = scan.nextLine();
            check = ReaderWriter.checkIfCorrect(capitalCheck,countryCheck);
            if(check == true) {
                System.out.println("Correct!");
                points++;

            }else{
                System.out.println("Wrong\n");

            }
        }
        System.out.println("We're finished!\n"
                + "You've gotten " + points +  " correct answers.");
        return points;
    }
}
