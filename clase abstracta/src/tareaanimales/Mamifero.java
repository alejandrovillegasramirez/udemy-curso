package tareaanimales;

abstract class Mamifero {
    private String habitat;
    private float altura;
    private float largo;
    private float peso;
    private String nombreCientifico;

    //construcor
    public Mamifero(String habitat, float altura, float largo, float peso, String nombreCientifico) {
        this.habitat = habitat;
        this.altura = altura;
        this.largo = largo;
        this.peso = peso;
        this.nombreCientifico = nombreCientifico;
    }

    //getter
    public String getHabitat() {
        return habitat;
    }

    public float getAltura() {
        return altura;
    }

    public float getLargo() {
        return largo;
    }

    public float getPeso() {
        return peso;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    //metodos abstractos
    //comer(), dormir(), correr(), comunicarse(), todos devuelven string
    abstract String comer();
    abstract String dormir();
    abstract String comunicarse();
    abstract String correr();

}
