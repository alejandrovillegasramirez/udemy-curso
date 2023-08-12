package Alejandro.almacenventa;

public class Productos {
    private String nombre;
    private double precio;

    //constructor
    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //getter
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
}
