import java.util.Scanner;

public class radiansToDegrees {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radians = Double.parseDouble(scanner.nextLine());
        double degrees = radians*57.29578;
        System.out.printf("%.0f",degrees);
    }
}
