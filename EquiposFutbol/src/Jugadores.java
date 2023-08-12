public class Jugadores {
    private String nombre;
    private int edad;
    private int habilidad;

    //los constructores
    public Jugadores(String nombre, int edad, int habilidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.habilidad = habilidad;
    }


    //los get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(int habilidad) {
        this.habilidad = habilidad;
    }
}
