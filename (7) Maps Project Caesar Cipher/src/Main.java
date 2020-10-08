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

        System.out.println("key write num from 1 to 25");
        int num = 1;
        String string = "abcdefghijklmnopqrstuvwxyz";
        OrigText text = new OrigText(string);
        char[] test = text.toCharArray(text.origWord);
        Shift shift = new Shift(num);
        System.out.println(test);

        for (int i = 0; i<string.length(); i++){
            if (test[i] == 'a'){
                System.out.println("hi");
            }
        }

        map.put(text, shift);

        Set<Map.Entry<OrigText, Shift>> set = map.entrySet();
        Iterator<Map.Entry<OrigText, Shift>> iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry<OrigText, Shift> entry = iterator.next();
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }

        char[] alfa = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] plaintext = text.toCharArray(text.origWord);
        int[] noms = new int[alfa.length];
        int[] plainNoms = new int[noms.length];
        Encrypt.assignNums(alfa, noms);
        Encrypt.assignNums(plaintext, plainNoms);

        for (int i = 0; i<plaintext.length; i++){
            plainNoms[i] = Character.forDigit(noms[i], 36);
            System.out.print(plaintext[i] + " = " + plainNoms[i] + "\t");
        }
        System.out.println("\n\n");
        for (int i = 0; i<plaintext.length; i++){
            plainNoms[i] = plainNoms[i]+num;
            System.out.print(Encrypt.assignLetters(plainNoms[i]) + " = " + plainNoms[i] + "\t");
        }


//        int[] noms = new int[alfa.length];
//        Encrypt.assignNums(alfa, noms);
//
//        System.out.println();
//
//        char[] x = new char[alfa.length];
//        for (int i=0; i<noms.length; i++){
//            x[i] = Character.forDigit(noms[i], 36);
//        }
//
//
//        char ch = 'a';
//        char ch2 = 'z';




//      e(x) = (x+k) (mod26)
//      e(x) = encryption function
//       x = character being encrypted after being changed to number
//       k = key (shift) applied to x
//       results in number to be translated to letter

        //so like num should mod to determine shift, get alfa[modded num] i think? ye

    }


}
