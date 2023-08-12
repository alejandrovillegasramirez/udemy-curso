
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericosScanner {
    public static void main(String[] args) {
        //crear un objeto

        Scanner scanner = new Scanner(System.in);//instacia de la clase scanner
        System.out.println("Ingrese numero entero");
        //String numeroString = scanner.nextLine();//next line deja esperando la consola hasta que el usuario ingrese


        //trata de ejecutar el codigo
        int convertir = 0;


        try{
           convertir  = scanner.nextInt();//nextint convierte a entero todo lo que entra por consola
        }catch (InputMismatchException s) {
            System.out.println("EROOR");
            main(args);
            System.exit(0);//para terminar como STOP
        }
        System.out.println("numeroString = " + convertir);











    }
}
