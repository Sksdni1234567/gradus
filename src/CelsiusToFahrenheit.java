import java.util.Scanner;
public class CelsiusToFahrenheit {    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Введите температуру в градусах Цельсия: ");        double celsius = scanner.nextDouble();

    double fahrenheit = (celsius * 9 / 5) + 32;
    System.out.printf("Температура  в градусах Фаренгейта: %.2f°F%n", fahrenheit);

    scanner.close();    }
}