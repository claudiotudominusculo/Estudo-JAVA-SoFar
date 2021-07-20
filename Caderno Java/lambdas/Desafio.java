package lambdas;


import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
public static void main(String[] args) {
Locale.setDefault(Locale.US);	
	
	/* Lógica da programação:
	 * 
	 * Function<Produto, Double> precoFinal; 				Recebe um classe "Produto" e retorna valor double
	 * UnaryOperator <Double> impostoMunicipal; 		Recebe o resultado double acima e retorna outro double
	 * UnaryOperator <Double> frete; 								Recebe o resultado double acima e retorna outro double
	 * UnaryOperator <Double> arredondar;					Recebe o resultado double acima e retorna outro double
	 * Function<Double, String> formatar; 						Por fim, recebe o double acima e retorna uma String Formatada
	 */
	
	Function<Produto, Double> precoFinal = 
			produto ->  produto.preco * (1- produto.desconto) ;
			
	UnaryOperator <Double> impostoMunicipal=
			preco -> preco >= 2500 ? preco * 1.085 : preco ;
			
	UnaryOperator <Double> frete=
			preco -> preco >= 3000 ? preco+100 : preco + 500;
			
	UnaryOperator <Double> arredondar=
			preco ->	Double.parseDouble(String.format("%.2f", preco))	;
			
	Function<Double, String> formatar=
			preco -> ("R$"+preco).replace(".", ",");
			
						
			Produto p =new Produto ("iPad", 3235.89, 0.13);
	
	
	String preco = precoFinal
			.andThen(impostoMunicipal)
			.andThen(frete)
			.andThen(arredondar)
			.andThen(formatar)
			.apply(p);
	System.out.println("O preço depois de tota a treta é: " + preco);
	
}
}
