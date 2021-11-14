import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static Optional<Character> firstNonRepeatingCharacter(String string){

        if (string.compareTo("")==0) return Optional.of('x');

        Optional<Character> result;
        Map<Character, Long> charMap = new LinkedHashMap<>();

        charMap = string.chars()
                .mapToObj(ch->(char) ch)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        result = charMap.entrySet()
                .stream().filter(x -> x.getValue() == 1)
                .map(x->x.getKey())
                .findFirst();

        return result;
    }

}
