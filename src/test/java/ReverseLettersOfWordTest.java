import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class ReverseLettersOfWordTest {

    @ParameterizedTest
    @CsvSource({"this,siht","what if,tahw fi"})
    void reverseLettersOfWord(String input,String expected) {

        assertEquals(expected, ReverseLettersOfWord.reverseLettersOfWord(input));

    }
}