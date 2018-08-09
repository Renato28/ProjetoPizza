package br.com.coursera.projetopizza;

import java.util.ArrayList;
import java.util.HashMap;

public class Pizza {

	private double preco;
	static int QUANTIDADE_INGREDIENTES = 0;
	public static Pizza contabilizaIngrediente;
	ArrayList<String> lista = new ArrayList<String>();

	public void adicionarIngrediente(String ingrediente) {
		lista.add(ingrediente);
		if (ingrediente.isEmpty()) {
			System.out.println("adicione um ingrediente!");
		}
		contabilizaIngrediente(ingrediente);

	}

	public double getPreco() {
		int contador = this.lista.size();
		if (contador <= 2) {
			this.preco = 15.00;
		} else {
			if (contador >= 3 && contador <= 5) {
				this.preco = 20.00;
			} else {
				this.preco = 23.00;
			}
		}
		return this.preco;
	}

	public static String contabilizaIngrediente(String ingrediente) {

		HashMap<String, Integer> ingredientes = new HashMap<String, Integer>();
		ingredientes.put(ingrediente, QUANTIDADE_INGREDIENTES++);

		for (String ingrediente_adicionado : ingredientes.keySet()) {
			System.out.println(ingredientes.get(ingrediente_adicionado) + " = "
					+ ingrediente_adicionado);
		}
		return ingrediente;
	}
}
