import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CalcularFecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //primero pido la fechas
        System.out.println("Ingrese fecha de nacimiento dd-mm-yyyy: ");
        String porUsuario = scanner.next();
        //creo el formato para utilizar la fecha
        SimpleDateFormat format = new SimpleDateFormat("dd-mm-yyyy");

        try {
            //tomo la fecha nacimiento de usuario
            Date fechaNacimiento = format.parse(porUsuario);
            //tomo la fecha actual
            Date fechaActual = new Date();

            //resto los milisegundos de una con otra
            long restaAnios = fechaActual.getTime() - fechaNacimiento.getTime();
            //en esta parte tengo la derencia en milisegundos de la fecha actual y la fecha
            long anios = restaAnios / (1000L * 60L * 60L * 24L * 365L);//esta formula saca la cantidad de milisegundos en un año
            System.out.println(anios);

        } catch (ParseException e) {
            System.out.println("Formato fecha incorrecto");
        }
    }
}
