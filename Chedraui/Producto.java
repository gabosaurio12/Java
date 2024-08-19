import java.util.*;

class Producto {
	private String nombre;
	private String tipo;
	private float precio;
	
	public Producto(String n, String t, float p) {
		this.nombre = n;
		this.tipo = t;
		this.precio = p;
	}

	public void setNombre(String n) {
		this.nombre = n;
	}
	public String getNombre() {
		return nombre;
	}

	public void setTipo(String t) {
		this.tipo = t;
	}
	public String getTipo() {
		return tipo;
	}

	public void setPrecio(float p) {
		this.precio = p;
	}
	public float getPrecio() {
		return precio;
	}
}
