import java.util.*;

public class Main {
    /*
      * create class that allows user to instantiate num btwn 1-25 representing num of shifts
      *     so user chooses key
      * make methods that encrypts message from key, decrypts with key
      * BONUS
      *     Create method that cracks shift
     * */

    /*
    translate "a"=0,"b"=1, etc
    encryption:
        e(x) = (x+k) (mod26)
            e(x) = encryption function
            x = character being encrypted after being changed to number
            k = key (shift) applied to x
        results in number to be translated to letter
    decryption
        e(x) = (x-k) (mod26)
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeMap<OrigText, Shift> map = new TreeMap<>();

        System.out.println("write num from 1 to 25");
        int num = scan.nextInt();
        OrigText text = new OrigText("abcde");
        Shift shift = new Shift(num);

        map.put(text, shift);

        Set<Map.Entry<OrigText, Shift>> set = map.entrySet();
        Iterator<Map.Entry<OrigText, Shift>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<OrigText, Shift> entry = iterator.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

//    e(x) = (x+k) (mod26)
//    e(x) = encryption function
//    x = character being encrypted after being changed to number
//    k = key (shift) applied to x
//    results in number to be translated to letter
      char[] alfa = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        System.out.println(alfa[1]);
    }
}
