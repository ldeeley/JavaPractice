import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    void palindromeChecker() {
        assertFalse(PalindromeChecker.palindromeChecker(""));
    }
}