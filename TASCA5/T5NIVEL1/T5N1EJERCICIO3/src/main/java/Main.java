import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce the directory path: ");
        String directoryPath = sc.nextLine();

        checkDirectory(directoryPath, 1);

    }

    public static void checkDirectory(String directoryPath, int level) {

        File directory = new File(directoryPath);
        File[] files = directory.listFiles();

        if (files != null) {

            Arrays.sort(files);

            for (File f : files) {

                Date date = new Date(f.lastModified());

                try(BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true))) {

                    if (f.isDirectory()) {

                        for (int i = 0; i < level; i++) {

                            writer.write("\n");

                        }

                        writer.write("Directory " + f.getName() + "\nLast Modified " + date + "\nLevel " + level);

                    } else {

                        for (int i = 0; i < level; i++) {

                            writer.write("\n//");


                        }

                        writer.write("File " + f.getName() + "\nLast Modified " + date + "\nLevel " + level);

                    }

                    writer.newLine();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

                if (f.isDirectory()) {
                    checkDirectory(f.getPath(), level + 1);

                }

            }
        }else {

        System.out.println("Non-extistent or empty directory.");

    }
    }
}
