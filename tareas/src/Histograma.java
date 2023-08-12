import java.util.Arrays;
import java.util.Random;

public class Histograma {
    public static void main(String[] args) {
        int[] arreglo = new int[12];
        // Llenando con la clase Random
        Random randomObj = new Random();
        int tamano = arreglo.length;

        for (int i = 0; i < tamano; i++) {
            int azar = 1 + randomObj.nextInt(7); // Pongo la condición para que sea de 1 a 6
            arreglo[i] = azar;
            System.out.print(" " + arreglo[i]);
        }
        //se ordenan para comparar con el anterior asi es mas facil
        System.out.println("\n");
        System.out.println("Arreglo ordenado");
        Arrays.sort(arreglo); // Ordenar el arreglo de menor a mayor
        for (int i = 0; i < tamano; i++) {
            System.out.print(" " + arreglo[i]);
        }
        System.out.println("\n");

        int contadorOcurrencias = 0;
        int valorAnterior = arreglo[0];

        // Recorro el arreglo ordenado y cuento las ocurrencias de cada valor
        for (int i = 0; i < tamano; i++) {
            if (arreglo[i] == valorAnterior) {
                contadorOcurrencias++;
            } else {
                System.out.println(valorAnterior + ":" + asteriscos(contadorOcurrencias));
                valorAnterior = arreglo[i];
                contadorOcurrencias = 1; // Reinicio el contador para el nuevo valor
            }
        }

        // Imprimir la última ocurrencia después de salir del bucle
        System.out.println(valorAnterior + ":" + asteriscos(contadorOcurrencias));
    }

    public static String asteriscos(int cantidad) {
        // Recibe la cantidad de asteriscos que necesitas
        StringBuilder aste = new StringBuilder();
        for (int i = 0; i < cantidad; i++) {
            aste.append("*"); // Agrego la cantidad de asteriscos
        }
        return aste.toString(); // Me devuelve la cantidad de asteriscos que necesito
    }
}

