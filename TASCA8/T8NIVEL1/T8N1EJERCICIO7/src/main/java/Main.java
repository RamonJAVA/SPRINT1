import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<Object> strings = Arrays.asList("proclaim", "stand", "expertise", "junior", "nuclear",
                                            "offender", "How are you?", "Testing lengths of strings with Lambdas.",
                                            1, 13, 135, 1357, 13579);

        strings.stream()
                .filter(s -> s instanceof String)
                .map(String.class :: cast)
                .sorted(Comparator.comparing(String :: length).reversed())
                .forEach(System.out::println);
    }

}
