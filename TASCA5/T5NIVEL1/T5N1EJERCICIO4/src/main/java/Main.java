import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the directory of the .txt file:");
        String directory = sc.nextLine();

        reader(directory);

        sc.close();

    }

    public static void reader(String directory) {
        File file = new File(directory);

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.err.println();
        }

    }
}