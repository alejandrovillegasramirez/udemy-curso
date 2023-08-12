import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Tarea {
    String nombre;
    boolean completada;
    String categoria;

    public Tarea(String nombre, String categoria) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.completada = false;
    }
}

public class ListaTareasApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Tarea> listaTareas = new ArrayList<>();

        while (true) {
            System.out.println("Lista de Tareas");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Marcar tarea como completada");
            System.out.println("3. Eliminar tarea");
            System.out.println("4. Mostrar tareas");
            System.out.println("0. Salir");
            System.out.print("Selecciona una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre de la tarea: ");
                    scanner.nextLine();  // Consumir el salto de línea pendiente
                    String nombreTarea = scanner.nextLine();
                    System.out.print("Categoría de la tarea: ");
                    String categoriaTarea = scanner.nextLine();
                    listaTareas.add(new Tarea(nombreTarea, categoriaTarea));
                    System.out.println("Tarea agregada.");
                    break;
                case 2:
                    // Marcar tarea como completada
                    break;
                case 3:
                    // Eliminar tarea
                    break;
                case 4:
                    System.out.println("Lista de Tareas:");
                    for (int i = 0; i < listaTareas.size(); i++) {
                        Tarea tarea = listaTareas.get(i);
                        System.out.println(i + ". " + tarea.nombre + " - " +
                                (tarea.completada ? "Completada" : "Pendiente") +
                                " - Categoría: " + tarea.categoria);
                    }
                    break;
                case 0:
                    System.out.println("¡Hasta luego!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}
