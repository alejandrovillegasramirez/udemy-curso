import java.util.Scanner;

public class T15SistemaEstadisticoArreglo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[7];
        int tamano = numeros.length;
        //ya tengo el arreglo con los numeros
        for(int i=0; i < tamano; i++) {
            System.out.print("Ingrese siete numeros enteros "  + (i+1) + " : ");
            numeros[i] = scanner.nextInt();
        }

        int sumaNegativos = 0;
        int sumaPositivos = 0;
        int contarCeros = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        for(int i=0; i < tamano; i++) {

            if(numeros[i] == 0){
                contarCeros ++;
            }
            if(numeros[i] > 0){
                sumaPositivos = sumaPositivos + numeros[i];
                contadorPositivos++;
            }
            if(numeros[i] < 0){
                sumaNegativos = sumaNegativos + numeros[i];
                contadorNegativos++;
            }
        }
        System.out.println("contadorNegativos = " + contadorNegativos);
        System.out.println("contadorPositivos = " + contadorPositivos);
        System.out.println("sumaPositivos = " + sumaPositivos);
        System.out.println("sumaNegativos = " + sumaNegativos);


        //ahora realizo el promedio
        double promedioNegativo = sumaNegativos / contadorNegativos;
        double promedioPositivo = sumaPositivos / contadorPositivos;

        System.out.println("El promedio de los numeros positivos es = " + promedioPositivo);
        System.out.println("El promedio de los numeros negativos es = " + promedioNegativo);
        System.out.println("La cantidad de ceros es = " + contarCeros);
    }
}
