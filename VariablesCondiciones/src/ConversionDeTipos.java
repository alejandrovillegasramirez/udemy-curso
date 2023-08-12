public class ConversionDeTipos {
    public static void main(String[] args) {
        int entero = 14;
        String letras;

        letras = Integer.toString(entero);

        System.out.println("letras = " + letras);

        letras = String.valueOf(entero);

    }
}