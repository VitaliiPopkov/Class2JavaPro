import java.util.Scanner;

public class AverageMaxMin {
    public static void main(String[] args) {
        double num1, num2, num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input first number: ");
        num1 = scanner.nextDouble();
        System.out.println("input second number: ");
        num2 = scanner.nextDouble();
        System.out.println("input third number: ");
        num3 = scanner.nextDouble();

        double max, min;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        min = Math.min(num1, num2);
        min = Math.min(min, num3);

        double medianaFirstVersion;
        if (num1 > min && num1 < max) {
            medianaFirstVersion = num1;
        }
        else if (num2 > min && num2 < max) {
            medianaFirstVersion = num2;
        }
        else {
            medianaFirstVersion = num3;
        }

        double medianaSecondVersion = num1;
        if (medianaSecondVersion == max || medianaSecondVersion == min) {
            medianaSecondVersion = num2;
            if (medianaSecondVersion == max || medianaSecondVersion == min) {
                medianaSecondVersion = num3;
            }
        }

        double medianaThirdVersion;
        if (num1 >= num2) {
            if (num3 <= num2) {
                medianaThirdVersion = num2;
            }
            else {
                medianaThirdVersion = Math.min(num3, num1);
            }
        }
        else {
            if (num1 >= num3) {
                medianaThirdVersion = num1;
            }
            else {
                medianaThirdVersion = Math.min(num2, num3);
            }
        }

        double medianaFourthVersion;
        if (num1 >= num2 && (num1 <= num3) || (num1 <= num2 && num1 >= num3)) {
            medianaFourthVersion = num1;
        } else if (num2 >= num1 && (num2 <= num3) || (num2 <= num1 && num2 >= num3)) {
            medianaFourthVersion = num2;
        } else {
            medianaFourthVersion = num3;
        }

        System.out.println("Max - " + max);
        System.out.println("Min - " + min);
        System.out.println("Mediana first version - " + medianaFirstVersion);
        System.out.println("Mediana second version - " + medianaSecondVersion);
        System.out.println("Mediana third version - " + medianaThirdVersion);
        System.out.println("Mediana fourth version - " + medianaFourthVersion);
    }
}