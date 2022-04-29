import java.util.HashMap;

public class Carrito {
    private HashMap<Producto,Integer> productos;
    private Cliente cliente;

    public Carrito(HashMap<Producto, Integer> productos, Cliente cliente) {
        this.productos = productos;
        this.cliente = cliente;
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

}
