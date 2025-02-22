package Ra7AlvaroAranda.Ejercicios.Inventario;

import java.util.Date;

public class ProductoConPromocion extends ProductoBase implements IPromocion{
    private Date fechaInicioPromocion;
    private Date fechaFinalPromocion;

    public ProductoConPromocion(String nombre, String categoria, double precioBase, Date fechaInicioPromocion, Date fechaFinalPromocion) {
        super(nombre, categoria, precioBase);
        this.fechaInicioPromocion = fechaInicioPromocion;
        this.fechaFinalPromocion = fechaFinalPromocion;
    }

    @Override
    public void aplicarPromocion(double porcentajeDescuento) throws DescuentoInvalidoException {
        if (!estaEnPromocion()) {
            System.out.println("Ese producto no está en promoción");
            return;
        }
        if (porcentajeDescuento < 0 || porcentajeDescuento > 100) {
            throw new DescuentoInvalidoException();
        }
        this.descuento = (precioBase * porcentajeDescuento) / 100;
    }

    @Override
    public boolean estaEnPromocion() {
        Date hoy = new Date();
        if (hoy.after(fechaInicioPromocion) && hoy.before(fechaFinalPromocion)){
            return true;
        }else return false;
    }

    @Override
    public double getPrecioFinal() {
        return precioBase - descuento;
    }
}
