import java.sql.SQLOutput;

public class Calculations {
    int x;
    int a;
    int b;
    int c;
    int d;
    int w;
    int j;

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getC() {
        return c;
    }
    public void setC(int c) {
        this.c = c;
    }

    Calculations(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    Calculations(int a, int b, int c, int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public int questionOne(){
        System.out.println("Question 1: ");
        System.out.println("ax + b = c");
        System.out.printf("%dx + %d = %d" , a, b, c);
        int w = c-b;
        System.out.println();
        System.out.printf("%dx = %d" , a, w);
        System.out.println();
        int j = w/a;
        System.out.println("x = " + j);
        System.out.println("ANSWER:");
        return j;
    }

    public int questionTwo(){
        System.out.println("Question 2:");
        System.out.println("ax^2 + bx + c = d");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = " + d);
        c = c-d;
        System.out.println(a + "x^2 + " + b + "x + " + c + " = " + 0);



        System.out.println();
        System.out.println();
        return w;
    }

    public String toString(){
        return "x = " + x;
    }
}
