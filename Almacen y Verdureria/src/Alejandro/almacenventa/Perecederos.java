package Alejandro.almacenventa;

public class Perecederos extends Productos{
    private double peso;
    private int cantidad;

    public Perecederos(String nombre, double precio, double peso, int cantidad) {
        super(nombre, precio);
        this.peso = peso;
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }
}
