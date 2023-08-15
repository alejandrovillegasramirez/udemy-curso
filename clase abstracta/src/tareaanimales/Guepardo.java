package tareaanimales;

class Guepardo extends Felino {

    //constructor de la clase guepardo
    public Guepardo(String habitat, float altura, float largo,
                    float peso, String nombreCientifico,
                    float garras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
    }

    //metodos de la clase guepardo
    @Override
    String comer() {
        return null;
    }

    @Override
    String dormir() {
        return null;
    }

    @Override
    String comunicarse() {
        return null;
    }

    @Override
    String correr() {
        return null;
    }

}
