package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class OperadorBinario {
	public static void main(String[] args) {
		
		
		BinaryOperator<Double> media = (n1,n2) ->(n1+n2)/2;
		System.out.println(media.apply(9.8, 5.7));
	
		// Com fun��es mais espec�ficas, nao se pode reutiliz�-las dentro de outras
		
		BiFunction<Double, Double, String> resultado = (n1,n2) ->( (n1+n2)/2) >= 7 ? "Aprovado" : "Reprovado";
		
		System.out.println(resultado.apply(8.0, 5.8));
		//N�o sendo poss�vel fazer : 		
		//System.out.println(resultado.andThen(media).apply(8.0, 5.8));
		
		Function<Double, String> conceito = m -> m >= 7 ? "Aprovado" : "Reprovado";
		//Podendo agora ser poss�vel o seguinte:
		System.out.println(media.andThen(conceito).apply(7.0, 7.0));
		

	
	
	}

}
