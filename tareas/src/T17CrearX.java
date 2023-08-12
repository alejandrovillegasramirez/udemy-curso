import java.util.Scanner;

public class T17CrearX {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el n: ");
        int numero = scanner.nextInt();



        String[][] matriz = new String[numero][numero];

        // primero se llena con _
        for (int i = 0; i < numero; i++) {
            for (int j = 0; j < numero; j++) {
                matriz[i][j] = "_";
            }
        }

        //despues pongo las X, solo un for porque solo es en la fila
        for (int i = 0; i < numero;i++){
            matriz[i][i] = "X";
            matriz[i][numero - 1 - i] = "X";
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
