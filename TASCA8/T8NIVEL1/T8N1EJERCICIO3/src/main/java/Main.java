import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        String[] months = {"January", "February", "March", "April", "May", "June",
                            "July", "August", "September", "October", "November", "December"};

        Arrays.stream(months).forEach(i -> System.out.println(i));
    }
}
