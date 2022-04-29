import java.util.HashMap;

public class Compra {
    private HashMap<Producto,Integer> productos;
    private Cliente cliente;
    private Tarjeta tarjeta;
    private String direccion;
    private float precioTotal;

    public Compra(Cliente cliente, Tarjeta tarjeta, String direccion, float precioTotal) {
        this.productos = new HashMap<>();
        this.cliente = cliente;
        this.tarjeta = tarjeta;
        this.direccion = direccion;
        this.precioTotal = precioTotal;
    }

    public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Tarjeta getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(Tarjeta tarjeta) {
        this.tarjeta = tarjeta;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }


    public boolean crearCompra(Carrito carrito, Tarjeta tarjeta){

        HashMap<Producto, Integer> productos = new HashMap<>();

        productos = carrito.getProductos();

        this.productos = productos;

        float precioTotal = 0;
        float precioProducto = 0;
        int cantidadDeProductos = 0;

        for (Producto producto : productos.keySet()) {
            precioProducto = producto.getPrecioUnitario();
            cantidadDeProductos = productos.get(producto);
            precioTotal = precioTotal + (precioProducto * cantidadDeProductos);
        }

        if(this.cliente.isEsPreferencial()){
            precioTotal = precioTotal - (precioTotal * 0.10f);
        }

        this.setPrecioTotal(precioTotal);

        if(tarjeta.isVerificada()){
            this.setTarjeta(tarjeta);
            return true;
        }else{
            return false;
        }

    }

}
