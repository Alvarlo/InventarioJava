package Ra7AlvaroAranda.Ejercicios.Inventario;

public class DescuentoInvalidoException extends Exception{
    public DescuentoInvalidoException(){
        super("Ese descuento no es válido");
    }
}
