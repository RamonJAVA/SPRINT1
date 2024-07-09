import java.io.File;
import java.util.Date;
import java.util.Scanner;
import java.util.Arrays;

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

                if (f.isDirectory()) {

                    for (int i = 0; i < level; i++) {

                        System.out.println("-----------------");

                    }

                    System.out.println("Directory " + f.getName() + "\nLast Modified " + date + "\nLevel " + level);

                } else {

                    for (int i = 0; i < level; i++) {

                        System.out.println("-----------------");

                    }

                    System.out.println("File " + f.getName() + "\nLast Modified " + date + "\nLevel " + level);

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
