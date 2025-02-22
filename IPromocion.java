package Ra7AlvaroAranda.Ejercicios.Inventario;

public interface IPromocion {
    void aplicarPromocion(double porcentajeDescuento) throws DescuentoInvalidoException;
    boolean estaEnPromocion();
}
