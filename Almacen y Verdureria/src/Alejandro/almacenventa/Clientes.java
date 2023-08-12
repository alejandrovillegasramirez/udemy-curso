package Alejandro.almacenventa;

public class Clientes extends Persona{
    private String sexo;

    public Clientes(String nombre, int identificacion, String sexo) {
        super(nombre, identificacion);
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }
}
