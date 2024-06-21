import java.util.Scanner;

public class SavingsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number of Days ");
        int numberOfDays = scanner.nextInt();
        System.out.print("Enter the Number of Daily deposit ");
        int dailyAmount = scanner.nextInt();
        System.out.print("Enter the Target Saving ");
        int targetSaving = scanner.nextInt();
        int totalSavings = 0;
        int day = 0;
        while (totalSavings < targetSaving) {
            day++;
            totalSavings += dailyAmount;
            System.out.println("Day " + day + ": Deposit " + dailyAmount + " baht, Total savings: " + totalSavings + " baht");
            dailyAmount *= 2;
        }
        System.out.println("It will take " + day + " days to save at least " + targetSaving + " bahts.");
    }
}
