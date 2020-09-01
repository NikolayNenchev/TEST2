import java.util.Scanner;

public class triangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double side = Double.parseDouble(scanner.nextLine());
        Double heigth = Double.parseDouble(scanner.nextLine());
        double area = side * heigth / 2.0;
        System.out.printf("Triangle area = %.2f",area);
    }
}
