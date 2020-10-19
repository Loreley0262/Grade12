import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Encrypt {
//    e(x) = (x+k) (mod26)
//    e(x) = encryption function
//    x = character being encrypted after being changed to number
//    k = key (shift) applied to x
//    results in number to be translated to letter
    Scanner scan;
    static String alfa = "abcdefghijklmnopqrstuvwxyz";
    static String plaintext;
    static String ciphertext;
    String word;
    static HashMap<String, String> encrypt = new HashMap<>();
    static HashMap<String, String> decrypt = new HashMap<>();
    static ArrayList<String> alphabet = new ArrayList<String>(alfa.length());

    public static ArrayList<String> createAlphabet(String word, int shift){
        for (int i =0; i<alfa.length(); i++){
            String letter = alfa.substring(i, i+1);
            alphabet.add(letter);
        }
        for (int i =0; i<alfa.length(); i++){
            encrypt.put(alphabet.get(i), alphabet.get((i+shift)%26));
            decrypt.put(alphabet.get((i+shift)%26), alphabet.get(i));
        }
        return alphabet;
    }

    public static String encryption(String word, int shift) {
        createAlphabet(alfa, shift);
        for (int i =0; i<word.length(); i++){
            String letter = word.substring(i, i+1);
            if (ciphertext == null){
                ciphertext = encrypt.get(letter);
            }
            else{
                ciphertext = ciphertext + encrypt.get(letter);
            }
        }
        System.out.println(ciphertext);
        return ciphertext;
    }
    public static String decryption(String word, int shift) {
        createAlphabet(alfa, shift);
        encryption(word, shift);
        for (int i =0; i<word.length(); i++){
            String letter = ciphertext.substring(i, i+1);
            String temp = decrypt.get(letter);
            plaintext = plaintext + temp;
            System.out.println(decrypt.get(letter));
        }
        return plaintext;

    }

}
