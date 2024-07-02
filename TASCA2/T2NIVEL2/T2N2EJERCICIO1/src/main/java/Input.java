import java.util.InputMismatchException;
import java.util.Scanner;

public class Input extends Exception {
    private static Scanner sc = new Scanner(System.in);

    private static byte numberByte;
    private static int numberInt;
    private static float numberFloat;
    private static double numberDouble;
    private static String character;
    private static String string;
    private static boolean binary;

    public static byte inputByte(String statement) {
        boolean isItAByte = false;

        do {
            try {
                System.out.println(statement);
                numberByte = sc.nextByte();
                System.out.println("Correct" + "\n");
                isItAByte = true;
            } catch (InputMismatchException ime) {
                System.out.println("Wrong. The byte data type can store whole numbers from -128 to 127." + "\n");
            }
            sc.nextLine();
        } while (isItAByte == false);
        System.out.print("Your byte -> ");
        return numberByte;
    }

    public static int inputInt(String statement) {
        boolean isItAnInt = false;

        do {
            try {
                System.out.println(statement);
                numberInt = sc.nextInt();
                System.out.println("Correct" + "\n");
                isItAnInt = true;
            } catch (InputMismatchException ime) {
                System.out.println(
                        "Wrong. The int data type can store whole numbers from -2147483648 to 2147483647." + "\n");
            }
            sc.nextLine();
        } while (isItAnInt == false);
        System.out.print("Your integer -> ");
        return numberInt;
    }

    public static float inputFloat(String statement) {
        boolean isItAFloat = false;

        do {
            try {
                System.out.println(statement);
                numberFloat = sc.nextFloat();
                System.out.println("Correct" + "\n");
                isItAFloat = true;
            } catch (InputMismatchException ime) {
                System.out.println(
                        "Wrong. The float data types can store fractional numbers such as 9,99 or 3,14515" + "\n");
            }
            sc.nextLine();
        } while (isItAFloat == false);
        System.out.print("Your float -> ");
        return numberFloat;
    }

    public static double inputDouble(String statement) {
        boolean isItADouble = false;

        do {
            try {
                System.out.println(statement);
                numberDouble = sc.nextDouble();
                System.out.println("Correct" + "\n");
                isItADouble = true;
            } catch (InputMismatchException ime) {
                System.out.println(
                        "Wrong. The double variables can store fractional numbers with a precision of about 15 digits"
                                + "\n");
            }
            sc.nextLine();
        } while (isItADouble == false);
        System.out.print("Your double -> ");
        return numberDouble;
    }

    public static String inputCharacter(String statement) {
        boolean isItAChar = false;

        do {
            try {
                System.out.println(statement);
                character = sc.next();
                if (character.length() > 0 && character.length() < 2) {
                    System.out.println("Correct" + "\n");
                    isItAChar = true;
                } else {
                    System.out.println("Wrong. ONE character.");
                }

            } catch (InputMismatchException ime) {
                System.out.println("Wrong. The char variable stores a single character." + "\n");
            }
            sc.nextLine();
        } while (isItAChar == false);
        System.out.print("Your character -> ");
        return character;
    }

    public static String inputString(String statement) {
        boolean isItAString = false;

        do {
            try {
                System.out.println(statement);
                string = sc.next();
                System.out.println("Correct" + "\n");
                isItAString = true;
            } catch (InputMismatchException ime) {
                System.out.println("How did you get it wrong?" + "\n");
            }
            sc.nextLine();
        } while (isItAString == false);
        System.out.print("Your string -> ");
        return string;
    }

    public static boolean inputBoolean(String statement) {
        boolean isItABoolean = false;
        char check;

        do {
            try {
                System.out.println(statement);
                check = sc.next().toUpperCase().charAt(0);
                if (binary = String.valueOf(check).equals("Y")) {
                    System.out.println("Congratulations.");
                    isItABoolean = true;

                }else if (binary = String.valueOf(check).equals("N")) {
                    System.out.println("Yes you do...");
                    isItABoolean = true;

                }else {
                    System.out.println("I guess you don't...");
                    isItABoolean = false;

                }

            } catch (Exception e) {
                System.out.println(
                        "A boolean type is declared with the boolean keyword and can only take the values true or false."
                                + "\n");
            }
            sc.nextLine();
        } while (isItABoolean = false);
        System.out.print("Your string -> ");
        return binary;
    }
}