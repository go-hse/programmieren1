public class FiboIter {
    static long fibonacci(long f) {

        long f0 = 0;
        long f1 = 1;

        if (f == 0) {
            return 0;
        } else if (f < 0) {
            System.out.println("Das angegebene f kann nicht berechnet werden, da der Wert negativ ist.");
            return f;
        } else {
            while (f > 1) {
                long tempf = f1;
                f1 = f0 + f1;
                f0 = tempf;
                f--;
            }
            return f1;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(30));
    }

}