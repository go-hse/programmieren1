
public class Funcs {

    // Stub
    public static int calculateNumberOfDigits(int value) {
        int numOfDigits = 0;
        do {
            ++numOfDigits;
            value = value / 10;
        } while (value > 0);
        return numOfDigits;
    }

    public static void main(String[] args) {
        System.out.println(calculateNumberOfDigits(7));
        System.out.println(calculateNumberOfDigits(23));
        System.out.println(calculateNumberOfDigits(547));
        System.out.println(calculateNumberOfDigits(547123));
    }
}