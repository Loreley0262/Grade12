import java.util.Scanner;

public class Main {
    static int n1 = 0;
    static int n2 = 1;
    static int n3 = 0;
    public static int fibo(int n){
        int result;
        //base case
        if (n<=0){
            return 0;
        }
        //recursive step
        else{
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" "+n3);
            fibo(n-1);
        }
        return n3;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("how many nums in sequence should be shown?");
        int fiboNums = 6;
        fibo(fiboNums);
    }
}
