package objetos;

public class ItemMenu {
	private String descripcion;
	private double precio;

	public ItemMenu(String descripcion, double precio) {
		this.descripcion = descripcion;
		this.precio = precio;
	}

	public boolean esBebida() {
		if (descripcion == "BEBIDA")
			return true;
		return false;
	}

	public boolean esPlatoPrincipal() {
		if (descripcion == "PLATO") {
			return true;
		}
		return false;
	}

	public double precioItem() {
		return this.precio;
	}

}
