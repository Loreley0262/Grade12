public class Main {
    /*
    this method multiplies a and b together
    kinda like multirec but simpler with only loops and no recursion
    * */
    public static int multIter(int a, int b){
        int result = 0;
        for (int i = 0; i<b; i++){
            result +=a;
        }
        return result;
    }

    /*this is recursion
    ////recursion is a method that calls on itself////
    * must have one or more base cases to solve, prevent infinite recursion
    * base cases are easy to solve cases [ex. if (b==0) return 1;]
        simple cases that can be solved directly
        base case must return smth, otherwise =  infinite recursion  = bad
    * kinda like loops but more
    * */

    public static int multiRec(int a, int b){
        int result = 0;
        //base case
        if(b==1){
            return a;
        }
        //recursive step
        result = a+multiRec(a, b-1);
        return result;
    }

    //finding n! with recursion
    public static int factorial(int n){
        if (n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(multIter(8,5));
        System.out.println(multiRec(8,5));
        System.out.println(factorial(4));
    }
}