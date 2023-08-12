import java.util.Scanner;

public class NotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double contador = 0;
        double sumaTotal = 0;
        double sumaMayor5 = 0;
        int cantidad5 = 0;
        double sumaMenor4 = 0;
        int cantidad4 = 0;
        int cantidad1 = 0;
        //for para pedir notas
        for(int i = 0; i <= 19;i++){
            System.out.println("Por favor ingrese la nota " + (i+1)+ "\n" +  "1 nota mas baja, 7 nota mas alta.");
            try{
                double numero = scanner.nextDouble();
                if (numero > 7){ //cuando la nota es mas alta de 7
                    System.out.println("NOTA NO PERMITIDA");
                    i--;
                }
                if (numero > 5){//para las notas mayores a 5
                    sumaMayor5 = numero + sumaMayor5; //dos variables una para la suma y otra para la cantidad
                    cantidad5 ++;
                }
                if (numero < 4){ //para las que son menores a 4
                    sumaMenor4 = numero + sumaMenor4; //dos variables una para la suma y otra para la cantidad
                    cantidad4 ++;
                }
                if (numero == 1){ //para las de 1 solo es mostrar la cantidad
                    cantidad1++;
                }
                if ((numero >= 1) && (numero <= 7)){
                    sumaTotal = numero + sumaTotal;
                }
                if(numero == 0){
                    System.out.println("ERROR, FINALIZANDO EL PROGRAMA");
                    break;
                }
            }catch (Exception s){
                System.out.println("NUMERO DECIMAL DEBE IR CON COMAS");//condicional cuando se ingresa mal con punto
                System.exit(0);
            }
        }//finalización ciclo for
        System.out.println("Promedio de notas mayores a 5: " + (sumaMayor5 / cantidad5));//promedio suma mayor 5
        System.out.println("Promedio de notas menores a 4: " + (sumaMenor4 / cantidad4));//promedio menor a 4
        System.out.println("Cantidad de notas igual a 1: " + cantidad1);//cantidad de notas iguales a 1
    }
}
