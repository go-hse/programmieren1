
// Importieren von zusätzlichen Features; hier: Scanner
import java.util.*;

public class InputLoop {
    public static void main(String[] args) {
        Scanner inscanner = new Scanner(System.in);

        while (inscanner.hasNext()) {
            int i = inscanner.nextInt();
            System.out.format("%n: int %d ", i);
        }
        System.out.println("Done");
        inscanner.close();
    }
}