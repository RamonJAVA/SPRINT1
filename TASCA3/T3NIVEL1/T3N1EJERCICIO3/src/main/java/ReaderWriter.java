import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class ReaderWriter {

    static FileReader fr = null;
    static BufferedReader br = null;
    static Map<String, String> countries = new HashMap<>();
    public static void reader() {
        try {
            fr = new FileReader ("countries.txt");
            br = new BufferedReader(fr);
            String country, countryFile, capital, capitalFile;

            String line;
            while((line = br.readLine()) != null) {
                String[] splitter = line.split(" ");
                if (splitter.length > 1) {
                    countryFile = (splitter[0]);
                    country = cleanUp(countryFile);
                    capitalFile = (splitter[1]);
                    capital = cleanUp(capitalFile);
                    countries.put(capital, country);
                }
            }
            fr.close();
        }catch(IOException e){
            System.err.println();
        }
    }

    public static String randomCountry() {
        Object[] countriesArr = countries.values().toArray();
        String randCountry = ((String) countriesArr[new Random().nextInt(countriesArr.length - 1)]);
        return randCountry;
    }

    public static boolean checkIfCorrect(String capitalCheck, String countryCheck) {
        boolean check = false;
        String search = "";

        for(String country : countries.keySet()) {
            if (countryCheck.equalsIgnoreCase(search = countries.get(country))) {
                if(capitalCheck.equalsIgnoreCase(country)){
                    check = true;
                }
            }
        }
        return check;
    }

    public static void writer(String name, int points){
        try{
            FileWriter file = new FileWriter("ranking.txt", true);
            PrintWriter pw = new PrintWriter(file);

            pw.println(name + ": " + points);

            file.close();
        }catch(Exception e) {
            System.err.println();
        }
        System.out.println("\n(Your points have been saved.)");
    }

    public static String cleanUp(String wordFile) {
        String word = "";

        for (int i = 0; i < wordFile.length(); ++i) {
            if (wordFile.charAt(i) == '_') {
                word += " ";
            }else {
                word += wordFile.charAt(i);
            }
        }

        return word;
    }
}
