import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void palindromeCheckerBlank() {
        assertTrue(PalindromeChecker.palindromeChecker(""));
    }

    @Test
    void palindromeCheckerOneChar() {
        assertTrue(PalindromeChecker.palindromeChecker("x"));
    }

    @Test
    void palindromeCheckerMultiChar() {
        assertTrue(PalindromeChecker.palindromeChecker("xxx"));
    }

    @Test
    void palindromeCheckerMultiCharBad() {
        assertFalse(PalindromeChecker.palindromeChecker("xxxy"));
    }
}