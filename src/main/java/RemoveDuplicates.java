import java.util.*;
import java.util.stream.Collectors;

public class RemoveDuplicates {

//    Write a program that removes duplicate characters from a String

    public static String removeDuplicates(String str){

        return Arrays.asList(str.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());
    }

}
