import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseLettersOfWord {

    public static String reverseLettersOfWord(String string){

        List<String> words = new ArrayList<>(List.of(string.split("\\PL+")));
        String result = words
                .stream()
                .map(x->new StringBuilder(x).reverse().toString())
                .collect(Collectors.joining(" "));

        return result;
    }

}
