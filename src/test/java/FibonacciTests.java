import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciTests {

    @ParameterizedTest
    @CsvSource({"0,0","1,1","2,1","9,34"})
    public void firstNumberInSequenceIsZero(Integer input,Integer expected){

        assertEquals(expected,new Fibonacci().getNumber(input));
    }

}
