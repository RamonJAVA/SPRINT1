import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the directory path: ");
        String directoryPath = sc.nextLine();

        checkDirectory(directoryPath);

    }

    public static void checkDirectory(String directoryPath){

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null){
            Arrays.sort(files);

            for (File f : files){
                System.out.println(f.getName());

            }

        }else {
            System.out.println("Non-extistent or empty directory.");

        }
    }
}
