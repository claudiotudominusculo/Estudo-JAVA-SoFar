package desafioModulo;

import java.util.Scanner;

public class Calc1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite valor 1: ");
		double valor1 = entrada.nextDouble();
		
	System.out.println("Digite valor 2: ");
	double valor2 = entrada.nextDouble();
	
	System.out.println("Qual expressão? [+,-,/,*]");
	String expressao = entrada.next();
	
	double resultado = "+".equals(expressao) ? valor1 + valor2 : 0 ;
	resultado = "-".equals(expressao) ? valor1 - valor2 : resultado;
	resultado = "*".equals(expressao) ? valor1 * valor2 : resultado;
	resultado = "/".equals(expressao) ? valor1 / valor2 : resultado;
			
	
	
	System.out.printf("%.2f %s %.2f = %.2f", valor1 , expressao, valor2 , resultado);
	
	
	
	entrada.close();
	

	

	
	
	}

}
