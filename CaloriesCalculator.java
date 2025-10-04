import java.util.Scanner;

public class CaloriesCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter minutes of running: ");
        int runningMinutes = scanner.nextInt();

        System.out.print("Enter minutes of push-ups: ");
        int pushupMinutes = scanner.nextInt();

        System.out.print("Enter minutes of planks: ");
        int plankMinutes = scanner.nextInt();

        
        double runningCalories = (60.0 / 5) * runningMinutes;
        double pushupCalories = (200.0 / 30) * pushupMinutes;
        double plankCalories = 5.0 * plankMinutes;

        double totalCalories = runningCalories + pushupCalories + plankCalories;

        
        System.out.println("Calories burned from running: " + runningCalories);
        System.out.println("Calories burned from push-ups: " + pushupCalories);
        System.out.println("Calories burned from planks: " + plankCalories);
        System.out.println("Total calories burned: " + totalCalories);

        scanner.close();
    }
}