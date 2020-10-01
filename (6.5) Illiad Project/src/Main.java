import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeSet<String> ilYA = new TreeSet<>();
        for (int i = 1; i<10; i++){
            ilYA.add("e");
            ilYA.add("f");
        }
        System.out.println(ilYA);

        TreeSet<Ileeahd> illeeaad = new TreeSet<>();
        Ileeahd ileeahd = new Ileeahd(1);
        illeeaad.add(ileeahd);
        System.out.println(ileeahd);

        String x = scan.next();
        System.out.println(x);
    }
}
