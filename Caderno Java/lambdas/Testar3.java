package lambdas;

import java.util.function.BinaryOperator;

public class Testar3 {
	public static void main(String[] args) {
		
		
		//Função inlcuída na interface preset
		//BinaryOperator
		
		
		BinaryOperator<Double> calc = (x,y) ->{return x+y;};
		System.out.println(calc.apply(2.0, 3.0));

		
		
		calc = (x,y) -> x*y;
		System.out.println(calc.apply(2.0, 3.0));
		
		
	}

}
