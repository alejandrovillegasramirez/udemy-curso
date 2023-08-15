package tareaanimales;

abstract class Canino extends Mamifero {
    private String color;
    private float tamanoColmillos;


    //constructor para caninos
    public Canino(String habitat, float altura, float largo, float peso, String nombreCientifico, String color, float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    //getter de la clase abstracta caninos
    public String getColor() {
        return color;
    }

    public float getTamanoColmillos() {
        return tamanoColmillos;
    }

}
