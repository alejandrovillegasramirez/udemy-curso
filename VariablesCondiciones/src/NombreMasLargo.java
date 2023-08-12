import javax.swing.*;
public class NombreMasLargo {
    public static void main(String[] args) {
        //capturo los nombres de las personas
        String nombre1 = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido 1 persona"); //para pedir por pantalla
        String nombre2 = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido 2 persona"); //para pedir por pantalla
        String nombre3 = JOptionPane.showInputDialog(null, "Ingrese nombre y apellido 3 persona"); //para pedir por pantalla
        //String nombre1 = "Camilo Lopez";
        //String nombre2 = "Alejandro Villegas";
        //tring nombre3 = "Janeth Ramirez";

        //le quito los espacios asi obtengo todos los caracteres
        int nombre1t = nombre1.replace(" ","").length();
        int nombre2t = nombre2.replace(" ","").length();
        int nombre3t = nombre3.replace(" ","").length();

        //condicional para ir imprimiendo el nombre con mas caracteres
        if((nombre1t > nombre2t) && (nombre1t > nombre3t)){
            System.out.println("El nombre mas largo es = " + nombre1 + " con " + nombre1t + " caracteres");
            System.exit(0);
        }
        if((nombre2t > nombre1t) && (nombre2t > nombre3t)){
            System.out.println("El nombre mas largo es = " + nombre2 + " con " + nombre2t + " caracteres");
            System.exit(0);
        }
        if((nombre3t > nombre1t) && (nombre3t > nombre2t)){
            System.out.println("El nombre mas largo es = " + nombre3 + " con " + nombre3t + " caracteres");
            System.exit(0);
        }
    }
}
