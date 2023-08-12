package Alejandro.almacenyverdureria;

public class Main {
    public static void main(String[] args) {


        //creando los productos
        Producto productos[] = {new Lacteo("Leche", 5, 2, 3),
                new Lacteo("Queso", 2, 4, 5), new Fruta("Pera",
                2, 7.8, "Verde"), new Fruta("Manzana", 4, 9.4,
                "Rojo"), new Limpieza("Jabon", 6, "C. Limpieza",
                4.5), new Limpieza("Escoba", 6, "C. Escoba", 0.0),
                new NoPerecible("Jamon", 4, 12, 6), new NoPerecible
                ("Enlatado", 10, 19, 9)
        };

        //for (Producto p : productos) {
          //  System.out.println(p);
        //}

        for (Producto prod : productos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }
    }
}