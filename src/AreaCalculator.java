import java.util.Scanner;

public class AreaCalculator {

    public static double calculateArea(float radius) {
        return 3.14 * radius * radius;
    }

    public static double calculateArea(float length, float breadth) {
        return length * breadth;
    }

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float r = sc.nextFloat();
        float l = sc.nextFloat();
        float b = sc.nextFloat();
        double base = sc.nextDouble();
        double height = sc.nextDouble();

        System.out.printf("%.2f%n", calculateArea(r));
        System.out.printf("%.2f%n", calculateArea(l, b));
        System.out.printf("%.2f%n", calculateArea(base, height));

        sc.close();
    }
}
