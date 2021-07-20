package oo.composicao.desafio;

public class Sistema {
public static void main(String[] args) {
	
	Cliente cliente = new Cliente ("Cláudio Rocha Junior");
	Compra compra1 = new Compra();
	Compra compra2 = new Compra();
	// Item item1 = new Item(new Produto ("CellPhone", 1500), 3);
	
	
	compra1.adicionarItem("Caneta", 5.5 , 10 );		
	compra1.adicionarItem(new Produto ("Notebook", 1500), 2);
	compra2.adicionarItem("Caderno", 2.5, 6);
	compra2.adicionarItem("Presto-barba", 3, 2);
	
	cliente.compras.add(compra1);
	cliente.adicionarCompra(compra2);

	
	System.out.println(cliente.obterValorTotal());
}
}
