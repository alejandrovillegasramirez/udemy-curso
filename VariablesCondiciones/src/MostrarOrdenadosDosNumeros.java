import java.util.Scanner;

public class MostrarOrdenadosDosNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //instancia para recibir del usuario

        int numero1 = 0;
        System.out.println("Ingrese primer numero");
        numero1 = scanner.nextInt(); // tomo lo que entra por teclado

        int numero2 = 0;
        System.out.println("Ingrese segundo numero");
        numero2 = scanner.nextInt(); // tomo lo que entra por teclado

        //prueba con operador ternario
        boolean mayorPrimero = numero1 > numero2 ? true : false;

        // para verificar si los numeros son iguales
        if(numero1 == numero2){
            System.out.println("Los numeros son iguales " + (numero1) + " y " + (numero2));
            System.exit(0);//si ya son iguales se acabó
        }
        //para verificar cual es el mayor
        if(mayorPrimero == true){
            System.out.println("El mayor " + numero1 + ", El menor " + numero2);
        }else{
            System.out.println("El mayor " + numero2 + ", El menor " + numero1);
        }
    }
}
