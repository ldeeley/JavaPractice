import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingCharacterTest {

    @Test
    void firstNonRepeatingCharacter() {
        assertEquals("Empty String", FirstNonRepeatingCharacter.firstNonRepeatingCharacter(""));
    }

    @ParameterizedTest
    @CsvSource({"a,a","b,b","'',Empty String"})
    void firstNonRepeatingCharacter(String input, String expected) {
        assertEquals(expected, FirstNonRepeatingCharacter.firstNonRepeatingCharacter(input));
    }



}