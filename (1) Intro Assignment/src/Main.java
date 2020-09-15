import java.util.Scanner;
// 1) solve for 'x' with an expression of ax + b = c where a, b, c are constants
// 2) Solve for 'x' with an expression of ax2+bx+c=d where a, b, c, d are constants
// 3) given 2 coordinates calculate the distance between the 2 spots on a cartesian plane
// 4) given 2 coordinates calculate the direction in degrees or radians, specify which in comment
// 2, 3, 4 unfinished, 1 finished
//2 is quadratic equation? ask how to do it later

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 1, 2, 3, or 4?");
        int question = scan.nextInt();
        if (question == 1){
            System.out.println("Formula is ax + b = c");
            System.out.println("What are 'a', 'b', and 'c'?");
            int ay = scan.nextInt();
            int bee = scan.nextInt();
            int see = scan.nextInt();
            Calculations findXone = new Calculations(ay, bee, see);
            System.out.println(findXone.questionOne());
        }

        else if (question == 2){
            System.out.println("Formula is ax^2 + bx + c = d");
            int ay = 3;
            int bee = 3;
            int see = 2;
            int dee = 20;
            Calculations findXtwo = new Calculations(ay, bee, see, dee);
            System.out.println(findXtwo.questionTwo());
        }




    }
}