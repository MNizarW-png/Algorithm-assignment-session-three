import java.util.Scanner;

public class GradeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter grade: ");
        int grade = scanner.nextInt();
        
        if (grade >= 70 && grade <= 100) {
            System.out.println("pass");
        } else if (grade >= 0 && grade <= 69) {
            System.out.println("fail");
        } else {
            System.out.println("invalid");
        }
        scanner.close();
    }
}