import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class CountCharacterInStringTest {

    @ParameterizedTest
    @CsvSource({"e,aeiou,1","e,eeee,4"})
    void countCharacterInString(Character ch,String str,Long expected) {
        assertEquals(expected,CountCharacterInString.countCharacterInString(ch,str));
    }
}