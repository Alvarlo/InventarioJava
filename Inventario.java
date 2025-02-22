package Ra7AlvaroAranda.Ejercicios.Inventario;

import java.util.ArrayList;

public class Inventario {
    private ArrayList<ProductoBase> productos;

    public Inventario() {
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(ProductoBase p){
        productos.add(p);
    }
    public void aplicarDescuentoPorCategoria(String categoria, double descuento) {
        for (ProductoBase producto : productos) {
            if (producto.getCategoria().equalsIgnoreCase(categoria)) {
                try {
                    producto.aplicarDescuento(descuento);
                } catch (DescuentoInvalidoException DIE) {
                    System.out.println("No hay productos asociados a esa categoria");
                }
            }
        }
    }


        public double calcularValorTotalInventario () {
            double total = 0;
            for (ProductoBase producto : productos) {
                total += producto.getPrecioFinal();
            }
            return total;
        }

}
