package tareaanimales;

public class EjemploMamiferos{
    public static void main(String[] args) {

        Mamifero[] mamiferos = new Mamifero[5];

        Mamifero leon = new Leon("africa", 5f, 7.5f, 58, "Sur Africa", 120, 220, 190);
        Mamifero tigre = new Tigre("sabana",5,8.3f,32,"Tigrus",2,32,"Rayado");
        Mamifero lobo = new Lobo("Llanura",4f,21f,25.4f,"lobys","Lobuna",4);
        Mamifero perro = new Perro("casa",5,14,25,"perrius normalius",54);
        Mamifero guepardo = new Guepardo("Sabana",6,25,63,"guepardis normlais",26,200);

        //lleno en cada posicion de mamiferos
        mamiferos[0] = leon;
        mamiferos[1] = tigre;
        mamiferos[2] = lobo;
        mamiferos[3] = perro;
        mamiferos[4] = guepardo;

        //los llamo con un for each
        for (Mamifero animal : mamiferos) {
            //para mostar el nombre normal de cada animal
            if (animal instanceof Leon) {
                System.out.println("Nombre normal: León");
            } else if (animal instanceof Tigre) {
                System.out.println("Nombre normal: Tigre");
            } else if (animal instanceof Lobo) {
                System.out.println("Nombre normal: Lobo");
            } else if (animal instanceof Perro) {
                System.out.println("Nombre normal: Perro");
            } else if (animal instanceof Guepardo) {
                System.out.println("Nombre normal: Guepardo");
            }

            System.out.println("Nombre científico: " + animal.getNombreCientifico());
            System.out.println("Habitat: " + animal.getHabitat());
            System.out.println("Altura: " + animal.getAltura());
            System.out.println("Largo: " + animal.getLargo());
            System.out.println("Peso: " + animal.getPeso());
            System.out.println("Comer: " + animal.comer());
            System.out.println("Dormir: " + animal.dormir());
            System.out.println("Comunicarse: " + animal.comunicarse());
            System.out.println("Correr: " + animal.correr());
            System.out.println("----------------------------------");
        }


    }
}
