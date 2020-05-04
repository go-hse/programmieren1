
// Importieren von zusätzlichen Features; hier: Scanner
import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int[] iarray = { 10, 11, 12, 13, 14, 15 };
        int i = 6;

        System.out.format("%d : %d : %d %n", iarray[0], iarray[i], iarray.length);
        String[] sarray = { "Hallo", "Hochschule", "Esslingen" };
        System.out.format("%s : %s : %d %n", sarray[0], sarray[2], iarray.length);

    }
}