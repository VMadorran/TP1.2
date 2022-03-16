package objetos;

import java.util.ArrayList;

public class Mastercard extends Tarjeta {

	private double descuento = 0.02;

	public Mastercard(long numero) {
		super(numero);
		// TODO Auto-generated constructor stub
	}

	public double calcularGasto(ArrayList<ItemMenu> items) {

		double gastoPlatos = 0;
		double gastoTotal = 0;
		for (ItemMenu i : items) {
			if (i.esPlatoPrincipal())
				gastoPlatos = +i.precioItem();
			gastoTotal = +i.precioItem();
		}

		gastoTotal = +this.calcularDescuento(gastoPlatos) + this.sumarPropina(gastoTotal);
		return gastoTotal;
	}

}
