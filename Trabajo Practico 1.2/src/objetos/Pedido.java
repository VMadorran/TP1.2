package objetos;

import java.util.ArrayList;

public class Pedido {

	private ArrayList<ItemMenu> consumiciones = new ArrayList<ItemMenu>();
	private String estado;
	private static final String confirmado = "CONFIRMADO";
	private static final String noConfirmado = "NO CONFIRMADO";

	public Pedido(ArrayList<ItemMenu> consumiciones) {
		this.consumiciones.addAll(consumiciones);
		this.estado = noConfirmado;
	}

	protected boolean estaConfirmado() {
		if (this.estado.equals(confirmado))
			return true;
		return false;
	}

	public void confirmarPedido() {
		if (!this.estaConfirmado())
			this.estado = confirmado;
		else
			System.out.println("Ya se encuentra confirmado");
	}

	ArrayList<ItemMenu> itemsDelPedido() {
		return this.consumiciones;
	}

}
