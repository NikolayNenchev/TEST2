import java.util.Scanner;

public class inchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double inches = Double.parseDouble(scanner.nextLine());
        double centimeters = inches * 2.54;
        System.out.println(centimeters);
    }
}
