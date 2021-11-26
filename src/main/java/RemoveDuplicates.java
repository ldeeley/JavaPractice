import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.stream.Collectors;

public class RemoveDuplicates {

    public static String removeDuplicates(String str){

        str
                .chars()
                .mapToObj(c-> (char) c)
                .filter()
                .collect(Collectors.toSet(new LinkedHashSet<Character>(), )).t;

        return str;
    }

}
