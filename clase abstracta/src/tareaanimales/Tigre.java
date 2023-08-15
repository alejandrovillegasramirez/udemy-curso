package tareaanimales;

class Tigre extends Felino {
    private String especieTigre;


    //constructor para tigre
    public Tigre(String habitat, float altura, float largo,
                 float peso, String nombreCientifico,
                 float garras, int velocidad, String especieTigre) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.especieTigre = especieTigre;
    }


    //getter para tigre
    public String getEspecieTigre() {
        return especieTigre;
    }


    //metodos de tigre
    @Override //sobreescribiendo metodos de la clase padre
    String comer() {
        return "el tigre esta comiendo y es de la especie " + getEspecieTigre();
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
