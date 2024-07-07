public class DNICheck {
    public static void main(String[] args) {

        int num = 12345678;

        System.out.println("The correct letter for the  " + num + " document is " + getTheCorrectLetter(num));
    }

    public static char getTheCorrectLetter(int numDni) {


        char correctLetter = ' ';
        char[] letterList = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
                'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int placeCorrectLetter = numDni % 23;
        correctLetter = letterList[placeCorrectLetter];
        return correctLetter;
    }
}