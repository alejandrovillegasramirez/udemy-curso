package tareaanimales;

public class Lobo extends Mamifero{
    private String especie;
    private int numeroManada;

    //constructor
    public Lobo(String habitat, float altura, float largo,
                float peso, String nombreCientifico,
                String especie, int numeroManada) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.especie = especie;
        this.numeroManada = numeroManada;
    }


    //getter de lobo
    public String getEspecie() {
        return especie;
    }

    public int getNumeroManada() {
        return numeroManada;
    }

    //metodos
    @Override
    String comer() {
        return "el lobo esta aullando";
    }

    @Override
    String dormir() {
        return "el lobo esta durmiendo";
    }

    @Override
    String comunicarse() {
        return "el lobo se esta comunicando";
    }

    @Override
    String correr() {
        return "el lobo esta comiendo";
    }
}
