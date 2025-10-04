import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        int a = scanner.nextInt();

        System.out.print("Enter b: ");
        int b = scanner.nextInt();

        System.out.print("Enter c: ");
        int c = scanner.nextInt();

        int largest = a;
        char var = 'a';

        if (b > largest) {
            largest = b;
            var = 'b';
        }
        if (c > largest) {
            largest = c;
            var = 'c';
        }

        System.out.println("The largest number is " + var + " = " + largest);

        scanner.close();
    }
}