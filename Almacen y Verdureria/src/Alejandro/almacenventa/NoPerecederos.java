package Alejandro.almacenventa;

public class NoPerecederos extends Productos{
    private int cantidad;
    private double peso;

    public NoPerecederos(String nombre, double precio, int cantidad, double peso) {
        super(nombre, precio);
        this.cantidad = cantidad;
        this.peso = peso;
    }

    public int getCantidad() {
        return cantidad;
    }
}
