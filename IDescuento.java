package Ra7AlvaroAranda.Ejercicios.Inventario;

public interface IDescuento {
void aplicarDescuentoPorcentual(double porcentajeDescuento) throws DescuentoInvalidoException;
 void aplicarDescuentoPorcentajeMaximo(double porcentajeDescuento) throws DescuentoInvalidoException;
}
