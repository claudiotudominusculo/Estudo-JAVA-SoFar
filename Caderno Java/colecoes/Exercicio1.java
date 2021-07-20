package colecoes;

import java.util.Arrays;
import java.util.Scanner;

public class Exercicio1 {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Quantas notas desejas entrar?");
		int numArray = entrada.nextInt();
		
		double[] notas = new double[numArray];
		
		for (int i = 0 ; i < notas.length ; i++) {
			System.out.println("Digite a nota " + (i+1));
			notas[i] = entrada.nextDouble();
			
		}
		
		System.out.println(Arrays.toString(notas));
		
		
		
			double totalNotas = 0;
			
			for (double media: notas) {
				totalNotas += media;
			}
System.out.println(totalNotas / notas.length);
		entrada.close();
		
	}

}
