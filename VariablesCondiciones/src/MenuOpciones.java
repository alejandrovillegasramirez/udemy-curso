import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

public class MenuOpciones {
    public static void main(String[] args) {
        int opcionIndice = 0;
        //mapa para mostrar opciones y se selecciona una opcion
        Map<String, Integer> opciones = new HashMap();
        opciones.put("Actualizar", 1);
        opciones.put("Eliminar", 2);
        opciones.put("Agregar", 3);
        opciones.put("Listar", 4);
        opciones.put("Salir", 5);

        Object[] opArreglo = opciones.keySet().toArray();
        do { //empiezo el do para que sea quede dando vueltas
        Object opcion = JOptionPane.showInputDialog(null,
                "Seleccione un Opción",
                "Mantenedor de Productos",
                JOptionPane.INFORMATION_MESSAGE, null, opArreglo, opArreglo[0]);

            if (opcion == null) {
                JOptionPane.showMessageDialog(null, "Debe seleccionar una operación");
            } else {
                opcionIndice = opciones.get(opcion.toString());
                    // aca un if o switch para las distintas opciones.
                    switch (opcionIndice) { //acá tengo lo que ingreso como opcion
                        case 1:
                            JOptionPane.showMessageDialog(null, "Usuario actualizado correctamente");
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Usuario eliminado correctamente");
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null, "Usuario agregado correctamente");
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Usuario listado correctamente");
                            break;
                        case 5:
                            JOptionPane.showMessageDialog(null, "TERMINANDO EL PROGRAMA GRACIAS");
                            break;
                    }
                }
        }while(opcionIndice != 5);//cierrro el do
        System.exit(0); //finalizo el programa
    }
}
