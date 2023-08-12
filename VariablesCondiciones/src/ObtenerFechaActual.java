import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ObtenerFechaActual {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese fecha de nacimiento dd-mm-yyyy: ");
        String porUsuario = scanner.next();

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        try {
            Date fechaNacimiento = format.parse(porUsuario);

            // Obtener la fecha actual
            Date fechaActual = new Date();

            // Calcular la edad (en este caso, la diferencia en milisegundos)
            long diferenciaMilisegundos = fechaActual.getTime() - fechaNacimiento.getTime();
            long diferenciaAnios = diferenciaMilisegundos / (1000L * 60L * 60L * 24L * 365L);
            System.out.println("La edad es: " + diferenciaAnios + " años.");
        } catch (ParseException e) {
            System.out.println("El formato de fecha ingresado es incorrecto.");
        }
    }
}
