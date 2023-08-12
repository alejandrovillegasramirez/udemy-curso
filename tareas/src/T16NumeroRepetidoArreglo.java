import java.util.Random;

public class T16NumeroRepetidoArreglo {
    public static void main(String[] args) {
        int[] arreglo = new int[10];
        //llenando con la clase random
        Random randomObj = new Random();
        int tamano = arreglo.length;

        for(int i=0; i < tamano ; i++){
            int azar = randomObj.nextInt(10);//pongo la condicion para que sea de 0 a 9
            arreglo[i] = azar;
            System.out.print(" " + arreglo[i]);
        }
        int elementoMas = 0;
        int mayorValor = 0;
        int contadorOcurrencias = 0;
        //ahora que tengo el arreglo, comparo cada dato con los demas
        for(int i=0; i < tamano ; i++){
            for(int j=0; j < tamano ; j++) {
                if (arreglo[i] == arreglo[j]) {
                    contadorOcurrencias++;
                }
                if (contadorOcurrencias > mayorValor) {
                    mayorValor = contadorOcurrencias;
                    elementoMas = arreglo[i];
                }
            }
        contadorOcurrencias = 0;
        }

        System.out.println("\n" + "Elemento que mas se repite = " + elementoMas);
        System.out.println("Veces que se repite = " + mayorValor);
    }
}
