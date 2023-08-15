package tareaanimales;

abstract class Felino extends Mamifero {
    private float garras;
    private int velocidad;

    //constructor para felinos
    public Felino(String habitat, float altura, float largo, float peso, String nombreCientifico, float garras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.garras = garras;
        this.velocidad = velocidad;
    }


    //getters de la clase abstracta felinos
    public float getGarras() {
        return garras;
    }

    public int getVelocidad() {
        return velocidad;
    }

}
