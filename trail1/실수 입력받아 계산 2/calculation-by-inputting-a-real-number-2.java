import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        System.out.printf("%.2f\n",a+1.5);

        scanner.close();
    }
}