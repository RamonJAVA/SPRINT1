import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class DNICheckTest {


    @ParameterizedTest
    @CsvSource({"12345678, Z", "87654321, X", "18273645, F", "81726354, V", "11111111, H",
            "22222222, J", "33333333, P", "44444444, A", "55555555, K", "66666666, Q"})

    public void correctLetterMethod(int numDni, char letter) {
        char correctLetter = DNICheck.getTheCorrectLetter(numDni);
        assertEquals(correctLetter, letter);
    }
}