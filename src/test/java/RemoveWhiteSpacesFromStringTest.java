import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RemoveWhiteSpacesFromStringTest {

    @Test
    void removeWhiteSpaces() {
        assertEquals("helloyou",RemoveWhiteSpacesFromString.removeWhiteSpaces("hello you"));
    }
}