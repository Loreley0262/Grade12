import java.util.Arrays;
import java.util.Scanner;
// 1) solve for 'x' with an expression of ax + b = c where a, b, c are constants
// 2) Solve for 'x' with an expression of ax2+bx+c=d where a, b, c, d are constants
// 3) given 2 coordinates calculate the distance between the 2 spots on a cartesian plane
// 4) given 2 coordinates calculate the direction in degrees or radians, specify which in comment
// 3, 4 unfinished, 1, 2 finished

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Question 1, 2, 3, or 4?");
        int question = scan.nextInt();
        if (question == 1){
            System.out.println("Formula is ax + b = c");
            System.out.println("What are 'a', 'b', and 'c'?");
            double ay = scan.nextDouble();
            double bee = scan.nextDouble();
            double see = scan.nextDouble();
            Calculations findXone = new Calculations(ay, bee, see);
            System.out.println(findXone.questionOne());
        }

        else if (question == 2){
            System.out.println("Formula is ax^2 + bx + c = d");
            System.out.println("What are 'a', 'b', 'c', and 'd'?");
            double ay = scan.nextDouble();
            double bee = scan.nextDouble();
            double see = scan.nextDouble();
            double dee = scan.nextDouble();

            Calculations findXtwo = new Calculations(ay, bee, see, dee);
            System.out.println(Arrays.toString(findXtwo.questionTwo()));
        }

        else if (question == 3){
            System.out.println("What are your points? (a,b), (c,d)");
            double ay = scan.nextDouble();
            double bee = scan.nextDouble();
            double see = scan.nextDouble();
            double dee = scan.nextDouble();
            Calculations findXthree = new Calculations(ay, bee, see, dee);
            System.out.println(findXthree.questionThree());
        }
        else if (question == 4){
            System.out.println("Think of 2");
            System.out.println("What are your points? (a,b), (c,d)");
            double ay = 3;
            double bee = 0;
            double see = 3;
            double dee = 3;
            Calculations findXfour = new Calculations(ay, bee, see, dee);
            System.out.println(findXfour.questionFour());
            System.out.println("aaaa");
        }


    }
}