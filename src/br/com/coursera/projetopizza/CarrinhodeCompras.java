package br.com.coursera.projetopizza;

import java.util.ArrayList;

public class CarrinhodeCompras extends Pizza {

	ArrayList<Pizza> lista = new ArrayList<Pizza>();

	public double getTotalPizza() {
		Pizza total_valor = new Pizza();
		double valor = total_valor.getPreco();
		return valor;

	}

	public void adicionarPizza() {

		Pizza p = new Pizza();
		p.adicionarIngrediente("Mussarela");
		p.adicionarIngrediente("Queijo");
		p.adicionarIngrediente("Calabresa");
		lista.add(p);
	}

}
