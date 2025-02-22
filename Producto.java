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
        aplicarDescuento((super.getPrecioBase() * porcentajeDescuento / 100));
    }

    @Override
    public void aplicarDescuentoPorcentajeMaximo(double porcentajeDescuento) throws DescuentoInvalidoException {
        if (porcentajeDescuento > 70) { //Porcentaje máximo del 70%
            porcentajeDescuento = 70;
        }
        aplicarDescuentoPorcentual(porcentajeDescuento);
    }

    @Override
    public double getPrecioFinal() {
        return super.getPrecioBase() - super.getDescuento();
    }
}
