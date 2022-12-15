import java.util.Scanner;

public class Disckrininant {
    public static void main(String[] args) {
        double Disc, a, b, c, X1, X2, X;
        System.out.println("Enter a: ");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        System.out.println("Enter b: ");
        b = scanner.nextDouble();
        System.out.println("Enter c: ");
        c = scanner.nextDouble();
        Disc = Math.pow(b, 2) - 4 * a * c;
        System.out.println(Disc);
        if (Disc > 0) {
            X1 = (-b + Math.sqrt(Disc)) / 2 * a;
            X2 = (-b - Math.sqrt(Disc)) / 2 * a;
            System.out.println("roots of equations: X1 = " + X1);
            System.out.println("roots of equations: X2 = " + X2);
        } else if (Disc == 0) {
            X = -b / 2 * a;
            System.out.println("The equation has one root: X = " + X);
        } else {
            System.out.println("This equation has no roots");
        }

    }
}
