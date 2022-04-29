import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner intInput = new Scanner(System.in);

        System.out.println("1 - Crear Compra");
        System.out.println("9 - Salir");
        int input = intInput.nextInt();
        Producto producto = new Producto("lampara",4500.5f,"electrodomestico",90,"juan");
        Producto producto2 = new Producto("celular",145500f,"electrodomestico",90,"juan");
        HashMap<Producto,Integer> productos = new HashMap<>();
        productos.put(producto,7);
        productos.put(producto2,4);

        Cliente cliente = new Cliente("Mateo", "Congreso 1896", "Libertador 1001", "mateo@gmail.com",true);
        Tarjeta tarjeta = new Tarjeta(4893724,"mañana",true);
        Carrito carrito = new Carrito(productos,cliente);



        if (input == 1){

            Compra compra = new Compra(cliente,null,"constituyentes",0f);
            compra.crearCompra(carrito,tarjeta);

        }

    }
}