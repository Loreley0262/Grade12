import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("illiad.txt"));

        TreeSet<String> ilYA = new TreeSet<>();
        for (int i = 1; i<10; i++){
            ilYA.add("e");
            ilYA.add("f");
        }
        System.out.println(ilYA);

        TreeSet<Ileeahd> illeeaad = new TreeSet<>();
        Ileeahd ileeahd = new Ileeahd("as");
        illeeaad.add(ileeahd);
        System.out.println(ileeahd);

        Ileeahd x = new Ileeahd("aa");
        Ileeahd y = new Ileeahd("aa");


        for (int i = 1; i<4; i++){
            String a = scan.next();
            System.out.println(a);
        }
    }
}
