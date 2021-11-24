import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PalindromeCheckerFuncTest {

    @Test
    void palindromeCheckerBlank() {
        assertTrue(PalindromeCheckerFunctional.palindromeCheckerFunctional(""));
    }

    @Test
    void palindromeCheckerOneChar() {
        assertTrue(PalindromeCheckerFunctional.palindromeCheckerFunctional("x"));
    }

    @Test
    void palindromeCheckerMultiChar() {
        assertTrue(PalindromeCheckerFunctional.palindromeCheckerFunctional("xxx"));
    }

    @Test
    void palindromeCheckerMultiCharBad() {
        assertFalse(PalindromeCheckerFunctional.palindromeCheckerFunctional("xxxy"));
    }
}