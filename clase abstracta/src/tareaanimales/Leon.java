package tareaanimales;

class Leon extends Felino {
    private float potenciaRugido;
    private int numeroManada;


    //constructor para leon
    public Leon(String habitat, float altura, float largo, float peso,
                String nombreCientifico, float garras, int velocidad,
                float potenciaRugido) {
        super(habitat, altura, largo, peso, nombreCientifico, garras, velocidad);
        this.potenciaRugido = potenciaRugido;
        this.numeroManada = numeroManada;
    }

    //getter para el león
    public float getPotenciaRugido() {
        return potenciaRugido;
    }

    public int getNumeroManada() {
        return numeroManada;
    }


    //metodos de la clase leon
    @Override
    String comer() {
        return "el leon esta comiendo y tiene una potencia de ruido de " + getPotenciaRugido();
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
