import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<String> words = Arrays.asList("no", "proclaim", "stand", "expertise", "junior", "nuclear", "offender");
        List<String> wordsWith5LettersWithO = checkIfO(words);

        for (String wordO : wordsWith5LettersWithO){
            System.out.println(wordO);
        }
    }

    public static List<String> checkIfO(List<String> stringList){

        return stringList.stream()
                .filter(word -> word.contains("o"))
                .filter(word -> word.length() > 5)
                .collect(Collectors.toList());
    }
}
