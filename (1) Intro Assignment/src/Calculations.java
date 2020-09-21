import com.sun.deploy.security.SelectableSecurityManager;

import java.sql.SQLOutput;

public class Calculations {
    double x;
    double ex;
    double a;
    double b;
    double c;
    double d;
    boolean tex;
    boolean tx;

    Calculations(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Calculations(double a, double b, double c, double d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }


    public double questionOne(){
        System.out.println("Question 1: ");
        System.out.println("ax + b = c");
        System.out.printf("%.1fx + %.1f = %.1f" , a, b, c);
        double w = c-b;
        System.out.println();
        System.out.printf("%.1fx = %.1f" , a, w);
        System.out.println();
        double x = w/a;
        System.out.println("x = ");
        return x;
    }

    public double[] questionTwo(){
        System.out.println("Question 2:");
        System.out.println("ax^2 + bx + c = d");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = " + d);
        double cee = c-d;
        System.out.println(a + "x^2 + " + b + "x + " + cee + " = " + 0);
        System.out.printf("\na = %.3f, b = %.3f, c = %.3f\n", a, b, cee);
        //quadratic equation starts here
        System.out.println("x = (-b\u00B1\u221Ab^2-4ac)/2a");
        System.out.printf("x = [-%.3f\u00B1\u221A%.3f^2-4(%.3f)(%.3f)]/2(%.3f)\n", b, b, a, cee, a);
        double bb = b*b;
        double ac = -4*a*cee;
        double denom = 2*a;
        double bn = b*-1;
        System.out.printf("x = (%.3f\u00B1\u221A%.3f+%.3f)/%.3f\n", bn, bb, ac, denom);
        double bbac = bb+ac;
        System.out.printf("x = (%.3f\u00B1\u221A%.3f)/%.3f\n", bn, bbac, denom);
        System.out.printf("x = (%.3f+\u221A%.3f)/%.3f, (%.3f-\u221A%.3f)/%.3f\n", bn, bbac, denom, bn, bbac, denom);
        ex = x;
        x = bn - Math.sqrt(bbac);
        x = x/denom;
        ex = bn + Math.sqrt(bbac);
        ex = ex/denom;
        //System.out.println("--------------------------------");
       // System.out.println("ax^2 + bx + c = d");
       // System.out.printf("%.1f(%.1f)(%.1f) + %.1f(%.1f) + %.1f = %.1f\n", a, x, x, b, x, c, d);
        double axx = a*x*x;
        double bx = b*x;
       //System.out.printf("%.1f + %.1f + %.1f = %.1f\n", axx, bx, c, d);
        double ans = axx+bx+c;
       // System.out.println("ax^2 + bx + c = d");
        //System.out.printf("%.1f(%.1f)(%.1f) + %.1f(%.1f) + %.1f = %.1f\n", a, ex, ex, b, ex, c, d);
        double axxe = a*ex*ex;
        double bxe = b*ex;
       // System.out.printf("%.1f + %.1f + %.1f = %.1f\n", axx, bx, c, d);
        double anse = axxe+bxe+c;
        tx = ans == d;
        tex = anse == d;

        int p = 2;
        if (x == ex){
            tex = false;
            p = 1;
        }
        double[] answer = new double[p];
        if(tx && tex){
            answer[0] = x;
            answer[1] = ex;
        }
        else if(tx){
            answer[0] = x;
        }
        else if (tex){
            answer[0] = ex;
        }
        else {
            return null;
        }

        return answer;
    }

    public double questionThree(){
        System.out.println("Question 3: ");
        System.out.printf("Points: (%.1f, %.1f), (%.1f, %.1f)\n", a, b, c, d);
        double up = Math.abs(d-b);
        double side = Math.abs(c-a);
        System.out.println("a^2 + b^2 = c^2\n");
        System.out.printf("%.1f^2 + %.1f^2 = c^2\n", up, side);
        double squp = up*up;
        double sqside = side*side;
        System.out.printf("%.1f + %.1f = c^2\n", squp, sqside);
        double tot = squp+sqside;
        System.out.printf("%.1f = c^2\n", tot);
        double ans = Math.sqrt(tot);
        System.out.println("c = ");
        return ans;
    }

    public String questionFour(){
        System.out.println("Question 4: ");
        System.out.printf("Points: (%.1f, %.1f), (%.1f, %.1f)\n", a, b, c, d);
        //tangent b/c its opposite and adjacent
        //direction as in vector? "direction and magnitude"?
        //formula = tan(theta) = (y2-y1)/(x2-x1)
        System.out.println("tan(\u03F4) = (y2-y1)/(x2-x1)");
        System.out.printf("tan(\u03F4) = (%.1f-%.1f)/(%.1f-%.1f)\n", d, b, c, a);
        double db = d-b;
        double ca = c-a;
        System.out.printf("tan(\u03F4) = (%.1f)/(%.1f)\n", db, ca);
        System.out.printf("\u03F4 = tan^-1[(%.1f)/(%.1f)]\n", db, ca);
        double aTanned = Math.atan(db/ca);
        aTanned = Math.toDegrees(aTanned);
        System.out.printf("\u03F4 = %.3f\n", aTanned);
        return "";
    }


}
