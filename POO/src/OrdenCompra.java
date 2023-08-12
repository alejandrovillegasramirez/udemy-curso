import java.util.Date;

public class OrdenCompra {
    private int identificador;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos = new Producto[4];


    //constructor para la descripción
    public OrdenCompra(String descripcion) {
        this.descripcion = descripcion;
    }


    //getter y setter
    public int getIdentificador() {
        return identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    int contadorProductos = 0;
    //para agregar un producto
    public void addProducto(Producto producto) {
        if (contadorProductos < productos.length) {
            productos[contadorProductos] = producto;
            contadorProductos++;
        } else {
            System.out.println("La orden ya tiene la cantidad máxima de productos.");
        }
    }

    //para sumar los prodcutos
    /*public int granTotal(Producto[] productos) {
        int sumaTotal=0;

        for (Producto p: productos) {
            sumaTotal = sumaTotal + p.getPrecio();
        }

        return sumaTotal;

    }*/

    public int granTotal() {
        int sumaTotal = 0;
        for (int i = 0; i < contadorProductos; i++) {
            sumaTotal += productos[i].getPrecio();
        }
        return sumaTotal;
    }

}