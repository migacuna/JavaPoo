package Modelo;

import java.util.List;

public class DetalleOrden {
	
	private Cliente cliente;
	private List<Producto> productos;
	
	public DetalleOrden(Cliente cliente, List<Producto> productos) {
		super();
		this.cliente = cliente;
		this.productos = productos;
	}

	public DetalleOrden() {
		super();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Producto> getProductos() {
		return productos;
	}

	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "DetalleOrden [cliente=" + cliente + ", productos=" + productos + "]";
	}
	
	

}
