import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MonthsTest {

    Months months = new Months();

    @Test
    void twelvePositions(){
        assertEquals(12, months.getMonths().size());
    }

    @Test
    void notNull(){
        assertNotNull(months.getMonths());
    }

    @Test
    void augustPosition(){
        assertEquals("August", months.getMonths().get(7));
    }

}