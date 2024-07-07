import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AIOOBETest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testThrowsArrayIndexOut(){
        AIOOBE.arrayIndexException();
    }

}