package Alejandro.almacenventa;

public class Vendedores extends Persona{
    private int idVendedor;

    public Vendedores(String nombre, int identificacion, int idVendedor) {
        super(nombre, identificacion);
        this.idVendedor = idVendedor;
    }

    public int getIdVendedor() {
        return idVendedor;
    }
}
