package Ra7AlvaroAranda.Ejercicios.Inventario;

public abstract class ProductoBase {
    protected String nombre;
    protected String categoria;
    protected double precioBase;
    protected double descuento;

    public ProductoBase(String nombre, String categoria, double precioBase) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precioBase = precioBase;
        this.descuento = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getDescuento() {
        return descuento;
    }

    public abstract double getPrecioFinal();

    public void aplicarDescuento(double descuento) throws DescuentoInvalidoException{
        if (descuento >= 0) {
            this.descuento = descuento;
        }else {
            throw new DescuentoInvalidoException();
        }
    }

}
