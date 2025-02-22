package Ra7AlvaroAranda.Ejercicios.Inventario;

import java.util.Date;

public class MainInventario {
    public static void main(String[] args) {
    Inventario inv = new Inventario();
    Producto p1 = new Producto("Asus Tuf F17", "Informática", 1250.99);

    Date fechaInicioPromo1 = new Date(System.currentTimeMillis() - 200000);
    Date fechaFinalPromo1 = new Date(System.currentTimeMillis() + 200000);
    ProductoConPromocion p2 = new ProductoConPromocion("El Nombre del Viento", "Libros", 35, fechaInicioPromo1, fechaFinalPromo1);

    try {
        p1.aplicarDescuentoPorcentual(15);
        p2.aplicarPromocion(30);
    } catch (DescuentoInvalidoException e) {
        System.out.println("Ha habido un error al aplicar descuento: " + e.getMessage());
    }
        inv.agregarProducto(p1);
        inv.agregarProducto(p2);
        System.out.println("Valor total del inventario: " + inv.calcularValorTotalInventario());
    }

}
