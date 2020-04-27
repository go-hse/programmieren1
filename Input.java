
// Importieren von zusätzlichen Features; hier: Scanner
import java.util.*;

public class Input {
    public static void main(String[] args) {
        // keine Kommas (Standard in Deutsch), bei Ein- und Ausgabe
        // sondern Punkte als Dezimaltrennzeichen (US)
        Locale.setDefault(Locale.US);

        Scanner in = new Scanner(System.in);

        System.out.print("Bitte 3 Zahlen und einen String eingeben: ");

        int i = in.nextInt();
        float f = in.nextFloat();
        double d = in.nextDouble();
        String s = in.next();

        // Ausgeben der Zahlen, jeweils mit neun Stellen,
        // führenden Nullen %05.2f führende Leerzeichen %5.2f
        // zwei Nachkommastellen bei den Fließkommazahlen
        System.out.format("%nFormatierte Zahlen: int %d float %.2f double %.2f '%s' %n", i, f, d, s);

        in.close();
    }
}