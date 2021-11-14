import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FirstNonRepeatingCharacterTest {

    @ParameterizedTest
    @CsvSource({"a,a",
            "b,b",
            "lleessteer,t",
            "null,x"})
    void firstNonRepeatingCharacter(String input, Character expected) {
        assertEquals(Optional.of(expected), FirstNonRepeatingCharacter.firstNonRepeatingCharacter(input));
    }

}