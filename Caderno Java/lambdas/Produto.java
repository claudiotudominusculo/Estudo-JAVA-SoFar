package lambdas;

public class Produto {

	
	final String nome;
	final double preco;
	final double desconto;
	
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}


	@Override
	public String toString() {
		return "Produto " + nome + " custa R$ " +( preco * (1-desconto))  ;
	}
	
}
