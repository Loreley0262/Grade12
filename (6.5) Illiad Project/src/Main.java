import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("illiad.txt"));
        TreeSet<String> ilYA = new TreeSet<>();
        ArrayList<String> totalNumWords = new ArrayList<>();
        String word = "";
        String test = "\"Sons of Atreus,\" he cried, \"and all other Achaeans, may the gods\n" +
                "who dwell in Olympus grant you to sack the city of Priam, and to reach\n" +
                "your homes in safety; but free my daughter, and accept a ransom for\n" +
                "her, in reverence to Apollo, son of Jove.\" ";

        while (scan.hasNext()) {
            word = scan.next();
            word = word.toLowerCase();
            totalNumWords.add(word);
            ilYA.add(word);
            System.out.print(word + "  ");
        }

        String[] totalNumWordsArray = totalNumWords.toArray(new String[0]);
        String[] ilYArray = ilYA.toArray(new String[0]);
//        String[] testArray = test.toArray(new String[0]);
        int origNum = 0;
        int sortNum = 0;

        for (String s : totalNumWordsArray) {
            origNum++;
        }
        for (String s : ilYArray) {
            sortNum++;
        }
        System.out.println(origNum);
        System.out.println(sortNum);


    }
}
