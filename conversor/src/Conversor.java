import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Conversor");
        System.out.println("1. Conversor de Unidades");
        System.out.println("2. Conversor de Temperaturas");
        System.out.print("Selecciona una opción (1/2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            convertirUnidades(scanner);
        } else if (opcion == 2) {
            convertirTemperaturas(scanner);
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }

    public static void convertirUnidades(Scanner scanner) {
        System.out.println("Conversor de Unidades");
        System.out.print("Ingresa la cantidad en metros: ");
        double metros = scanner.nextDouble();

        double pies = metros * 3.281;
        double pulgadas = metros * 39.37;

        System.out.println(metros + " metros es igual a:");
        System.out.println(pies + " pies");
        System.out.println(pulgadas + " pulgadas");
    }

    public static void convertirTemperaturas(Scanner scanner) {
        System.out.println("Conversor de Temperaturas");
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsius * 9/5 + 32;
        double kelvin = celsius + 273.15;

        System.out.println(celsius + " grados Celsius es igual a:");
        System.out.println(fahrenheit + " grados Fahrenheit");
        System.out.println(kelvin + " Kelvin");
    }
}
