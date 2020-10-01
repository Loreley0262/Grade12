import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("illiad.txt"));
        Scanner scan2 = new Scanner(new File("illiad test.txt"));

        TreeSet<String> ilYA = new TreeSet<>();
        ArrayList<String> totalNumWords = new ArrayList<>();
        String word = "";

        while (scan2.hasNext()){
            word = scan.next();
            word = word.toLowerCase();
            totalNumWords.add(word);
            ilYA.add(word);
            System.out.print(word + "  ");
        }

//        while (scan.hasNext()) {
//            word = scan.next();
//            word = word.toLowerCase();
//            totalNumWords.add(word);
//            ilYA.add(word);
//            System.out.print(word + "  ");
//        }

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
