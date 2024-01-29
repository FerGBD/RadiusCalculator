package util;
import java.util.Scanner;  // Importa a classe Scanner

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Cria um objeto Scanner para entrada do usuário

        Calculator calc = new Calculator();
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = calc.circumference(radius);
        double v = calc.volume(radius);
        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI);

        // Fecha o Scanner para evitar vazamentos de recursos
        sc.close();
    }

    // Torna a classe Calculator uma classe estática para poder ser utilizada dentro da classe Main
    public static class Calculator {
        public final double PI = 3.14159;

        public double circumference(double radius) {
            return 2.0 * PI * radius;
        }

        public double volume(double radius) {
            return 4.0 * PI * radius * radius * radius / 3.0;
        }
    }
}
