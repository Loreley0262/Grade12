public class Encrypt {
//    e(x) = (x+k) (mod26)
//    e(x) = encryption function
//    x = character being encrypted after being changed to number
//    k = key (shift) applied to x
//    results in number to be translated to letter


    public static void assignNums(char[] chars, int[] ints){
        for (int i = 0; i<chars.length; i++){
            ints[i] = Character.getNumericValue(chars[i]);
        }
    }

    public static String assignLetters(int shift) {
        return Character.toString ((char) shift);
    }

}
