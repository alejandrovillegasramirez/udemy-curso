import java.util.Locale;

public class ProgramaBueno {
    public static void main(String[] args) {
        String nombre1 = "Alejandro";
        String nombre2 = "Pedro";
        String nombre3 = "Maria";

        String primerCaracter1 = (nombre1.toUpperCase().charAt(1) + "." + nombre1.substring(nombre1.length()-2)); //traigame el tamaño, los dos ultimos
        String primerCaracter2 = (nombre2.toUpperCase().charAt(1) + "." + nombre2.substring(nombre2.length()-2)); //traigame el tamaño, los dos ultimos
        String primerCaracter3 = (nombre3.toUpperCase().charAt(1) + "." + nombre3.substring(nombre3.length()-2)); //traigame el tamaño, los dos ultimos

        String resultadoFinal = (primerCaracter1 + "_" + primerCaracter2 + "_" + primerCaracter3);
        System.out.println(resultadoFinal);
    }
}
