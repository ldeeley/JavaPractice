import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class JoinMultipleStringsDelimeterTest {

    @Test
    void joinMultipleStringsDelimeter() {

        List<String> strings = new ArrayList<>(List.of("hello","how","are","you"));
        String expected = "hello,there,how,are,you";
        assertEquals(expected,JoinMultipleStringsDelimeter.joinMultipleStringsDelimeter(strings,','));

    }
}