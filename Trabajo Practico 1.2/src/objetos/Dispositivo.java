package objetos;

import java.util.ArrayList;

public class Dispositivo {
	private ArrayList<ItemMenu> menu;
	private ArrayList<Pedido> pedidos = new ArrayList<Pedido>();

	public Dispositivo(ArrayList<ItemMenu> menu) {
		this.menu = menu;

	}

	boolean pagarPedido(Pedido pedido, Tarjeta tarjeta) {

		if (pedido.estaConfirmado()) {
			tarjeta.calcularGasto(pedido.itemsDelPedido());
			return true;
		}
		return false;
	}

	void confirmarPedido(Pedido pedido) {
		pedido.confirmarPedido();
	}

}
