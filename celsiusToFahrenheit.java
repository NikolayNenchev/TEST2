import java.util.Scanner;

public class celsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double celsius = Double.parseDouble(scanner.nextLine());
        double fahrenheit = celsius*1.8 + 32;
        System.out.printf("%.2f",fahrenheit);
    }
}
