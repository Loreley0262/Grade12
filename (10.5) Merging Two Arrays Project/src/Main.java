import java.util.Arrays;

public class Main {
    /*
    public static void getLeafNodes(Node n){
        //base case
        if (n.left == 0 && n.right == 0){
            System.out.println(n);
        }
        //recursive step
        else{
            if (n.left !=0 && n.right !=0){
                getLeafNodes(getNode(n.left));
                getLeafNodes(getNode(n.right));
            }
            if (n.right == 0){
                getLeafNodes(getNode(n.left));
            }
            if (n.left == 0){
                getLeafNodes(getNode(n.right));
            }
        }

    }
    */

    public static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int i;
        for (i = 0; i<c.length; i++){
            if (i<a.length){
                c[i] = a[i];
            }
            else{
                c[i] = b[i-a.length];
            }
        }
        return c;
    }

    public static int[] mergeSort(int[] array){
        //base case
        if (array.length == 1){
            return array;
        }
        //recursive call
        else{
            int[] leftArray = new int[array.length/2];
            for (int i = 0; i<leftArray.length; i++){
                leftArray[i] = array[i];
            }
            mergeSort(leftArray);
            int[] rightArray = new int[array.length-leftArray.length];
            for (int i = 0; i<rightArray.length; i++){
                rightArray[i] = array[i+leftArray.length];
            }
            mergeSort(rightArray);
            return merge(leftArray, rightArray);
        }

    }

    public static void main(String[] args) {
        /*int[] ay = new int[6];
        int[] bee = new int[9];
        int[] merged = new int[ay.length + bee.length];

        ay[0] = 27;             bee[0] = 84;
        ay[1] = 24;             bee[1] = 81;
        ay[2] = 23;             bee[2] = 35;
        ay[3] = 15;             bee[3] = 25;
        ay[4] = 10;             bee[4] = 14;
        ay[5] = 8;              bee[5] = 11;
                                bee[6] = 8;
                                bee[7] = 5;
                                bee[8] = 2;
*/
        int[] array = new int[8];
        array[0] = 5;
        array[1] = 78;
        array[2] = 56;
        array[3] = 32;
        array[4] = 15;
        array[5] = 23;
        array[6] = 56;
        array[7] = 11;
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
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(mergeSort(array)));
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