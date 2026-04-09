package modelos;


/**
 * @author labc205
 * @version 1.0
 * @created 06-abr.-2026 21:58:09
 */
public class Producto {

	private String codigo_producto;
	private int existencia;
	private String nombre_producto;
	private float precio_compra;
	private float precio_venta;
	public Categoria m_Categoria;

	public Producto(){

	}

	public void finalize() throws Throwable {

	}
	public float calcularGanancia(){
		return null;
	}

	public float calcularMontoCompra(){
		return null;
	}

	public float calcularMontoVenta(){
		return null;
	}
}//end Producto