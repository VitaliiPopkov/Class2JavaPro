import java.util.Scanner;

public class Time {
    public static void main(String[] args) {
        int time;
        String textToPrint;
        System.out.println("What time is it? ");
        Scanner timeScanner = new Scanner(System.in);
        time = timeScanner.nextInt();

        if (time < 12) {
            textToPrint = "Good morning!";
        } else if (time < 20) {
            textToPrint = "Good day!";
        } else {
            textToPrint = "Good night";
        }
        System.out.println(textToPrint);
    }
}
