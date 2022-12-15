import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        double num1, num2, result;
        char operator;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input.nextDouble();
        System.out.println("Enter the operator: ");
        operator = input.next().charAt(0);
        System.out.println("Enter the second number: ");
        num2 = input.nextDouble();
        switch (operator) {
            case ('+'):
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;
            case ('-'):
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;
            case ('/'):
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;
            case ('*'):
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;
        }


    }
}
