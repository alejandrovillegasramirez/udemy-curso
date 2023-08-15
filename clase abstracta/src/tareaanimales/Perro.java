package tareaanimales;

class Perro extends Mamifero {
    private int fuerzaMordida;

    //constructor para perro

    public Perro(String habitat, float altura, float largo,
                 float peso, String nombreCientifico,
                 int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.fuerzaMordida = fuerzaMordida;
    }

    //getter para fuerza mordida
    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    //metodos para el perro
    @Override
    String comer() {
        return "el perro esta comiendo";
    }

    @Override
    String dormir() {
        return "el perro esta durmiendo";
    }

    @Override
    String comunicarse() {
        return "guau";
    }

    @Override
    String correr() {
        return "perro corriendo";
    }
}
