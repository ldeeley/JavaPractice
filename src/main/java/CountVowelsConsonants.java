import java.util.Locale;

public class CountVowelsConsonants {

    public static Long vowelCount(String string){
        String justVowels = string.toLowerCase(Locale.ROOT).replaceAll("[^aeiou]*","");
        return justVowels.chars()
        .mapToObj(c->(char) c)
        .count();


    }

}
