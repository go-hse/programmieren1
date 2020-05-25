
// Importieren von zusätzlichen Features; hier: Scanner
// import java.util.*;

public class Loops {
    public static void main(String[] args) {

        int array[] = { 2, 5, 7, 13 };
        boolean found = false;

        int idx = 0;
        while (!found && idx < array.length) {
            found = (array[idx++] % 3 == 0);
        }
        if (found)
            System.out.println(array[idx - 1] + " ist durch 3 teilbar");
        else
            System.out.println("Keine Zahl ist durch 3 teilbar");

    }
}