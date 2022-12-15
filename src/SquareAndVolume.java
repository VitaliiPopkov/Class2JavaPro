import java.util.Scanner;

public class SquareAndVolume {
    public static void main(String[] args) {
        double a, V, S;
        System.out.println("input A");
        Scanner scanner = new Scanner(System.in);
        a = scanner.nextDouble();
        V = Math.pow(a, 3);
        System.out.println("Volume is: " + V + " m^3");
        S = 6 * Math.pow(a, 2);
        System.out.println("Square is: " + S + " m^2");

    }
}
