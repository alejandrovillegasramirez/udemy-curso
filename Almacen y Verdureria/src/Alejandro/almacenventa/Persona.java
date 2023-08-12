package Alejandro.almacenventa;

public class Persona {
    private String nombre;
    private int identificacion;

    //constructor
    public Persona(String nombre, int identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
       
    }



    //getter
    public String getNombre() {
        return nombre;
    }

    public int getIdentificacion() {
        return identificacion;
    }
}
