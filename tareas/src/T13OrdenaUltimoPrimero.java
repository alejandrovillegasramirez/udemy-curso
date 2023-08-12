import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Thread.sleep;
/*Leer 10 números enteros desde el teclado para llenar un arreglo de 10 elementos.
        Luego debemos mostrarlos en el siguiente orden: el último, el primero, el penúltimo,
        el segundo, el antepenúltimo, el tercero, y así sucesivamente*/

public class T13OrdenaUltimoPrimero {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//capturo por el teclado
        int[] numeros = new int[10];
        //for para llenar el arreglo con enteros
        for(int i=0; i < numeros.length ;i++){
            System.out.println("Ingrese el numero " + (i + 1) + " entero");
            numeros[i] = scanner.nextInt();
        }
        esperar(2);
        //for(int i=0; i < numeros.length ;i++) {
        //    System.out.println("arreglo de numeros = " + numeros[10]);
        //}
        // se usa lenght para hacerlo mas dinamico
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 1]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 10]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 9]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 2]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 8]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 3]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 7]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 4]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 5]);
        System.out.println("arreglo de numeros = " + numeros[numeros.length - 6]);

    }
    public static void esperar(int segundos){//funcion para esperar
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}