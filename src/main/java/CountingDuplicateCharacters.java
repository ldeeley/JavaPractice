import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountingDuplicateCharacters {

    public String countingDuplicateCharacters(String string){

        //collect all characters in a map - key,value - character,characterCount
        Map<Character,Long> characterCountMap = new HashMap<>();
        characterCountMap = string.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.groupingBy(c->c,Collectors.counting()));
        //create a String result of only those characters that are in the Map with a count of two - i.e. duplicates
        return characterCountMap.entrySet().stream()
                .filter(x -> x.getValue() == 2)   //duplicates only
                .map(Map.Entry::getKey)
                .map(Object::toString)
                .collect(Collectors.joining());
    }

}
