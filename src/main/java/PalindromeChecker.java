public class PalindromeChecker {

    public static boolean palindromeChecker(String string){
        boolean result = false;
        if (string.length()==1) {
            return true;
        } else {
            for (int i=0;i<=((string.length()-1) %2);i++){
                if (string.charAt(i) != string.charAt((string.length()-1)-i)) return false;
            }
            return true;
        }
    }

}
