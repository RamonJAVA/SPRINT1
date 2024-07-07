import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args){

        List<String> words = Arrays.asList("proclaim", "stand", "expertise", "junior", "nuclear", "offender");
        List<String> wordsWithO = checkIfO(words);

        for (String wordO : wordsWithO){
            System.out.println(wordO);
        }
    }

    public static List<String> checkIfO(List<String> stringList){

        return stringList.stream()
                .filter(word -> word.contains("o"))
                .collect(Collectors.toList());
    }
}
