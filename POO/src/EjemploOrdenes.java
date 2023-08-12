import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        //Primero vamos a crear a los clientes que en este caso
        //son 3 porque son 3 órdenes
        Cliente cliente = new Cliente("Alejandro", "Villegas");
        Cliente cliente1 = new Cliente("Camila", "Perez");
        Cliente cliente2 = new Cliente("Alberto", "Posada");


        //ahora creo los productos que son 4
        Producto producto = new Producto("shampoo", "sedal", 15);
        Producto producto1 = new Producto("computador", "intel", 10);
        Producto producto2 = new Producto("papas", "papas inc", 30);
        Producto producto3 = new Producto("gel", "ego company", 8);


        //creo las descripciones de las ordenes
        OrdenCompra ordenCompra = new OrdenCompra("Compra ");
        ordenCompra.setCliente(cliente);
        ordenCompra.setFecha(new Date());

        OrdenCompra ordenCompra1 = new OrdenCompra("Compra 1");
        ordenCompra1.setCliente(cliente1);
        ordenCompra1.setFecha(new Date());

        OrdenCompra ordenCompra2 = new OrdenCompra("Compra 2");
        ordenCompra2.setCliente(cliente2);
        ordenCompra2.setFecha(new Date());


        // Ahora con set agregar los productos a cada orden con addProducto
        ordenCompra.addProducto(producto);
        ordenCompra.addProducto(producto1);
        ordenCompra.addProducto(producto2);
        ordenCompra.addProducto(producto3);

        ordenCompra1.addProducto(producto2);
        ordenCompra1.addProducto(producto3);
        ordenCompra1.addProducto(producto1);
        ordenCompra1.addProducto(producto);

        ordenCompra2.addProducto(producto3);
        ordenCompra2.addProducto(producto2);
        ordenCompra2.addProducto(producto);
        ordenCompra2.addProducto(producto1);

        // Mostrar detalles de las órdenes
        mostrarDetallesOrden(ordenCompra);
        mostrarDetallesOrden(ordenCompra1);
        mostrarDetallesOrden(ordenCompra2);

    }
        //acá se muestran los datos de la orden
        public static void mostrarDetallesOrden(OrdenCompra orden) {
            System.out.println("Descripción: " + orden.getDescripcion());
            System.out.println("Cliente: " + orden.getCliente().getNombre());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Productos:");
            for (Producto p : orden.getProductos()) {
                System.out.println("- Fabricante: " + p.getFabricante() + ", Nombre: " +
                        p.getNombre() + ", Precio: $" + p.getPrecio());
            }
            System.out.println("Gran total: $" + orden.granTotal());
            System.out.println("-----");


    }
}
