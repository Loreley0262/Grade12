public class Main {
    public static void main(String[] args) {
        //        TYPES OF SORTING ALGORITHMS!!!
        /*
         BUBBLE SORT
            -loops through array, tests if n-1<n
            -so of the 2 consecutive objs, which is smaller: the obj or the obj before it?
            -if true, n, n-1 swap places in array
            -as it only checks in groups of 2, won't get all the necessary swaps
                -must use nested loops to loop through it again so it gets all swaps
            -inefficient compared to merge sort
                -is slow, needs multiple loops
        */
        /*
        MERGE SORT
            -uses "divide and conquer" approach
                -this means recursion
            -simplify array by cutting it in half until array size is one
                -**if odd number like 9, uses int division (3.5->3) and other half would be 9-3**
                -half until it's one
                -take left and right cuz theyd both be 1, sort with recursion
                -kinda like node assignment? go down until leaf node,
                 go up and find the pair, sort, repeat
        */
    }
}
