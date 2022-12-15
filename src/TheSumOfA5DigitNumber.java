import java.util.Scanner;

public class TheSumOfA5DigitNumber {
    public static void main(String[] args) {
        int num, sumOfNumbers;
        int firstNum, secondNum, thirdNum, fourthNum, fifthNum;
        System.out.println("Enter a 5 digit number: ");
        Scanner numScanner = new Scanner(System.in);
        num = numScanner.nextInt();
        firstNum = (num/10000)%10;
        secondNum = (num/1000)%10;
        thirdNum = (num/100)%10;
        fourthNum = (num/10)%10;
        fifthNum = num%10;
        sumOfNumbers = firstNum + secondNum + thirdNum +fourthNum + fifthNum;
        System.out.println("The sum of a 5 digit number is: " + sumOfNumbers);






    }
}
