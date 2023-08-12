import java.util.Scanner;

public class CalcularNumeroMayorDeMuchosValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int mayor;
        int menor;

        //pido el primer numero para comparar
        System.out.println("Ingrese numero: ");
        int num = scanner.nextInt();
        mayor = num;
        menor = num;



        //for para pedir numeros hasta 10
        for(int i = 0; i <= 9; i++){
            System.out.println("Ingrese numero: ");
            num = scanner.nextInt();

            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }


        //condicional para decir si es menor o mayor a 10
        if(menor < 10){
            System.out.println("El numero menor es = " + menor + " y es menor a 10");
        }
        else if (menor >= 10) {
            System.out.println("El numero menor es = " + menor + " y es mayor o igual a 10");
        }
    }
}
