public class PrimitivosCaracteres {
    public static void main(String[] args) {

        char caracter = '\u0040'; //caractetes UNICODE
        System.out.println("caracter = " + caracter);
        char arroba = 64;
        System.out.println("arroba = " + arroba);

        //CARATERES ESPECIALES COMO ESPACIO, RETROCEDER, SALTO DE LINEA
        char espacio = '\u0020';
        char retroceso = '\b';
        char tabualador = '\t';
        char saltoDeLinea = '\n';
        char retornoCarro = '\r';
        System.out.println("HOLA" + saltoDeLinea + "PARCEROS");



    }
}
