import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double ft = scanner.nextDouble();
        double cm = (ft * 30.48);
        System.out.printf("%.1f\n",cm);

        scanner.close();       
    }
}