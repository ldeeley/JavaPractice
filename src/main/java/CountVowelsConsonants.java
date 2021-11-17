import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CountVowelsConsonants {

    public static Map<Boolean, List<Character>> vowelCount(String string){

        Map<Boolean, List<Character>> map = string.toLowerCase(Locale.ROOT).chars()
        .mapToObj(c->(char) c)
        .collect(Collectors.partitioningBy(c->c.toString().matches("[aeiou]")));

        map.entrySet().forEach(System.out::println);

        return map;

    }

}
