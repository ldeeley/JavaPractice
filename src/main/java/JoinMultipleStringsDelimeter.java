import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinMultipleStringsDelimeter {

    public static String joinMultipleStringsDelimeter(List<String> strArray, Character delimeter){

        return strArray.stream()
                .collect(Collectors.joining(delimeter.toString()));

    }

}
