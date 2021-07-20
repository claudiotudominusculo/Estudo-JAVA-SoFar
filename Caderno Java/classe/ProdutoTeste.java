package classe;

public class ProdutoTeste {
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook", 1200.50);
		Produto p2 = new Produto("Tv Samsung ", 2999 );
		Produto p3 = new Produto("SmartWatch", 650.35 );
		
		//Produto.desconto = 0.35;
		
		
		System.out.print(p1.nome);
		System.out.println("  R$ " + p1.preco);
		System.out.print(p2.nome);
		System.out.println("  R$ " + p2.preco);
		
		
		System.out.print(p3.nome);
		System.out.println("  R$ " + p3.preco);
				
		double precoFinal1= p1.precoComDesconto();
		double precoFinal2=p2.precoComDesconto();
		double precoFinal3=p3.precoComDesconto();
		double mediaCarrinho = ((precoFinal1+precoFinal2)/2);
 	
		
	//	System.out.printf("\nTanto o %s quanto o %s tem desconto de %.2f e %.2f respectivamente. "
	//			,p1.nome , p2.nome, p1.desconto, p2.desconto);
	System.out.printf("\nSeu carrinho tem uma média de R$ %.2f.",mediaCarrinho);
	System.out.println("\n\n O preço do SmartWatch com desconto é R$ " + precoFinal3);
	System.out.println("\n\n O preço da Tv Samsung com desconto é R$ " + precoFinal2);
	
	//System.out.println("\n "+ precoFinal2);
	//System.out.println("\n "+ precoFinal1);
	}

}
