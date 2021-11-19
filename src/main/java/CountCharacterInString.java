public class CountCharacterInString {

    public static Long countCharacterInString(Character ch, String str){

        return str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == ch)
                .count();
    }

}
