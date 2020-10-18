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
        Encrypt.encryption(word, shift);
        HashMap<String, String> encrypt = new HashMap<>();
        HashMap<String, String> decrypt = new HashMap<>();
        ArrayList<String> alphabet = new ArrayList<String>(alfa.length());
        for (int i =0; i<alfa.length(); i++){
            String letter = alfa.substring(i, i+1);
            alphabet.add(letter);
        }
        for (int i =0; i<alfa.length(); i++){
            encrypt.put(alphabet.get(i), alphabet.get((i+shift)%26));
            decrypt.put(alphabet.get((i+shift)%26), alphabet.get(i));
        }
        for (int i =0; i<word.length(); i++){
            String letter = word.substring(i, i+1);
            ciphertext = ciphertext + encrypt.get(letter);
        }
        for (int i =0; i<word.length(); i++){
            String letter = ciphertext.substring(i, i+1);
            plaintext = plaintext + decrypt.get(letter);
        }
        System.out.println(ciphertext);
        System.out.println(plaintext);

    }


}
