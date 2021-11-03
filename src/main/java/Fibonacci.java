public class Fibonacci {


    public int getNumber(int i) {

        if (i < 2) return i;

        return getNumber(i-1) + getNumber(i-2);

    }
}
