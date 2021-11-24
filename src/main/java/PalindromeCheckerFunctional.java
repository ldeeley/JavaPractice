import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PalindromeCheckerFunctional {

    public static boolean palindromeCheckerFunctional(String str){

        return str.equals(new StringBuilder(str).reverse().toString());
    }

}
