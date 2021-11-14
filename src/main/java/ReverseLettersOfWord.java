import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReverseLettersOfWord {

    public static String reverseLettersOfWord(String string){

        String result = string;
        List<String> words = List.of(string.split("\\PL+"));
        words
                .stream()
                .forEach(System.out::println);
        return result;
    }

}
