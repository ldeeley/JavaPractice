import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class StringOnlyDigitsTest {

    @ParameterizedTest
    @CsvSource({"123789","123"})
    void stringOnlyDigits(String input) {
        assertTrue(StringOnlyDigits.stringOnlyDigits(input));
    }

    @ParameterizedTest
    @CsvSource({"abc123 789","123xyz"})
    void nonStringOnlyDigits(String input) {
        assertFalse(StringOnlyDigits.stringOnlyDigits(input));
    }
}