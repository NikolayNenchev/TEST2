import java.util.Scanner;

public class rectangleArea2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = Double.parseDouble(scanner.nextLine());
        double y1 = Double.parseDouble(scanner.nextLine());
        double x2 = Double.parseDouble(scanner.nextLine());
        double y2 = Double.parseDouble(scanner.nextLine());
        double heigth = Math.abs(x1 -x2);
        double width = Math.abs(y1 -y2);
        double area = width * heigth;
        double perimeter = 2*(width+heigth);
        System.out.println(area);
        System.out.println(perimeter);
    }
}
