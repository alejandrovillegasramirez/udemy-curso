import java.util.Random;

public class T14ImprimeNumeroMasAlto {
    public static void main(String[] args) {
        int[] numeros = new int[7];//array principal

        //llenando con la clase random
        Random randomObj = new Random();
        int tamano = numeros.length;
        for(int i=0; i < tamano ; i++){
            //pongo la condicion para que sea de 11 a 99
            int azar = 11 + randomObj.nextInt(99 - 11);
            numeros[i] = azar;
            System.out.println("numeros = " + numeros[i]);
        }
        //ya tengo el arreglo entonces, tomo el mayor
        int mayor= numeros[0];

        for(int i=1; i<tamano; i++){//el for comieza en 1 porque el 0 ya lo tomo como mayor
            if(numeros[i] > mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("el numero mayor es  = " + mayor);
    }
}
