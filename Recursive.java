import java.io.File; // importiere zus. Bibliothek

public class Recursive {

    final static long MB = 1024 * 1024;

    static String fillTabs(int t) {
        String s = "";
        for (int i = 0; i < t; ++i)
            s += "\t";
        return s;
    }

    public static long traverse(String folderStr, int depth) {
        // list the files in the data folder
        File folder = new File(folderStr);
        if (depth < 5)
            System.out.format("%s{%n", fillTabs(depth));
        String[] filenames = folder.list();
        long foldersum = 0;
        if (filenames != null)
            for (int i = 0; i < filenames.length; ++i) {
                File f = new File(folderStr, filenames[i]);
                if (f.isDirectory()) {
                    foldersum += traverse(f.toString(), depth + 1);
                } else {
                    foldersum += f.length();
                }
            }
        if (depth < 5)
            System.out.format("%s} %s: %d MB %n", fillTabs(depth), folderStr, foldersum / MB);
        return foldersum;

    }

    public static void main(String[] args) {
        traverse("C:\\Users\\adr", 0);
    }
}