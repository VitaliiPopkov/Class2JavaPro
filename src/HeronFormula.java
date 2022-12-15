import java.util.Scanner;
import java.lang.Math;

public class HeronFormula {
    public static void main(String[] args) {
        double a, b, c, P, S;

        Scanner in = new Scanner(System.in);
        System.out.println("Input number A: ");
        a = in.nextDouble();
        System.out.println("Input number B: ");
        b = in.nextDouble();
        System.out.println("Input number C: ");
        c = in.nextDouble();
        P = (a + b + c) / 2;
        System.out.println("Perimeter: " + P);
        S = (Math.sqrt(P * (P - a) * (P - b) * (P - c)));
        System.out.printf("Square: " + S);


    }
}
