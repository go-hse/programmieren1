
// Importieren von zusätzlichen Features; hier: Scanner
import java.util.*;

public class NewArrays {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner inscanner = new Scanner(System.in);
        int sizeOFArray = inscanner.nextInt();
        int[] iarray = new int[sizeOFArray];
        inscanner.close();
        System.out.format("%d : %d : %d %n", iarray[0], iarray[1], iarray.length);
        String[] sarray = { "Hallo", "Hochschule", "Esslingen" };
        System.out.format("%s : %s : %d %n", sarray[0], sarray[2], iarray.length);
    }
}