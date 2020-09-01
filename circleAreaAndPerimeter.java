import java.util.Scanner;

public class circleAreaAndPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double radius = Double.parseDouble(scanner.nextLine());
        double area = Math.PI*radius*radius;
        double perimeter = 2*Math.PI*radius;
        System.out.printf("Area = %f%n",area);
        System.out.printf("Perimeter = %f",perimeter);
    }
}
