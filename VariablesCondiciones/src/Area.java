import java.util.Scanner;

public class Area {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            //pido el radio del circulo
            System.out.println("Ingrese radio: ");
            double radio = scanner.nextDouble();
            //solo utilizo math.pi para sacar el valor de PI
            double areaCirculo = (Math.PI * ((radio) * (radio)));

            //una forma de redondear para solo mostrar dos decimales con Math
            System.out.println("areaCirculo = " + Math.round(areaCirculo * 100)/100d);
        } catch (Exception e) {
            System.out.println("El numero decimal debe ir con comas");
        }
    }
}
