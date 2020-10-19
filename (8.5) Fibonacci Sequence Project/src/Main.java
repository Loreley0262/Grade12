import java.util.Scanner;

public class Main {

    public static int fibo(int n){
        int result;
        //base case
        if(n==1||n==2){
            return 1;
        }
        //recursive step
        result = fibo(n-1) + fibo(n-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("index of num in sequence to be printed");
        int fibothNum = scan.nextInt();
        System.out.println(fibo(fibothNum));
    }
}
