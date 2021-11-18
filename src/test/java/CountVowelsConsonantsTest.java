import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.hamcrest.collection.IsMapContaining;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.CoreMatchers.is;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class CountVowelsConsonantsTest {

//    @ParameterizedTest
//    @CsvSource({",0","1,1","2,1","9,34"})
    @Test
    void vowelCount() {
        Map<Boolean,List<Character>> expected = new HashMap<>();
        expected.put(true, List.of('a', 'e'));
        expected.put(false, List.of('b', 'c', 'd'));
        assertThat(CountVowelsConsonants.vowelCount("abcde").size(),is(2));

        List<Character> vowelList = List.of('a','e');
        List<Character> consonantList = List.of('b','c','d');

        assertThat(CountVowelsConsonants.vowelCount("abcde"),IsMapContaining.hasValue(vowelList));
        assertThat(CountVowelsConsonants.vowelCount("abcde"),IsMapContaining.hasKey(true));
        assertThat(CountVowelsConsonants.vowelCount("abcde"),IsMapContaining.hasValue(consonantList));
        assertThat(CountVowelsConsonants.vowelCount("abcde"),IsMapContaining.hasKey(false));
        assertThat(CountVowelsConsonants.vowelCount("abcde"),IsMapContaining.hasEntry(false,consonantList));
        assertThat(CountVowelsConsonants.vowelCount("abcde"),IsMapContaining.hasEntry(true,vowelList));

    }
}