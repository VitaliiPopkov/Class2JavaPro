import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first number: ");
        num1 = scanner.nextDouble();
        System.out.println("input second number: ");
        num2 = scanner.nextDouble();
        System.out.println("The greater number of 2 numbers is: " + Math.max(num1, num2));
        System.out.println("The smaller number of 2 numbers is: " + Math.min(num1, num2));



    }
}
