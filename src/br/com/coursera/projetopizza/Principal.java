package br.com.coursera.projetopizza;

public class Principal {

	public static void main(String[] args) {

		CarrinhodeCompras c = new CarrinhodeCompras();
		c.adicionarPizza();
		System.out.println("valor total: " + c.getTotalPizza());
		System.out.println("Quantidade de Ingredientes: ");
		Pizza.contabilizaIngrediente("Mussarela");
		Pizza.contabilizaIngrediente("Queijo");
		Pizza.contabilizaIngrediente("Calabresa");

	}

}
