import java.util.Scanner;

public class trapezoidArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Double side1 = Double.parseDouble(scanner.nextLine());
        Double side2 = Double.parseDouble(scanner.nextLine());
        Double sideHeight = Double.parseDouble(scanner.nextLine());
        double area = (side1+side2)*sideHeight/2.0;
        System.out.println(area);
    }
}
