package Ra7AlvaroAranda.Ejercicios.Inventario;

public class Producto extends ProductoBase implements IDescuento{


    public Producto(String nombre, String categoria, double precioBase) {
        super(nombre, categoria, precioBase);
    }

    @Override
    public void aplicarDescuentoPorcentual(double porcentajeDescuento) throws DescuentoInvalidoException {
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new DescuentoInvalidoException();
        }
        this.descuento = (precioBase * porcentajeDescuento) / 100;
    }

    @Override
    public void aplicarDescuentoPorcentajeMaximo(double porcentajeDescuento) throws DescuentoInvalidoException {
        double maxDescuento = precioBase * 0.7; // Límite máximo del 70%
        double descuentoAplicado = (precioBase * porcentajeDescuento) / 100;
        this.descuento = Math.min(descuentoAplicado, maxDescuento);
    }

    @Override
    public double getPrecioFinal() {
        return precioBase - descuento;
    }
}
