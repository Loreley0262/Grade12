import java.util.Scanner;

public class Main {
    /*          TOWERS OF HANOI HINT FROM SWAY THINGY
    To solve this we know we need to move the
rings from pylon 1 to pylon 3
To accomplish this goal we have to move all but
the largest ring to pylon 2
Then we move the largest ring to pylon 3
Next we move all but the second largest ring to
pylon 1 then move the second largest ring to
pylon 3
And repeat
How do we use inductive reasoning to write this
code to move n rings?
When n = 1 this is our base case we simply
move it from wherever it is to pylon 3
Then our recursive steps are just the pattern
described above
Move n-1 rings from p1 to p2
Then move 1  ring from p1 to p3
Then move n-1 rings from p2 to p3
The inductive reasoning and the recursive call
handles to the rest
    * */


    public static void printMove(String from, String to){
        System.out.println("From: " + from + "\tTo: " + to);
    }
    public static void hanoi(int n, String from, String to, String spare){
        if(n==1){
            printMove(from, to);
        }
        else{
            hanoi(n-1, from, spare, to);
            printMove(from, to);
            hanoi(n-1, spare, to, from);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("choose how many rings");
        int n = scan.nextInt();
        hanoi(n, "p1", "p3", "p2");

    }
}

    /* 3          4
    1 to 3      1 to 2
    1 to 2      1 to 3
    3 to 2      2 to 3
    1 to 3      1 to 2
    2 to 1      3 to 1
    2 to 3      3 to 2
    1 to 3      1 to 2
                1 to 3
                2 to 3
                2 to 1
                3 to 1
                2 to 3
                1 to 2
                1 to 3
                2 to 3
    */
 /*
    1 to 2 = a
    1 to 3 = b
    2 to 3 = c
    2 to 1 = d
    3 to 1 = e
    3 to 2 = f
    */