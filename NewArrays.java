
// Importieren von zusätzlichen Features; hier: Scanner
import java.util.*;

public class NewArrays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        int i = 1;

        int j = i++; // Post-Inkrement -- Dekrement
        System.out.println(j);
        j = ++i; // Prä-Inkrement

        ++i; // +1
        i = i + 5;
        i += 5;

        i = 105;

        j = 105 / 10; // 10
        j = 105 % 10; // 5

        boolean gerade = i % 2 == 0;

        // 1 ... 100

        if (i % 10 == 0) {

        }

        System.out.println(j);
    }
}