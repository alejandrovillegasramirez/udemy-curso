package Alejandro.almacenyverdureria;

public class Limpieza extends Producto{
    private String componentes;
    private double litros;


    //constructor de limpieza
    public Limpieza(String nombre, double precio, String componentes, double litros) {
        super(nombre, precio);
        this.componentes = componentes;
        this.litros = litros;
    }


    //getter de limpieza
    public String getComponentes() {
        return componentes;
    }

    public double getLitros() {
        return litros;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncomponentes='" + componentes + '\'' +
                ", litros=" + litros +
                '}';
    }
}