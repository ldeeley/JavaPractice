import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringToNumberTest {

    @Test
    void stringToInteger() {
        assertEquals(2,StringToNumber.StringToInteger("2"));
    }

    @Test
    void stringToDouble() {
        assertEquals(2,StringToNumber.StringToDouble("2"));
    }
}