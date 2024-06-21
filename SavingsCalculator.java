import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Days ");
        int numberOfDays = scanner.nextInt();
        System.out.print("Enter the Number of Daily deposit ");
        int dailyAmount = scanner.nextInt();
        int totalSavings = 0;
        for (int day = 1; day <= numberOfDays; day++) {
            totalSavings += dailyAmount;
            System.out.println("Day " + day + " Deposit " + dailyAmount + " total is " + totalSavings);
            dailyAmount *= 2;
        }
    }
}
