import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number1: ");
        int limit = scanner.nextInt();
        displayNaturalNumbers(limit);
        scanner.close();
    }
    public static void displayNaturalNumbers(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
