import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int phoneNumber;

        Smartphone smartphone = new Smartphone("iPhone", "12");

//		Phone phone = new Phone("Nokia", "3310");

        System.out.println("What number are we calling?:");
        phoneNumber = sc.nextInt();

        System.out.println(smartphone.call(phoneNumber) + "\n");
        System.out.println(smartphone.alarm() + "\n");
        System.out.println(smartphone.takePicture());

    }

}