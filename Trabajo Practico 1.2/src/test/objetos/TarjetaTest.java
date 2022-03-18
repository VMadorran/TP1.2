package test.objetos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import objetos.ComarcaPlus;
import objetos.ItemMenu;
import objetos.Mastercard;
import objetos.Pedido;
import objetos.Tarjeta;
import objetos.Visa;

public class TarjetaTest {

	ArrayList<ItemMenu> bebidas = new ArrayList<ItemMenu>();
	ArrayList<ItemMenu> platos = new ArrayList<ItemMenu>();

	Tarjeta tarjeta = new Tarjeta(123456);
	Tarjeta visa = new Visa(234567);
	Tarjeta mastercard = new Mastercard(345678);
	Tarjeta comarca = new ComarcaPlus(456789);

	@Test
	public void calcularCostoTarjetaVisa() {

		ItemMenu bebidaA = new ItemMenu("gaseosa", 25);
		ItemMenu bebidaB = new ItemMenu("Agua", 25);
		ItemMenu platoA = new ItemMenu("Hamburguesa", 25);
		ItemMenu platoB = new ItemMenu("Pizza", 25);

		bebidas.add(bebidaA);
		bebidas.add(bebidaB);
		platos.add(platoA);
		platos.add(platoB);

		Pedido pedido = new Pedido(bebidas, platos);
		pedido.confirmarPedido();

		assertEquals(100.5, pedido.pagarPedido(visa));
	}

	@Test
	public void calcularCostoTarjetaMastercard() {

		ItemMenu bebidaA = new ItemMenu("gaseosa", 25);
		ItemMenu bebidaB = new ItemMenu("Agua", 25);
		ItemMenu platoA = new ItemMenu("Hamburguesa", 25);
		ItemMenu platoB = new ItemMenu("Pizza", 25);

		bebidas.add(bebidaA);
		bebidas.add(bebidaB);
		platos.add(platoA);
		platos.add(platoB);

		Pedido pedido = new Pedido(bebidas, platos);
		pedido.confirmarPedido();

		assertEquals(101, pedido.pagarPedido(mastercard));
	}

	@Test
	public void calcularCostoTarjetaComarcaPlus() {

		ItemMenu bebidaA = new ItemMenu("gaseosa", 25);
		ItemMenu bebidaB = new ItemMenu("Agua", 25);
		ItemMenu platoA = new ItemMenu("Hamburguesa", 25);
		ItemMenu platoB = new ItemMenu("Pizza", 25);

		bebidas.add(bebidaA);
		bebidas.add(bebidaB);
		platos.add(platoA);
		platos.add(platoB);

		Pedido pedido = new Pedido(bebidas, platos);
		pedido.confirmarPedido();

		assertEquals(100, pedido.pagarPedido(comarca));
	}

	@Test
	public void calcularCostoTarjetaViedma() {

		ItemMenu bebidaA = new ItemMenu("gaseosa", 25);
		ItemMenu bebidaB = new ItemMenu("Agua", 25);
		ItemMenu platoA = new ItemMenu("Hamburguesa", 25);
		ItemMenu platoB = new ItemMenu("Pizza", 25);

		bebidas.add(bebidaA);
		bebidas.add(bebidaB);
		platos.add(platoA);
		platos.add(platoB);

		Pedido pedido = new Pedido(bebidas, platos);
		pedido.confirmarPedido();

		assertEquals(102, pedido.pagarPedido(tarjeta));
	}

}
