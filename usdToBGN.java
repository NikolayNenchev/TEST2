import java.util.Scanner;

public class usdToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double usd = Double.parseDouble(scanner.nextLine());
        double bgn = usd * 1.79549;
        System.out.printf("%.2f BGN",bgn);
    }
}
