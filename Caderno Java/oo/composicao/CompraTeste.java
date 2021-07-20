package oo.composicao;

public class CompraTeste {
public static void main(String[] args) {
	
	Compra compra1 = new Compra ();
	compra1.cliente = "Cláudio";
	
	compra1.itens.add(new Item("Caderno",8, 10.5));
	compra1.itens.add(new Item("Borracha",3, 2.8));
	compra1.itens.add(new Item("Lapiseira",1, 25.7));
	compra1.itens.add(new Item("Agenda",23, 5.8));
	
	System.out.println(compra1.ttal());
	System.out.println(compra1.itens.size());
}
}
