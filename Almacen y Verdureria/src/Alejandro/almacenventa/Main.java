package Alejandro.almacenventa;

import Alejandro.almacenyverdureria.Fruta;
import Alejandro.almacenyverdureria.Producto;

public class Main {
    public static void main(String[] args) {

       Persona cliente1 = new Clientes("Alberto",45236,"M");
       Persona vendedor1 = new Vendedores("Pacho",4896,21);
       Producto producto1 = new Fruta("papaya",14,4,"naranja");

        System.out.println("El vendedor1 es = " + cliente1.getNombre() +
                ". Identificado con " + cliente1.getIdentificacion()
                    + ", y su fruta favorita es " + producto1.getNombre());
    }
}
