
// Importieren von zusätzlichen Features; hier: Scanner
import java.util.*;

public class FuncsArray {

    public static void incr(int i) {
        ++i;
    }

    public static void incrArray(int[] a, int idx) {
        ++a[idx];
    }

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        int array[] = { 1, 2, 3 };
        incrArray(array, 1);
        System.out.println(Arrays.toString(array));
    }
}