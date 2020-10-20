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
        String alfa = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("pick a word");
        String word = scan.next();
        System.out.println("pick a number to shift by");
        int shift = scan.nextInt();
        //e(x) = (x+k) (mod26)
        System.out.println(Encrypt.encryption(word, shift));
        System.out.println("decrypt");
        System.out.println(Encrypt.decryption(word, shift));

    }


}
