package desafioModulo;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
/*		System.out.println("Digite um n�mero!");
		double diaSemana = entrada.nextDouble();
		if (diaSemana > 7 || diaSemana <=0) {
			System.out.println("N�o existe dia da semana correspondente!");
			System.out.println("Comece de novo e escolha um n�mero entre 1 e 7");		
		} else if (diaSemana == 1) {
			System.out.println("Equivale � Domingo");
		}else if (diaSemana == 2 ) {
			System.out.println("Equivale � Segunda-Feira");
		} else if (diaSemana == 3) {
			System.out.println("Equivale � Ter�a-Feira");
		}else if (diaSemana == 4 ) {
			System.out.println("Equivale � Quarta-Feira");
		}else if (diaSemana == 5 ) {
			System.out.println("Equivale � Quinta-Feira");
		}else if (diaSemana == 6 ) {
			System.out.println("Equivale � Sexta-Feira");
		}else  {
			System.out.println("Equivale � S�bado");
		}
	*/
		
		
		System.out.println("Digite um dia da semana" );
		
		
			
		
		String diaSemana =entrada.next().toLowerCase();
		
		
			
		if (diaSemana.equals("domingo")) {
			System.out.println("1");
		}else if (diaSemana.equals("segunda")) {
			System.out.println("2");
		}else if (diaSemana.equals("ter�a")) {
			System.out.println("3");
		}else if (diaSemana.equals("quarta")) {
			System.out.println("4");
		}else if (diaSemana.equals("quinta")) {
			System.out.println("5");
		}else if (diaSemana.equals("sexta")) {
			System.out.println("6");		
		}else if (diaSemana.equals("s�bado")) {
			System.out.println("7");
		}else { 
			System.out.println("N�o entendi! Comece de novo");
		}
			
	
		
		entrada.close();
	
	 
	
	}

}
