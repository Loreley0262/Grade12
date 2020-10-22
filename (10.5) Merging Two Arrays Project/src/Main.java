import java.util.Arrays;

public class Main {

    public static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i;
        for (i = 0; i < c.length; i++) {
            if (i < a.length) {
                c[i] = a[i];
            } else {
                c[i] = b[i - a.length];
            }
        }
        return c;
    }

    public static int[] mergeSort(int[] array) {
        //base case
        if (array.length == 1) {
            return array;
        }
        //recursive call
        else {
            if (array.length ==2 && array[0]>array[1]){
                int temp = array[0];
                array[0] = array[1];
                array[1] = temp;
                return array;
            }
            int[] leftArray = new int[array.length / 2];
            System.arraycopy(array, 0, leftArray, 0, leftArray.length);
            mergeSort(leftArray);

            int[] rightArray = new int[array.length - leftArray.length];
            if (rightArray.length >= 0) System.arraycopy(array, leftArray.length, rightArray, 0, rightArray.length);
            mergeSort(rightArray);
            array = merge(leftArray, rightArray);
        }
        return array;
    }
    public static void main (String[] args){
//        int[] annaray = new int[8];
//        annaray[0] = 5;
//        annaray[1] = 78;
//        annaray[2] = 56;
//        annaray[3] = 32;
//        annaray[4] = 15;
//        annaray[5] = 23;
//        annaray[6] = 56;
//        annaray[7] = 11;
        int[] annaray = new int[8];
        annaray[0] = 3;
        annaray[1] = 4;
        annaray[2] = 5;
        annaray[3] = 2;
        annaray[4] = 8;
        annaray[5] = 6;
        annaray[6] = 7;
        annaray[7] = 1;

        int[] barry = new int[2];
        barry[0] = 9;
        barry[1] = 99;

        int[] carry = new int[8];
        carry[0] = 5;
        carry[1] = 11;
        carry[2] = 15;
        carry[3] = 23;
        carry[4] = 32;
        carry[5] = 56;
        carry[6] = 56;
        carry[7] = 78;

        System.out.println(Arrays.toString(annaray));
        System.out.println(Arrays.toString(mergeSort(annaray)));
        System.out.println();
        System.out.println(Arrays.toString(carry));
    }
}
/*
    a       b
    27      84
    24      81
    23      35
    15      25
    10      14
    8       11
            8
            5
            2


*/