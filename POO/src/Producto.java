public class Producto {
    private String nombre;
    private String fabricante;
    private int precio;

    //Constructor
    public Producto(String nombre, String fabricante, int precio) {
        this.nombre = nombre;
        this.fabricante = fabricante;
        this.precio = precio;
    }


    //Getter and Setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}



