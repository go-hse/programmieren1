
// Importieren von zusätzlichen Features; hier: Scanner
// import java.util.*;

public class ArrayEx {
    public static void main(String[] args) {
        int[] iarray = { 10, 11, 12, 13, 14, 15 };
        int i = 6;

        int j = iarray[0]; // 0: das erste Element; 5: letztes Element
        j = iarray[5];

        iarray[2] = 23;

        int l = 6;

        System.out.format("%d : %d : %d %n", iarray[0], iarray[l], iarray.length);

        String[] sarray = { "Hallo", "Hochschule", "Esslingen" };

        System.out.format("%s : %s : %d %n", sarray[0], sarray[2], sarray.length);

    }
}