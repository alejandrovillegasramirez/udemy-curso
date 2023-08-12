
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);//instacia de la clase scanner

        String nombreDeLaFactura;
        System.out.println("Ingrese el nombre de la factura");
        nombreDeLaFactura = scanner.nextLine();//next line deja esperando la consola hasta que el usuario ingrese

        //2 precios
        double precio1 = 0;
        System.out.println("Ingrese precio1");
        try{
            precio1 = scanner.nextDouble();
        }catch (Exception s){
            System.out.println("Numero decimal debe ir con comas");
            main(args);
            System.exit(0);//para terminar como STOP
        }

        double precio2 = 0;
        System.out.println("Ingrese precio2");
        try{
            precio2 = scanner.nextDouble();
        }catch (Exception s){
            System.out.println("Numero decimal debe ir con comas");
            main(args);
            System.exit(0);//para terminar como STOP
        }

        double sumaTotal = precio1 + precio2;
        double impuesto = sumaTotal * 19 / 100;

        System.out.println("La factura " + nombreDeLaFactura + " tiene un costo de " + sumaTotal + ", con un impuesto de " + impuesto + " y el total general es " + (sumaTotal+impuesto));
    }
}
