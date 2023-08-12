public class Equipos {
    private String nombre;
    private String dirTectico;
    private String sede;


    //el constructor
    public Equipos(String nombre, String dirTectico, String sede) {
        this.nombre = nombre;
        this.dirTectico = dirTectico;
        this.sede = sede;
    }


    //los get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirTectico() {
        return dirTectico;
    }

    public void setDirTectico(String dirTectico) {
        this.dirTectico = dirTectico;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }
}
