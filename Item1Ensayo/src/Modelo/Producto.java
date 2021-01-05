package Modelo;

public class Producto {
		
	private String nombreProducto;
	private String codigo;
	private int precio;
	private int cantidad;
	
	public Producto(String nombreProducto, String codigo, int precio, int cantidad) {
		super();
		this.nombreProducto = nombreProducto;
		this.codigo = codigo;
		this.precio = precio;
		this.cantidad = cantidad;
	}

	public Producto() {
		super();
	}

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [nombreProducto=" + nombreProducto + ", codigo=" + codigo + ", precio=" + precio
				+ ", cantidad=" + cantidad + "]";
	}
	
		

}
