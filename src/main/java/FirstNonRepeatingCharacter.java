import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacter {

    public static char firstNonRepeatingCharacter(String string){
        Map<Character, Integer> charMap = new LinkedHashMap<>();
        Function<Character, Character> keyMapper = new Function<Character, Character>() {
            @Override
            public Character apply(Character character) {
                return character;
            }
        };

        Function<Character, Integer> valueMapper = new Function<Character, Integer>() {
            @Override
            public Integer apply(Character character) {
                if (charMap.containsKey(character))
                return null;
            }
        };

        BinaryOperator<?> mergeFunction;


        charMap = string.chars()
                .mapToObj(ch->(char) ch)
                .collect(Collectors.toMap(keyMapper,valueMapper,mergeFunction));
        }

        return result;
    }

}
