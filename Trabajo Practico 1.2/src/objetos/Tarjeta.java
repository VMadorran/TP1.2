package objetos;

import java.util.ArrayList;

public class Tarjeta {
	private long numero;
	private double descuento;

	public Tarjeta(long numero) {
		this.numero = numero;
	}

	public double calcularGasto(ArrayList<ItemMenu> items) {

		double gastoTotal = 0;

		for (ItemMenu i : items) {

			gastoTotal = +i.precioItem();
		}
		gastoTotal = +this.sumarPropina(gastoTotal);
		return gastoTotal;
	}

	protected double sumarPropina(double montoTotal) {
		if (montoTotal <= 5000)
			this.calcularPropina(montoTotal, 0.02);
		else if (montoTotal < 10000)
			this.calcularPropina(montoTotal, 0.03);
		else
			this.calcularPropina(montoTotal, 0.05);
		return montoTotal;
	}

	protected double calcularDescuento(double monto) {
		return monto = -(monto * this.descuento);
	}

	protected double calcularPropina(double monto, double porcentaje) {
		monto = +(monto * porcentaje);
		return monto;
	}

}
