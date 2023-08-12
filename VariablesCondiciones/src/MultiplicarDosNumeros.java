import java.util.Scanner;

public class MultiplicarDosNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //pido los numeros
        System.out.println("Ingrese numero 1: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese numero 2: ");
        int numero2 = scanner.nextInt();
        int suma = 0;
        //for para hacer multiplicacion (6*3)
        for(int i = 0;i < numero2;i++){
            suma = suma + numero1;
        }
        System.out.println("el resultado es = " + suma);
    }
}
