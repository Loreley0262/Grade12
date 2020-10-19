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
            return 1;
        }
        //recursive step
        result = a-1+fibo(a-2);
        return result;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(multiRec(3,2));
        System.out.println("how many numbers in the sequence should be printed?");
        int fiboLength = 3;
        System.out.println(fibo(fiboLength));
//        int fiboLength = scan.nextInt();
    }
}
