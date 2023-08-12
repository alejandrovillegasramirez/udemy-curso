package Alejandro.almacenyverdureria;

public class Producto {
    private String nombre;
    private double precio;


    // constructor principal
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }


    //metodos getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
