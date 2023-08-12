
import java.util.Scanner;

public class EstanqueGasolina {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la cantidad actual de litros del estanque: ");
        int estadoActual = scanner.nextInt();

        //condiciones para la cantidad de litros
        if((estadoActual >= 60) && (estadoActual < 70)){
            System.out.println("Estanque casi lleno");
            System.exit(0);
        }
        if((estadoActual >= 40) && (estadoActual < 60)){
            System.out.println("Estanque 3/4");
            System.exit(0);
        }
        if((estadoActual >= 35) && (estadoActual < 40)) {
            System.out.println("Estanque medio");
            System.exit(0);
        }
        if((estadoActual >= 20) && (estadoActual < 35)) {
            System.out.println("Estanque suficiente");
            System.exit(0);
        }
        if((estadoActual >= 1) && (estadoActual < 20)) {
            System.out.println("Estanque insuficiente");
            System.exit(0);
        }
        if(estadoActual == 70 ){
            System.out.println("Estanque lleno totalmente");
            System.exit(0);
        }
    }
}


