package modelos;

public class Producto {
    private String codigo_producto;
    private String nombre_producto;
    private float precio_compra;
    private float precio_venta;
    private int existencia;
    private Categoria categoria;

    public Producto() {}

    public Producto(String codigo_producto, String nombre_producto, float precio_compra, float precio_venta, int existencia, Categoria categoria) {
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.precio_compra = precio_compra;
        this.precio_venta = precio_venta;
        this.existencia = existencia;
        this.categoria = categoria;
    }

    public String getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(String codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public float getPrecio_compra() {
        return precio_compra;
    }

    public void setPrecio_compra(float precio_compra) {
        this.precio_compra = precio_compra;
    }

    public float getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(float precio_venta) {
        this.precio_venta = precio_venta;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public float calcularGanancia(){
        return precio_venta-precio_compra;
    }

    public float calcularMontoVenta(){
        return precio_venta*existencia;
    }

    public float calcularMontoCompra(){
        return precio_compra*existencia;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo_producto='" + codigo_producto + '\'' +
                ", nombre_producto='" + nombre_producto + '\'' +
                ", precio_compra=" + precio_compra +
                ", precio_venta=" + precio_venta +
                ", existencia=" + existencia +
                " , ganancia=" + calcularGanancia() +
                " , montoVenta=" + calcularMontoVenta() +
                " , montoCompra=" + calcularMontoCompra() +
                '}';
    }
}
