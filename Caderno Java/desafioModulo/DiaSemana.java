package desafioModulo;

import java.util.Scanner;

public class DiaSemana {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
/*		System.out.println("Digite um número!");
		double diaSemana = entrada.nextDouble();
		if (diaSemana > 7 || diaSemana <=0) {
			System.out.println("Não existe dia da semana correspondente!");
			System.out.println("Comece de novo e escolha um número entre 1 e 7");		
		} else if (diaSemana == 1) {
			System.out.println("Equivale à Domingo");
		}else if (diaSemana == 2 ) {
			System.out.println("Equivale à Segunda-Feira");
		} else if (diaSemana == 3) {
			System.out.println("Equivale à Terça-Feira");
		}else if (diaSemana == 4 ) {
			System.out.println("Equivale à Quarta-Feira");
		}else if (diaSemana == 5 ) {
			System.out.println("Equivale à Quinta-Feira");
		}else if (diaSemana == 6 ) {
			System.out.println("Equivale à Sexta-Feira");
		}else  {
			System.out.println("Equivale à Sábado");
		}
	*/
		
		
		System.out.println("Digite um dia da semana" );
		
		
			
		
		String diaSemana =entrada.next().toLowerCase();
		
		
			
		if (diaSemana.equals("domingo")) {
			System.out.println("1");
		}else if (diaSemana.equals("segunda")) {
			System.out.println("2");
		}else if (diaSemana.equals("terça")) {
			System.out.println("3");
		}else if (diaSemana.equals("quarta")) {
			System.out.println("4");
		}else if (diaSemana.equals("quinta")) {
			System.out.println("5");
		}else if (diaSemana.equals("sexta")) {
			System.out.println("6");		
		}else if (diaSemana.equals("sábado")) {
			System.out.println("7");
		}else { 
			System.out.println("Não entendi! Comece de novo");
		}
			
	
		
		entrada.close();
	
	 
	
	}

}
