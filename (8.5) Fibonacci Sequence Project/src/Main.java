import java.util.Scanner;

public class Main {
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
    public static int fibo(int a){
        int result = 0;
        int[] sequence = new int[a];
        //base case
        if(a==1||a==2){
            sequence[a] = 1;
        }
        //recursive step
        sequence[a] = fibo(a-1);
        System.out.println(result);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(multiRec(3,2));
        System.out.println("index of num in sequence to be printed");
        int fibothnum = 3;
        System.out.println(fibo(fibothnum));
//        int fiboLength = scan.nextInt();
    }
}
