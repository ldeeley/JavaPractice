import java.util.Locale;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PalindromeCheckerFunctional {

    public static boolean palindromeCheckerFunctional(String str){

//        return str.equals(new StringBuilder(str).reverse().toString());
        return IntStream.range(0,str.length()/2)
                .noneMatch(p->str.charAt(p)!=str.charAt(str.length()-p-1));
    }

}
