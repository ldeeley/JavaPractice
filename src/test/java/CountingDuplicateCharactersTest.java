import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.matchesPattern;
import static org.junit.jupiter.api.Assertions.*;

class CountingDuplicateCharactersTest {

    @Test
    void countingDuplicateCharacters() {
        //search for characters that only appear twice
        assertThat (new CountingDuplicateCharacters().countingDuplicateCharacters("Lester"), matchesPattern("[e]+"));
        assertThat (new CountingDuplicateCharacters().countingDuplicateCharacters("Gillian"), matchesPattern("[il]+"));
        assertThat (new CountingDuplicateCharacters().countingDuplicateCharacters("Jessica"), matchesPattern("[s]+"));
        assertThat (new CountingDuplicateCharacters().countingDuplicateCharacters("aabbcc"), matchesPattern("[abc]+"));

    }
}