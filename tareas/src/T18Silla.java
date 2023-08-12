import java.util.Scanner;

public class T18Silla {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println("ingrese el n: ");
        //int numero = scanner.nextInt();
        int numero = 5;
        double division = (numero / 2D);//para poder que me salgan los valores decimales
        int numeroDividido = (int) Math.ceil(division);

        String[][] matriz = new String[numero][numero];

        // primero se llena con 0
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j] = "0";
            }
        }
        //leno la del medio
        for (int i = 0; i < numero;i++){
            matriz[numeroDividido -1][i] = "1";
        }

        //lleno las de antes del medio
        for (int i = 0; i < (numeroDividido -1);i++){
            matriz[i][0] = "1";
        }

        //lleno despues del medio
        for (int i = 0; i < (numeroDividido);i++){
            matriz[numero -1 - i][numero -1] = "1";
        }

        //imprimir
        for (int i = 0; i< matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
