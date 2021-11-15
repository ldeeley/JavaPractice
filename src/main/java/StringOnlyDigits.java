public class StringOnlyDigits {

    public static boolean stringOnlyDigits(String string){
//        String result;
//        result = string.replaceAll("[0-9]","");
//        return result.isBlank();
            return string.matches("[0-9]*");
    }

}
