package objetos;

import java.util.ArrayList;

public class ComarcaPlus extends Tarjeta {

	private double descuento = 0.02;

	public ComarcaPlus(long numero) {
		super(numero);
	}

	public double calcularGasto(ArrayList<ItemMenu> items) {
		double gastoTotal = 0;
		for (ItemMenu i : items) {
			gastoTotal = +i.precioItem();
		}
		gastoTotal = +this.calcularDescuento(gastoTotal) + this.sumarPropina(gastoTotal);
		return gastoTotal;
	}
}
