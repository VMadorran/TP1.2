package objetos;

import java.util.ArrayList;

public class Visa extends Tarjeta {
	private double descuento = 0.02;

	public Visa(long numero) {
		super(numero);

	}

	public double calcularGasto(ArrayList<ItemMenu> items) {

		double gastoTotal = 0;
		double gastoBebida = 0;
		for (ItemMenu i : items) {
			if (i.esBebida())
				gastoBebida = +i.precioItem();
			else
				gastoTotal = +i.precioItem();
		}

		gastoTotal = +this.calcularDescuento(gastoBebida);
		return gastoTotal;
	}

}
